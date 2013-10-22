package com.isoftstone.cxf.demo01.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.isoftstone.cxf.demo01.service.IhelloWorld;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(IhelloWorld.class);
		factory.setAddress("http://localhost:9000/helloWorld");

		IhelloWorld client = (IhelloWorld) factory.create();
		System.out.println("Invoke sayHi()....");
		
		System.out.println(client.sayHi("admin"));
		System.exit(0);
	}
}
