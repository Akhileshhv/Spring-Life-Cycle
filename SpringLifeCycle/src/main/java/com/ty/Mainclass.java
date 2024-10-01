package com.ty;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Apple apple=(Apple)context.getBean("applee");
		System.out.println(apple);
		
		
		context.registerShutdownHook();//explicitly calling destroy()method.
		
	}
	
}
