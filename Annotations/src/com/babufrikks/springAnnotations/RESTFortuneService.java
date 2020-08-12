package com.babufrikks.springAnnotations;

import org.springframework.stereotype.Component;

@Component("foo")
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "eusguripai";
    }
}
