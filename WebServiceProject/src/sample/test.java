package sample;

import java.rmi.RemoteException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayHelloServiceProxy proxy = new SayHelloServiceProxy("http://javawebservice.azurewebsites.net/WebServiceProject/services/SayHelloService");
		try {
			System.out.print(proxy.helloWorld());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
