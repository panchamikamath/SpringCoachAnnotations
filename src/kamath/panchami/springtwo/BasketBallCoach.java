package kamath.panchami.springtwo;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your goal!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}
}
