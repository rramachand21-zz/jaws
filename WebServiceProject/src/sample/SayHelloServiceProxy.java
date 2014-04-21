package sample;

public class SayHelloServiceProxy implements sample.SayHelloService {
  private String _endpoint = null;
  private sample.SayHelloService sayHelloService = null;
  
  public SayHelloServiceProxy() {
    _initSayHelloServiceProxy();
  }
  
  public SayHelloServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSayHelloServiceProxy();
  }
  
  private void _initSayHelloServiceProxy() {
    try {
      sayHelloService = (new sample.SayHelloServiceServiceLocator()).getSayHelloService();
      if (sayHelloService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sayHelloService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sayHelloService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sayHelloService != null)
      ((javax.xml.rpc.Stub)sayHelloService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public sample.SayHelloService getSayHelloService() {
    if (sayHelloService == null)
      _initSayHelloServiceProxy();
    return sayHelloService;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (sayHelloService == null)
      _initSayHelloServiceProxy();
    return sayHelloService.helloWorld();
  }
  
  
}