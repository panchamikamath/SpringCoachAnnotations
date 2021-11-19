package kamath.panchami.springtwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		//Coach theCoach = context.getBean("theTennisCoach",Coach.class);
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach theBCoach = context.getBean("basketBallCoach",Coach.class);
		Coach theSCoach = context.getBean("swimCoach",Coach.class);
		
		//call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theBCoach.getDailyWorkout());
		System.out.println(theSCoach.getDailyWorkout());
		
		//call method to check dependency injection
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theSCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
