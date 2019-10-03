package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    public Actor getActor(){

        return new Actor("Irfan Kan","male",23);

    }
    @Bean
    public Movie getMovie(){
        return new Movie(getActor());
    }


}
