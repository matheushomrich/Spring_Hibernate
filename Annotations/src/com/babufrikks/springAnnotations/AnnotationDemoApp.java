package com.babufrikks.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Coach theCoach = context.getBean("thatCoach", Coach.class);

        // now using default Spring ID creation via @Component
        Coach theCoach = context.getBean("soccerCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getCoachName());
        System.out.println(theCoach.getDailyFortune());

        context.close();

    }

}
