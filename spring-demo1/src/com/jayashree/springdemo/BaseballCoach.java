package com.jayashree.springdemo;

public class BaseballCoach implements Coach {
	//define a private field for the dependency
		private FortuneService fortuneservice;
		
		//define a constructor for dependency injection
		public BaseballCoach(FortuneService theFortuneService) {
			fortuneservice = theFortuneService;
		}
		
		@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

		@Override
		public String getDailyFortune() {
			// use my fortuneservice to get fortune
			return  fortuneservice.getFortune();
		}

	

}
