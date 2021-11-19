package kamath.panchami.springtwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaFootballConfigApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaFootballConfig.class);
		
		Coach theCoach = context.getBean("footballCoach",Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
