package kamath.panchami.springtwo;

public class SurfCoach implements Coach {

	private FortuneService fortuneService;
	
	public SurfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Surf daily...";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
