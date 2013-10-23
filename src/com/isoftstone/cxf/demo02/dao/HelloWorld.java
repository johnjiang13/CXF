package com.isoftstone.cxf.demo02.dao;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	 public String sayHello(String username);  
}
