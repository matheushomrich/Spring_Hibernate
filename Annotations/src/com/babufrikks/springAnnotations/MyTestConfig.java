package com.babufrikks.springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyTestConfig {

    // define bean for sadFortuneService
    @Bean
    public FortuneService theFortuneService() {
            return new TheFortuneService();
        }

    // define bean for SwimCoach AND inject dependency
    @Bean
    public Coach bestCoach() {
            return new BestCoach(theFortuneService());
        }
}
