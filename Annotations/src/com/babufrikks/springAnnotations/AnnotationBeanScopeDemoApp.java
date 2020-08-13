package com.babufrikks.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("soccerCoach", Coach.class);

        Coach otherCoach = context.getBean("soccerCoach", Coach.class);

        boolean result = (theCoach == otherCoach);

        System.out.println("Objetos iguais: " + result);

        System.out.println("Memoria theCoach: " + theCoach);

        System.out.println("Memoria otherCoach: " + otherCoach);

        context.close();
    }
}
