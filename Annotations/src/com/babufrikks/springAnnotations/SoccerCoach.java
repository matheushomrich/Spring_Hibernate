package com.babufrikks.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatCoach")
@Component
public class SoccerCoach implements Coach{

    @Autowired
    //@Qualifier("foo")
    @Qualifier("roi")
    private FortuneService fortuneService;

    /*@Autowired
    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public SoccerCoach() {
        System.out.println("Inside default constructor");
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
