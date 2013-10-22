package com.isoftstone.cxf.demo01.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IhelloWorld {

	public String sayHi(@WebParam(name = "text") String text);
}
