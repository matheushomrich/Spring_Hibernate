package com.babufrikks.springAnnotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private String[] randomFortune = {"cuidado","perigo","eita"};

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = randomFortune.length;

        int rand = random.nextInt(index);

        return randomFortune[rand];
    }
}
