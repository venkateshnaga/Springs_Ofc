package com.dhatri;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test 
{
	public static void main(String[] args) 
	{
		Resource ref=new ClassPathResource("applicationcontext.xml");
		BeanFactory bean=new XmlBeanFactory(ref);
		Object obj=bean.getBean("emp");
		Employee emp=(Employee)obj;
		System.out.println(emp.getEmployeeId()+"---"+emp.getEmployeeName()+"---"+emp.getEmployeeSalary());
	}
}
