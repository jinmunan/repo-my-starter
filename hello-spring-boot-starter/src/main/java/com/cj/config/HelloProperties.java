package com.cj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 创建配置属性类HelloProperties
 * 读取配置文件转换为bean
 * Created by Jinmunan
 * 2022/6/29
 * 22:45
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "HelloProperties{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}