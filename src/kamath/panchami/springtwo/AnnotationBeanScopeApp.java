package kamath.panchami.springtwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same object : " + result);
		System.out.println("Memory location for theCoach : " + theCoach);
		System.out.println("Memory location for alphaCoach : " + alphaCoach);
		
		//close the context
		context.close();
		

	}

}
