
/**
 * DoadorBOCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package br.com.fiap.bo;

    /**
     *  DoadorBOCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DoadorBOCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DoadorBOCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DoadorBOCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for findById method
            * override this method for handling normal response from findById operation
            */
           public void receiveResultfindById(
                    br.com.fiap.bo.FindByIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findById operation
           */
            public void receiveErrorfindById(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for alterarSenha method
            * override this method for handling normal response from alterarSenha operation
            */
           public void receiveResultalterarSenha(
                    br.com.fiap.bo.AlterarSenhaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from alterarSenha operation
           */
            public void receiveErroralterarSenha(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logar method
            * override this method for handling normal response from logar operation
            */
           public void receiveResultlogar(
                    br.com.fiap.bo.LogarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logar operation
           */
            public void receiveErrorlogar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delete method
            * override this method for handling normal response from delete operation
            */
           public void receiveResultdelete(
                    br.com.fiap.bo.DeleteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delete operation
           */
            public void receiveErrordelete(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findAll method
            * override this method for handling normal response from findAll operation
            */
           public void receiveResultfindAll(
                    br.com.fiap.bo.FindAllResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findAll operation
           */
            public void receiveErrorfindAll(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkEmail method
            * override this method for handling normal response from checkEmail operation
            */
           public void receiveResultcheckEmail(
                    br.com.fiap.bo.CheckEmailResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkEmail operation
           */
            public void receiveErrorcheckEmail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for update method
            * override this method for handling normal response from update operation
            */
           public void receiveResultupdate(
                    br.com.fiap.bo.UpdateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from update operation
           */
            public void receiveErrorupdate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for create method
            * override this method for handling normal response from create operation
            */
           public void receiveResultcreate(
                    br.com.fiap.bo.CreateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from create operation
           */
            public void receiveErrorcreate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for searchByEmail method
            * override this method for handling normal response from searchByEmail operation
            */
           public void receiveResultsearchByEmail(
                    br.com.fiap.bo.SearchByEmailResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from searchByEmail operation
           */
            public void receiveErrorsearchByEmail(java.lang.Exception e) {
            }
                


    }
    