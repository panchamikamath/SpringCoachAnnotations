package kamath.panchami.springtwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach")
@Component
public class TennisCoach implements Coach {

	//field dependency injection : uses java reflection
	@Autowired
	//@Qualifier("RESTFortuneService") //as first and second character as same dafault bean name remains same
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default constructor");
	}
	
	//setter dependency injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach : inside setFortuneService() constructor");
		this.fortuneService = fortuneService;
	}*/
	
	//any method dependency injection
	/*@Autowired
	public void doSomeStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach : inside doSomeStuff() constructor");
		this.fortuneService = fortuneService;
	}*/
	
	//constructor dependency injection
	/*@Autowired
	public TennisCoach(@Qualifier("RESTFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
