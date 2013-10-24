package com.isoftstone.cxf.object.service;

import java.util.ArrayList;
import java.util.List;

public class AddressManager {

	private int requestCount = 0;
	public List<Address> getAddressList() {
		requestCount++;
		System.out.println("requestCount=" + requestCount);
		
		List<Address> returnList = new ArrayList<Address>();

		Address address = new Address();
		address.setIdentifier(1);
		address.setAddress("Baiyun");
		address.setCity("GuangZhou");
		address.setCountry("China");
		address.setPostalCode("100860");
		address.setProvince("Guangz");
		address.setExist(false);
		address.setArray(new String[] { "1", "2", "3" });

		returnList.add(address);

		address = new Address();
		address.setIdentifier(2);
		address.setAddress("Qianmen");
		address.setCity("BeiJing");
		address.setCountry("China");
		address.setPostalCode("100861");
		address.setProvince("Beij");
		address.setExist(false);
		address.setArray(new String[] { "A", "B", "C" });
		returnList.add(address);
		return returnList;
	}

	public List<Address> setAddressList(List<Address> list) {
		requestCount++;
		System.out.println("requestCount=" + requestCount);
		return list;
	}
}
