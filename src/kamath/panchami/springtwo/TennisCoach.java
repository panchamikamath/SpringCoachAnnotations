package kamath.panchami.springtwo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach")
@Component
//@Scope("singleton")
//@Scope("prototype")
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
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach : inside of doMyStartupStuff");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach : inside of doMyCleanupStuff");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
