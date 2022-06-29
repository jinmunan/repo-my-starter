package com.cj.service;

/**
 * 创建服务类HelloService
 * Created by Jinmunan
 * 2022/6/29
 * 22:47
 */
public class HelloService {
	private String name;
	private String address;

	public HelloService(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String sayHello() {
		return "你好！我的名字叫 " + name + "，我来自 " + address;
	}
}