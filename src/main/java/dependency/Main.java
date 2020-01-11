package dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(OurConfiguration.class);
		OurController  oc=context.getBean(OurController.class);
		oc.doWork();
	}

}
