package com.babufrikks.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("thatCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }

}
