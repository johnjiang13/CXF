package com.isoftstone.cxf.demo01.service;

import javax.xml.ws.Endpoint;


/**
 * 
 * @ClassName: ServerSimple 
 * @Description: webservice ������
 * @author <a href="mailto:wangyj0898@126.com">Jim Wang</a>
 * @date 2013��10��21�� ����4:48:31 
 *
 */
public class ServerSimple {

	protected ServerSimple() {
		System.out.println("Starting Server");
		HelloWorld hwi = new HelloWorld();
		String address = "http://localhost:9000/helloWorld";
		Endpoint.publish(address, hwi);
	}

	public static void main(String[] args) throws Exception {
		new ServerSimple();
		System.out.println("Server ready....");
		Thread.sleep(60 * 1000);
		System.out.println("Server exiting");
		System.exit(0);
	}
}
