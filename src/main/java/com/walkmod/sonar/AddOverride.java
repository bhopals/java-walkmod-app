package com.walkmod.sonar;

public class AddOverride {

	private String name;
	private Integer age;
	private String address;
	private Long poNuber;
	
	public String getName() {
		return name;
	}
	public Long getPoNuber() {
		return poNuber;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public String toString() {
		return "GetterSetterGenerator [name=" + name + ", age=" + age + ", address=" + address + ", poNuber=" + poNuber
				+ "]";
	}
	
	
}
