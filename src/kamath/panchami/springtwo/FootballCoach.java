package kamath.panchami.springtwo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Football Everyday";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
