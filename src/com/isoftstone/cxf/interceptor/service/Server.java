package com.isoftstone.cxf.interceptor.service;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.phase.Phase;


public class Server {

	protected Server(){
		
		HelloWorld hwi = new HelloWorld();
		JaxWsServerFactoryBean svrFactor = new JaxWsServerFactoryBean();
		svrFactor.setServiceClass(HelloWorld.class);
		String address = "http://localhost:9000/helloWorld";
		svrFactor.setAddress(address);
		svrFactor.setServiceBean(hwi);
		svrFactor.getInInterceptors().add(new MyInterceptor());
		svrFactor.getInInterceptors().add(new LoggingInInterceptor());
		svrFactor.getInInterceptors().add(new MyInterceptor(Phase.SEND));
		svrFactor.getInInterceptors().add(new LoggingOutInterceptor());
		svrFactor.create();
	}
	
	public static void main(String[] args) throws Exception {
		new Server();
		System.out.println("Server ready....");
		Thread.sleep(60 * 1000);
		System.out.println("Server exiting");
		System.exit(0);
	}
}
