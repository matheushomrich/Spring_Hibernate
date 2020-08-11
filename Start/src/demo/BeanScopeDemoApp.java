package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach otherCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == otherCoach);

        System.out.println("Same object: " + result);

        System.out.println("Memory location for theCoach: " + theCoach);

        System.out.println("Memory location for otherCoach: " + otherCoach + "\n");

        context.close();
    }
}
