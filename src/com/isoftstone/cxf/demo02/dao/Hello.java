package com.isoftstone.cxf.demo02.dao;

import javax.jws.WebService;

/**
 * 
 * @ClassName: Hello 
 * @Description:�������˵Ľӿ�
 * @author <a href="mailto:wangyj0898@126.com">Jim Wang</a>
 * @date 2013��10��22�� ����11:17:01 
 *
 */
@WebService
public interface Hello {

	// ����Ľӿڷ���������������ӿ�����ķ���һ��

	public String sayHello(String username);
}
