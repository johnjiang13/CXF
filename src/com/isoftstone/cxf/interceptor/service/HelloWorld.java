package com.isoftstone.cxf.interceptor.service;

import javax.jws.WebParam;
import javax.jws.WebService;


/**
 * 
 * @ClassName: HelloWorld 
 * @Description: WebService服务端的实现类 
 * @author <a href="mailto:wangyj0898@126.com">Jim Wang</a>
 * @date 2013年10月21日 下午4:32:10 
 *
 */
@WebService
public class HelloWorld implements IhelloWorld{

	public String sayHi(@WebParam(name = "text") String text) {
		return "Hello " + text;
	}
}
