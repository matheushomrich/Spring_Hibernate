package com.babufrikks.springAnnotations;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

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
}
