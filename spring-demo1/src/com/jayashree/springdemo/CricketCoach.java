package com.jayashree.springdemo;

public class CricketCoach implements Coach {
	
private FortuneService fortuneservice;

//add new fields
private String emailaddress;
private String team;

// setter methods for new fields
	public String getEmailaddress() {
		return emailaddress;
}
	public void setEmailaddress(String emailaddress) {
		System.out.println("CricketCoach: inside setter method - setEmailaddress");
	this.emailaddress = emailaddress;
}

	public String getTeam() {
		return team;
	}

public void setTeam(String team) {
	System.out.println("CricketCoach: inside setter method - setTeam");
	this.team = team;
}

	//create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// setter method
	public void setFortuneservice(FortuneService fortuneservice) {
		System.out.println("CricketCoach: inside setter method - setFortuneservice");
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}

}
