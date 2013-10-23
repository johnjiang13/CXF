package com.isoftstone.cxf.iteye.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.isoftstone.cxf.iteye.entry.User;

@WebService(endpointInterface = "com.isoftstone.cxf.iteye.service.HelloService", serviceName = "HelloService", portName = "HelloServicePort")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHi(String text) {
		// TODO Auto-generated method stub
		System.out.println("sayHi called....");
		return "Hi: " + text;
	}

	@Override
	public String getUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("sayUser called....");
		return "User:[id=" + user.getId() + "][name=" + user.getName() + "]"; 
	}

	@Override
	public List<User> getListUser() {
		// TODO Auto-generated method stub
		System.out.println("getListUser called...");  
        List<User> lst = new ArrayList<User>();  
        lst.add(new User(2, "u2"));  
        lst.add(new User(3, "u3"));  
        lst.add(new User(4, "u4"));  
        lst.add(new User(5, "u5"));  
        lst.add(new User(6, "u6"));  
        return lst;
	}

}
