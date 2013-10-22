package com.isoftstone.cxf.demo02.action;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.isoftstone.cxf.demo02.service.HelloWorldImpl;

public class HelloTest {

	public static void main(String[] args) {

		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();

		// Web����ĵ�ַ

		factoryBean.setAddress("http://localhost:8081/hello");

		// Web���������ýӿ�

		factoryBean.setServiceClass(HelloWorldImpl.class);

		Server server = factoryBean.create();

		server.start();

	}

}
