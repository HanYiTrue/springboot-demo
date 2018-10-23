package com.prepost;

import org.springframework.context.annotation.Bean;

public class PrePostConfig {

    @Bean
    BeanWayService beanWayService(){

        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){

        return  new JSR250WayService();
    }
}
