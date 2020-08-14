package com.babufrikks.springAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Value("${foo.email}")
    private String email;

    @Value("${foo.name}")
    private String team;


    @Override
    public String getDailyWorkout() {
        return "Swim.";
    }

    @Override
    public String getCoachName() {
        return "Swimmie";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();

    }
    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

}
