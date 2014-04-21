/**
 * SayHelloServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sample;

public class SayHelloServiceServiceLocator extends org.apache.axis.client.Service implements sample.SayHelloServiceService {

    public SayHelloServiceServiceLocator() {
    }


    public SayHelloServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SayHelloServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SayHelloService
    private java.lang.String SayHelloService_address = "http://javawebservice.azurewebsites.net/WebServiceProject/services/SayHelloService";

    public java.lang.String getSayHelloServiceAddress() {
        return SayHelloService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SayHelloServiceWSDDServiceName = "SayHelloService";

    public java.lang.String getSayHelloServiceWSDDServiceName() {
        return SayHelloServiceWSDDServiceName;
    }

    public void setSayHelloServiceWSDDServiceName(java.lang.String name) {
        SayHelloServiceWSDDServiceName = name;
    }

    public sample.SayHelloService getSayHelloService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SayHelloService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSayHelloService(endpoint);
    }

    public sample.SayHelloService getSayHelloService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            sample.SayHelloServiceSoapBindingStub _stub = new sample.SayHelloServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSayHelloServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSayHelloServiceEndpointAddress(java.lang.String address) {
        SayHelloService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (sample.SayHelloService.class.isAssignableFrom(serviceEndpointInterface)) {
                sample.SayHelloServiceSoapBindingStub _stub = new sample.SayHelloServiceSoapBindingStub(new java.net.URL(SayHelloService_address), this);
                _stub.setPortName(getSayHelloServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SayHelloService".equals(inputPortName)) {
            return getSayHelloService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sample", "SayHelloServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sample", "SayHelloService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SayHelloService".equals(portName)) {
            setSayHelloServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
