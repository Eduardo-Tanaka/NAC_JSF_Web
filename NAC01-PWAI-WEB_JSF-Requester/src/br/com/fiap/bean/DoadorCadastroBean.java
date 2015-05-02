package br.com.fiap.bean;

import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.apache.axis2.AxisFault;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import br.com.fiap.bo.Create;
import br.com.fiap.bo.CreateResponse;
import br.com.fiap.bo.DoadorBODBCommitExceptionException;
import br.com.fiap.bo.DoadorBOEmailNomeExceptionException;
import br.com.fiap.bo.DoadorBOPasswordExceptionException;
import br.com.fiap.bo.DoadorBOStub;
import br.com.fiap.bo.DoadorBOTipoDoadorExceptionException;
import br.com.fiap.bo.FindById;
import br.com.fiap.bo.FindByIdResponse;
import br.com.fiap.bo.Update;
import br.com.fiap.to.xsd.DoadorTO;

@ManagedBean
@RequestScoped
public class DoadorCadastroBean {

	private DoadorTO doador;
	private String senha;
	private DoadorBOStub stub;
	private int param1;
	
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
	
	public void ativar() {
		FindById findById = new FindById();
		findById.setId(param1);
		try {
			DoadorBOStub stub = new DoadorBOStub();
			stub = new DoadorBOStub();
			FindByIdResponse response = stub.findById(findById);
			doador = response.get_return();
			doador.setStatus("ATIVO");
			Update update = new Update();
			update.setDoador(doador);
			stub.update(update);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (DoadorBODBCommitExceptionException e) {
			e.printStackTrace();
		}
	}
	
	public void cadastrar() {
		Create create = new Create();
		create.setDoador(doador);
		create.setSenha2(senha);
		
		try {				
			CreateResponse c = stub.create(create);
		
			HtmlEmail email = new HtmlEmail();
			email.setSSLOnConnect(true);
			email.setHostName("smtp.gmail.com");
			email.setSslSmtpPort("465");
			email.setAuthenticator(new DefaultAuthenticator("qmquer@gmail.com", "fiap2014"));
			
		    email.setFrom("qmquer@gmail.com", "QMQ");
		    //email.setDebug(true); 
		    email.setSubject("Assunto do E-mail");
		    
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			Base64 encoder = new Base64();
			byte[] bytes = messageDigest.digest(doador.getEmail().getBytes());
			String result = encoder.encodeAsString(bytes);
			byte[] bytes2 = messageDigest.digest(String.valueOf(doador.getId()).getBytes());
			String result2 = encoder.encodeAsString(bytes2);
		    
		    StringBuilder builder = new StringBuilder();
		    builder.append("<h1>Bem vindo ao Quem Me Quer!</h1> <br/>");
		    builder.append("<p>Clique no link para ativar sua conta.</p>");
		    builder.append("http://localhost:8090/NAC01-PWAI-WEB_JSF-Requester/faces/ativar-doador.xhtml?p="+result+"qMQ"+c.get_return().getId()+"qMQ"+result2+"<br>");
		    builder.append("<br/>Obrigado!");
		             
		    email.setHtmlMsg( builder.toString() );
		    email.addTo(doador.getEmail());
		    		    			
			email.send();
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Doador Cadastrado! Cheque seu email para ativar sua conta.", ""));
		} catch (EmailException e) {
		    e.printStackTrace();
		    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Email não enviado", ""));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		} catch (DoadorBODBCommitExceptionException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		} catch (DoadorBOPasswordExceptionException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		} catch (DoadorBOEmailNomeExceptionException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Contate o administrador."));
			e.printStackTrace();
		} catch (DoadorBOTipoDoadorExceptionException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
			e.printStackTrace();
		}
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

	public int getParam1() {
		return param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}
}
