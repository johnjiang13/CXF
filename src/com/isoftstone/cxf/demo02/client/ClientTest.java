package com.isoftstone.cxf.demo02.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.isoftstone.cxf.demo02.dao.Hello;

public class ClientTest {

	public static void main(String[] args) {

		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		// ��ȡ��������

		factoryBean.setAddress("http://localhost:8081/hello");
		factoryBean.setServiceClass(Hello.class);

		Hello hello = (Hello) factoryBean.create();

		System.out.println(hello.sayHello("��гdota"));
	}
}
