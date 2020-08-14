package com.babufrikks.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class ExercicioTesteJavaApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyTestConfig.class);

        Coach theCoach = context.getBean("bestCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());

        context.close();

    }
}
