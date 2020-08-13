package com.babufrikks.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatCoach")
@Component
//@Scope("singleton") //default
//@Scope("prototype") //vai criar um objeto Bean para cada instanciacao da classe
public class SoccerCoach implements Coach{

    @Autowired
    //@Qualifier("foo")
    @Qualifier("eja")
    private FortuneService fortuneService;

    /*@Autowired
    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public SoccerCoach() {
        System.out.println("Inside default constructor");
    }

    //init method

    @PostConstruct
    public void start() {
        System.out.println("Inside method - init");
    }

    //destroy method
    @PreDestroy
    public void end() {
        System.out.println("Inside method - destroy");
    }
    /*@Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("Inside setFortuneService method");
        fortuneService = theFortuneService;
    }*/

    /*@Autowired
    public void test(FortuneService theFortuneService) {
        System.out.println("Inside test method");
        fortuneService = theFortuneService;
    }*/

    /*
    private String coachName;
    private String dailyWorkout;


    public void setDailyWorkout(String dailyWorkout) {
        this.dailyWorkout = dailyWorkout;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    @Override
    public String getDailyWorkout() {
        return this.dailyWorkout;
    }

    @Override
    public String getCoachName() {
        return this.coachName;
    }*/

    @Override
    public String getDailyWorkout() {
        return "kkkk treino";
    }

    @Override
    public String getCoachName() {
        return "braian";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
