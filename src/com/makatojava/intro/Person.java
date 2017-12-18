package com.makatojava.intro;

import java.util.logging.Logger;

public class Person {
	public Person(String name, int age, int height, int weight, String eyeColor, String gender) {
		  this.name = name;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
		  this.eyeColor = eyeColor;
		  this.gender = gender;
	}
	
	//private String name;
	private String firstName;
	private String lastName;
	private int age;
	private int height;
	private int weight;
	private String eyeColor;
	private String gender;
	
	public String getFullName() {
		  return getFirstName().concat(" ").concat(getLastName());
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		int ret = height;
		// If locale of the computer this code is running on is U.S.,
		if (Locale.getDefault().equals(Locale.US))
			ret /= 2.54;// convert from cm to inches
		return ret;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	Logger l = Logger.getLogger(getClass().getName());


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	}
