package br.com.fiap.chart;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.apache.axis2.AxisFault;
import org.primefaces.model.chart.PieChartModel;

import br.com.fiap.bo.DoadorBOStub;
import br.com.fiap.bo.FindAll;
import br.com.fiap.bo.FindAllResponse;
import br.com.fiap.to.xsd.DoadorTO;

@ManagedBean
public class StatusChart {
 
    private PieChartModel pieModel2;
	private DoadorBOStub stub;
	private int ativo;
	private int inativo;
 
    @PostConstruct
    public void init() {
    	try {
			stub = new DoadorBOStub();
	        createPieModels();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
    }
     
    public PieChartModel getPieModel2() {
        return pieModel2;
    }
     
    private void createPieModels() {
        createPieModel2();
    }
 
    private void createPieModel2() {
        pieModel2 = new PieChartModel();
        
        FindAll findAll = new FindAll();
        try {
        	FindAllResponse response = stub.findAll(findAll);
        	List<DoadorTO> lista = Arrays.asList(response.get_return());
			for (DoadorTO doador : lista) {
				if(doador.getStatus().equals("ATIVO")) {
					ativo++;
				} else if(doador.getStatus().equals("INATIVO")) {
					inativo++;
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
        
        pieModel2.set("Ativo", ativo);
        pieModel2.set("Inativo", inativo);
         
        pieModel2.setTitle("Ativo / Inativo");
        pieModel2.setLegendPosition("e");
        pieModel2.setFill(false);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(150);
    }
}