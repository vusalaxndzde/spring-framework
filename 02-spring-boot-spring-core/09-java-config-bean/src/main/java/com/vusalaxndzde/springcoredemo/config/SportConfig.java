package com.vusalaxndzde.springcoredemo.config;

import com.vusalaxndzde.springcoredemo.common.Coach;
import com.vusalaxndzde.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
