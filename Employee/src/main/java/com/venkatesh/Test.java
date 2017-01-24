package com.venkatesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
public static void main(String[] args) 
{
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Object obj=ac.getBean("triangleref");
		Triangle triangle=(Triangle)obj;
		System.out.println("triangle values="+triangle.getPoint().getY());
}
}
