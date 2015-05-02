package br.com.fiap.chart;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.apache.axis2.AxisFault;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

import br.com.fiap.bo.DoadorBOStub;
import br.com.fiap.bo.FindAll;
import br.com.fiap.bo.FindAllResponse;
import br.com.fiap.to.xsd.DoadorTO;

@ManagedBean
public class TipoDoadorChart {
 
    private BarChartModel tipoDoador;
	private DoadorBOStub stub;
	private int fisica;
	private int juridica;
 
    @PostConstruct
    public void init() {
    	try {
			stub = new DoadorBOStub();
	        createBarModels();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
    }
 
    public BarChartModel getTipoDoador() {
        return tipoDoador;
    }
 
    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        FindAll findAll = new FindAll();
        try {
        	FindAllResponse response = stub.findAll(findAll);
        	List<DoadorTO> lista = Arrays.asList(response.get_return());
			for (DoadorTO doador : lista) {
				if(doador.getTipoDoador().equals("FISICA")) {
					fisica++;
				} else if(doador.getTipoDoador().equals("JURIDICA")) {
					juridica++;
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
        
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Física");
        boys.set("", fisica);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Jurídica");
        girls.set("", juridica);
 
        model.addSeries(boys);
        model.addSeries(girls);
         
        return model;
    }
     
    private void createBarModels() {
        createBarModel();
    }
     
    private void createBarModel() {
    	tipoDoador = initBarModel();
         
    	tipoDoador.setTitle("Gráfico Física / Jurídica");
    	tipoDoador.setLegendPosition("ne");
         
        Axis xAxis = tipoDoador.getAxis(AxisType.X);
        xAxis.setLabel("Tipo de Doador");
         
        Axis yAxis = tipoDoador.getAxis(AxisType.Y);
        yAxis.setLabel("Quantidade");
        yAxis.setMin(0);
        yAxis.setMax(fisica+juridica+10);
    }
     
}
