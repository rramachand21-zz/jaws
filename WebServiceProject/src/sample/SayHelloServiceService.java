/**
 * SayHelloServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sample;

public interface SayHelloServiceService extends javax.xml.rpc.Service {
    public java.lang.String getSayHelloServiceAddress();

    public sample.SayHelloService getSayHelloService() throws javax.xml.rpc.ServiceException;

    public sample.SayHelloService getSayHelloService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
