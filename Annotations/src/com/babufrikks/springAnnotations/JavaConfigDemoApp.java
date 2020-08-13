package com.babufrikks.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //Coach theCoach = context.getBean("thatCoach", Coach.class);

        // now using default Spring ID creation via @Component
        Coach theCoach = context.getBean("soccerCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getCoachName());
        System.out.println(theCoach.getDailyFortune());

        context.close();

    }

}
