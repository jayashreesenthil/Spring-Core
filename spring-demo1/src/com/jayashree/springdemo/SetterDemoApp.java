package com.jayashree.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		CricketCoach ccoach= context.getBean("myCricketCoach", CricketCoach.class);
		//call methods on the bean
		System.out.println(ccoach.getDailyWorkout());
		
		System.out.println(ccoach.getDailyFortune());
		//call new methods
		System.out.println(ccoach.getEmailaddress());
		
		System.out.println(ccoach.getTeam());
		//close the context
		context.close();
	}


}
