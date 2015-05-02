
/**
 * DoadorBOPasswordCheckException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.fiap.bo;

public class DoadorBOPasswordCheckException extends java.lang.Exception{

    private static final long serialVersionUID = 1429642552280L;
    
    private br.com.fiap.bo.DoadorBOPasswordCheck faultMessage;

    
        public DoadorBOPasswordCheckException() {
            super("DoadorBOPasswordCheckException");
        }

        public DoadorBOPasswordCheckException(java.lang.String s) {
           super(s);
        }

        public DoadorBOPasswordCheckException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DoadorBOPasswordCheckException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.fiap.bo.DoadorBOPasswordCheck msg){
       faultMessage = msg;
    }
    
    public br.com.fiap.bo.DoadorBOPasswordCheck getFaultMessage(){
       return faultMessage;
    }
}
    