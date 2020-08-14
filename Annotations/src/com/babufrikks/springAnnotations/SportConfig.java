package com.babufrikks.springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.babufrikks.springAnnotations")
@PropertySource("classpath:sportt.properties")
public class SportConfig {

    // define bean for sadFortuneService
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for SwimCoach AND inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
