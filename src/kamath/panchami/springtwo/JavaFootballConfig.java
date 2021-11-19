package kamath.panchami.springtwo;

import org.springframework.context.annotation.Bean;

public class JavaFootballConfig {

	@Bean
	public FortuneService bestFortuneService() {
		return new BestFortuneService();
	}
	
	@Bean
	public FootballCoach footballCoach() {
		return new FootballCoach(bestFortuneService());
	}
	
}
