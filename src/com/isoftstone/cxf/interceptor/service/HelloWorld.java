package com.isoftstone.cxf.interceptor.service;

import javax.jws.WebParam;
import javax.jws.WebService;


/**
 * 
 * @ClassName: HelloWorld 
 * @Description: WebService����˵�ʵ���� 
 * @author <a href="mailto:wangyj0898@126.com">Jim Wang</a>
 * @date 2013��10��21�� ����4:32:10 
 *
 */
@WebService
public class HelloWorld implements IhelloWorld{

	public String sayHi(@WebParam(name = "text") String text) {
		return "Hello " + text;
	}
}
