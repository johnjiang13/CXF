package com.isoftstone.cxf.iteye.client;

import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.isoftstone.cxf.iteye.entry.User;
import com.isoftstone.cxf.iteye.service.HelloService;

public final class Client {

	private static final QName SERVICE_NAME = new QName("http://ws.bless.com/",
			"HelloService");
	private static final QName PORT_NAME = new QName("http://ws.bless.com/",
			"HelloServicePort");

	private Client() {
	}

	public static void main(String args[]) throws Exception {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloService.class);
		factory.setAddress("http://localhost:8111/helloWorld");
		
		HelloService service = (HelloService) factory.create();
		System.out.println("[result]" + service.sayHi("aaaaaaaaa"));
		
		
		/*Service service = Service.create(SERVICE_NAME);
		// Endpoint Address
		String endpointAddress = "http://localhost:8111/helloWorld";

		// Add a port to the Service
		service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING,
				endpointAddress);

		HelloService hw = service.getPort(HelloService.class);
		System.out.println(hw.sayHi("World"));*/

		System.out.println(service.getUser(new User(1, "kaka")));

		System.out.println(service.getListUser().size());
		List listaa = service.getListUser();
		
		for (int i = 0; i < listaa.size(); i++) {
			User user = (User) listaa.get(i);
			System.out.println(user.getId() + "  " + user.getName());
		}
		/*for (User user : service.getListUser()) {
			System.out.println("List User [id:" + user.getId() + "][name:"
					+ user.getName() + "]");
		}*/
	}

}