package com.enesaksu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy //En üste yazılan Lazy altaki methodalrıda etkiler !!
public class MyConfiguration {

    public MyConfiguration() {
        System.out.println("MyConfiguration bean initulazied");
    }

    @Bean
    @Lazy
    public Example1 getEzample1(){
        return new Example1();
    }

    @Bean
    public Example2 getEzample2(){
        return new Example2();
    }

}
