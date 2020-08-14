package com.babufrikks.springAnnotations;

import org.springframework.stereotype.Component;

public class BestCoach implements Coach {

    private FortuneService fortuneService;

    public BestCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getCoachName() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
