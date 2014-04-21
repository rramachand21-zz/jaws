/**
 * SayHelloServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sample;

public class SayHelloServiceSoapBindingSkeleton implements sample.SayHelloService, org.apache.axis.wsdl.Skeleton {
    private sample.SayHelloService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("helloWorld", _params, new javax.xml.namespace.QName("http://sample", "helloWorldReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://sample", "helloWorld"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("helloWorld") == null) {
            _myOperations.put("helloWorld", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("helloWorld")).add(_oper);
    }

    public SayHelloServiceSoapBindingSkeleton() {
        this.impl = new sample.SayHelloServiceSoapBindingImpl();
    }

    public SayHelloServiceSoapBindingSkeleton(sample.SayHelloService impl) {
        this.impl = impl;
    }
    public java.lang.String helloWorld() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.helloWorld();
        return ret;
    }

}
