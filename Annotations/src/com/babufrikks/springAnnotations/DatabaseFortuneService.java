package com.babufrikks.springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("roi")
public class DatabaseFortuneService implements FortuneService {

    @Value("${fortune.a}")
    private String fortunaa;

    @Value("${fortune.b}")
    private String fortunab;

    @Value("${fortune.c}")
    private String fortunac;

    private String[] fortunas = new String[3];

    Random random = new Random();

    @Override
    public String getFortune() {

        int index = fortunas.length;

        int rand = random.nextInt(index);

        fortunas[0] = fortunaa;
        fortunas[1] = fortunab;
        fortunas[2] = fortunac;

        return fortunas[rand];
    }
}
