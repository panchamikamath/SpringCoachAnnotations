package kamath.panchami.springtwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("kamath.panchami.springtwo")
public class SportConfig {

	//define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for our surf coach and inject dependency
	@Bean
	public Coach surfCoach() {
		return new SurfCoach(sadFortuneService());
	}
}
