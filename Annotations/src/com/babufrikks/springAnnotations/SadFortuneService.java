package com.babufrikks.springAnnotations;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Sad day.";
    }
}
