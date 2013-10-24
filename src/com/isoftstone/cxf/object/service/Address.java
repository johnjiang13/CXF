package com.isoftstone.cxf.object.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 服务器的自定义类型
 * 
 * @author Jim Wang
 * 
 */
@XmlType(name="ServerAddress")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer identifier;

	private String address;

	private String city;

	private String province;

	private String country;

	private String postalCode;

	private String[] array;

	private List<Integer> list;
	
	private Map<Integer, InnerClass> map;

	public Map<Integer, InnerClass> getMap() {
		return map;
	}

	public void setMap(Map<Integer, InnerClass> map) {
		this.map = map;
	}

	private boolean isExist;

	private InnerClass innC;

	public InnerClass getInnC() {
		return innC;
	}

	public void setInnC(InnerClass innC) {
		this.innC = innC;
	}

	public InnerClass getInnc() {
		return innC;
	}

	public void setInnc(InnerClass innC) {
		this.innC = innC;
	}

	/**
	 * 内部类必须是可序列化的 内部类必须是静态的，否则不能被序列化
	 * 
	 * @author Administrator
	 * 
	 */
	@XmlType(name="ServerInnerClass")
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class InnerClass implements Serializable {
		private String innerName;

		public InnerClass() {
			// TODO Auto-generated constructor stub
		}
		
		public InnerClass(String innerName) {
			// TODO Auto-generated constructor stub
			super();
			this.innerName = innerName;
		}
		
		public String getInnerName() {
			return innerName;
		}

		public void setInnerName(String innerName) {
			this.innerName = innerName;
		}
	}

	public Address() {
		// TODO Auto-generated constructor stub

		list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		map = new HashMap<Integer, Address.InnerClass>();
		map.put(1, new InnerClass("A"));
		map.put(2, new InnerClass("B"));
		map.put(3, new InnerClass("C"));
		
		innC = new InnerClass();
		innC.setInnerName("服务端：Address.InnerClass");
	}

	public Integer getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public boolean isExist() {
		return isExist;
	}

	public void setExist(boolean isExist) {
		this.isExist = isExist;
	}

	public String toString(){
		String returnStr = super.toString()
				+"id: " + getIdentifier()
				+" address: " + getAddress()
				+" city: " + getCity()
				+" country: " + getCountry()
				+" postalCode: " + getPostalCode()
				+" province: " + getProvince()
				+" array: " + getArray()[0]
				+" list: " + getList()
				+" map: " + getMap()
				+" isExist: " + isExist()
				+" innerClass.name: " + getInnc().getInnerName();
		return returnStr;
	}
}
