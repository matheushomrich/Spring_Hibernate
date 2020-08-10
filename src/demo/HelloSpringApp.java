package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //FortuneService fortuneService = context.getBean("myFortuneService", FortuneService.class);

        // call methods on the bean
        System.out.println(theCoach.getCoachName());
        System.out.println(theCoach.getDailyWorkout());
        //System.out.println(theCoach.getClass());
        System.out.println(theCoach.getDailyFortune());
        // System.out.println(fortuneService.getFortune());
        // System.out.println(fortuneService.getClass());


        // close the context
        context.close();
    }
}
