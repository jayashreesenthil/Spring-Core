package com.jayashree.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach=context.getBean("myCoach",Coach.class);
		Coach subcoach=context.getBean("myCoach",Coach.class);
		
		//Check if they are the same
		boolean result =(coach==subcoach);
		
		//print out the results
		System.out.println("\nPointing to the same object: " +result);
		System.out.println("\nMemory location for coach: " +coach);
		System.out.println("\nMemory location for subcoach: " +subcoach);
		
		//close the context
		context.close();
	}

}
