package com.isoftstone.cxf.iteye.service;

import java.util.List;

import javax.jws.WebService;

import com.isoftstone.cxf.iteye.entry.User;

@WebService
public interface HelloService {

	public String sayHi(String text);

	public String getUser(User user);

	public List<User> getListUser();
}
