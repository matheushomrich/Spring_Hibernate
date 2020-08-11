package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class SetterDemoApp {

    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(2);
        // carrega o context da aplicacao
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // carrega Bean
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // chamando metodos

        System.out.println(theCoach.getCoachName());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune(rand));
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeamName());

        // fecha o conxtexto
        context.close();

    }
}
