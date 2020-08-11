package com.babufrikks.springAnnotations;

import org.springframework.stereotype.Component;

@Component("thatCoach")
public class SoccerCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "100 penalties";
    }

}
