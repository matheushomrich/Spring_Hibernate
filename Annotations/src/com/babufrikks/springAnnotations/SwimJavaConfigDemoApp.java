package com.babufrikks.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //Coach theCoach = context.getBean("thatCoach", Coach.class);

        // now using default Spring ID creation via @Component
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getCoachName());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("email: " + theCoach.getEmail());
        System.out.println("teamName: " + theCoach.getTeam());

        context.close();

    }

}
