package com.arun.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.beans.Student;


public class LaunchMain {

	public static void main(String[] args) 
	{
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student std1=context.getBean("students",Student.class);
        std1.task();
        System.out.println(std1);
		
		

	}

}
