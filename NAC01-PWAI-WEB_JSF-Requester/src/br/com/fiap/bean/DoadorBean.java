package br.com.fiap.bean;

import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.apache.axis2.AxisFault;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import br.com.fiap.bo.AlterarSenha;
import br.com.fiap.bo.DoadorBODBCommitExceptionException;
import br.com.fiap.bo.DoadorBOExceptionException;
import br.com.fiap.bo.DoadorBOIdNotFoundExceptionException;
import br.com.fiap.bo.DoadorBOPasswordExceptionException;
import br.com.fiap.bo.DoadorBOStub;
import br.com.fiap.bo.FindById;
import br.com.fiap.bo.FindByIdResponse;
import br.com.fiap.bo.Logar;
import br.com.fiap.bo.LogarResponse;
import br.com.fiap.bo.SearchByEmail;
import br.com.fiap.bo.SearchByEmailResponse;
import br.com.fiap.bo.Update;
import br.com.fiap.to.xsd.DoadorTO;

@ManagedBean
@SessionScoped
public class DoadorBean {

	private DoadorTO doador;
	private String senha;
	private String senha2;
	private String senhaAnterior;
	private DoadorBOStub stub;
	private int param1; //Id do doador
	
	@PostConstruct
	private void init(){
		doador = new DoadorTO();
		try {
			stub = new DoadorBOStub();
		} catch (AxisFault e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Servidor Indisponível. Tente novamente mais tarde", ""));
		}
	}
		
	public void atualizar() {
		Update update = new Update();
		update.setDoador(doador);
		
		try {
			stub = new DoadorBOStub();
			stub.update(update);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Doador Atualizado!", ""));
		} catch (AxisFault e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		} catch (RemoteException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		} catch (DoadorBODBCommitExceptionException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		}
	}
	
	public void atualizarSenha() {
		AlterarSenha alterarSenha = new AlterarSenha();
		System.out.println(doador.getSenha());
		alterarSenha.setDoador(doador);
		alterarSenha.setSenha1(senha);
		alterarSenha.setSenha2(senha2);
		alterarSenha.setSenhaAnterior(senhaAnterior);
		
		try {
			stub.alterarSenha(alterarSenha);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Senha Alterada!", ""));
		} catch (RemoteException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
			e.printStackTrace();
		} catch (DoadorBODBCommitExceptionException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
			e.printStackTrace();
		} catch (DoadorBOIdNotFoundExceptionException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
			e.printStackTrace();
		} catch (DoadorBOPasswordExceptionException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
			e.printStackTrace();
		}
	}
	
	public String carregarDados() {
		FindById findById = new FindById();
		findById.setId(param1);
		try {
			stub = new DoadorBOStub();
			FindByIdResponse response = stub.findById(findById);
			doador = response.get_return();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
        //FacesContext.getCurrentInstance().getExternalContext().getFlash().put("doador", doador);
		if(doador.getTipoDoador().equals("FISICA")) {
			return "/editar-doador.xhtml?faces-redirect=true";
		} else if(doador.getTipoDoador().equals("JURIDICA")){
			return "/editar-doador-juridica.xhtml?faces-redirect=true";
		} else {
			return "/administrador.xhtml?faces-redirect=true";
		}
	}

	public String logar() {
		Logar logar = new Logar();
		logar.setEmail(doador.getEmail());
		logar.setSenha(doador.getSenha());
		
		try {
			LogarResponse response = stub.logar(logar);
			
			param1 = response.get_return().getId();
			
			return carregarDados();
		} catch (RemoteException e) {
		    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sistema Indisponível", "Contate o administrador."));
			e.printStackTrace();
		} catch (DoadorBOExceptionException e) {
			e.printStackTrace();
		    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
		}
		return "login-doador";
	}
	
	public void recuperarSenha() {			
		HtmlEmail email = new HtmlEmail();
		email.setSSLOnConnect(true);
		email.setHostName("smtp.gmail.com");
		email.setSslSmtpPort("465");
		email.setAuthenticator(new DefaultAuthenticator("qmquer@gmail.com", "fiap2014"));
		
	    try {
	    	SearchByEmail searchByEmail = new SearchByEmail();	
	    	searchByEmail.setEmail(doador.getEmail());
			
			DoadorBOStub stub = new DoadorBOStub();
			SearchByEmailResponse response = stub.searchByEmail(searchByEmail);
			DoadorTO[] d = response.get_return();
			if(d != null) {	// se tiver algum email no banco envia o email		
				// Gera uma nova senha em função do calendar
				MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
				Base64 encoder = new Base64();
				byte[] bytes = messageDigest.digest(Calendar.getInstance().toString().getBytes());
				String result = encoder.encodeAsString(bytes);
				result = result.substring(0, 10);
				d[0].setSenha(result);
				
				Update update = new Update();
				update.setDoador(d[0]);
				
				stub.update(update);
				
				email.setFrom("qmquer@gmail.com", "QMQ");
				//email.setDebug(true); 
			    email.setSubject("Assunto do E-mail");
			    
			    StringBuilder builder = new StringBuilder();
			    builder.append("<h1>Quem Me Quer</h1> <br/>");
			    builder.append("<p>Sua nova senha foi redefinida.</p>");
			    builder.append("Senha: " + d[0].getSenha());
			             
			    email.setHtmlMsg( builder.toString() );
			    email.addTo(doador.getEmail());
			    		    			
				email.send();
			} 			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Email enviado!",""));
		} catch (EmailException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		} catch (RemoteException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		} catch (DoadorBODBCommitExceptionException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		}    
	}
	
	public String sair() {
        FacesContext facesContext = FacesContext.getCurrentInstance();    
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);    
        session.invalidate();    
		return "login-doador";
	}
	
	public DoadorTO getDoador() {
		return doador;
	}
	public void setDoador(DoadorTO doador) {
		this.doador = doador;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha2() {
		return senha2;
	}

	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}

	public String getSenhaAnterior() {
		return senhaAnterior;
	}

	public void setSenhaAnterior(String senhaAnterior) {
		this.senhaAnterior = senhaAnterior;
	}

	public int getParam1() {
		return param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}	
	
}
