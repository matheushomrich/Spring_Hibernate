package com.babufrikks.springAnnotations;

public class TheFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "FORTUNA";
    }
}
