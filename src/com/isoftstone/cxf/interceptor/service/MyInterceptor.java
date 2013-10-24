package com.isoftstone.cxf.interceptor.service;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

/**
 * 
 * @ClassName: MyInterceptor 
 * @Description: �Զ����Interceptor
 * @author <a href="mailto:wangyj0898@126.com">Jim Wang</a>
 * @date 2013��10��24�� ����12:22:38 
 *
 */
public class MyInterceptor extends AbstractPhaseInterceptor<Message> {

	public MyInterceptor() {
		// TODO Auto-generated constructor stub
		super(Phase.RECEIVE);
	}

	public MyInterceptor(String phase) {
		super(phase);
	}

	public void handleFault(Message arg0) {
		System.out.println("Error");
	}

	@Override
	public void handleMessage(Message arg0) throws Fault {
		// TODO Auto-generated method stub
		System.out.println("Hello,This is my Interceptor.");
	}

}
