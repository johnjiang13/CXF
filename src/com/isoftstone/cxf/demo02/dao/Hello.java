package com.isoftstone.cxf.demo02.dao;

import javax.jws.WebService;

/**
 * 
 * @ClassName: Hello 
 * @Description:服务器端的接口
 * @author <a href="mailto:wangyj0898@126.com">Jim Wang</a>
 * @date 2013年10月22日 上午11:17:01 
 *
 */
@WebService
public interface Hello {

	// 这里的接口方法必须跟服务器接口里面的方法一致

	public String sayHello(String username);
}
