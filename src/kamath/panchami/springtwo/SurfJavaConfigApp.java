package kamath.panchami.springtwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SurfJavaConfigApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		Coach theCoach = context.getBean("surfCoach",Coach.class);
		
		//call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to check dependency injection
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
