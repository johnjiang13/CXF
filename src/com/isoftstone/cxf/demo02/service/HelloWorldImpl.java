package com.isoftstone.cxf.demo02.service;

import javax.jws.WebService;

import com.isoftstone.cxf.demo02.dao.HelloWorld;

@WebService
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String username) {
		
		System.out.println("say hello is called!");
		return "Hello" + username;
	}

}
