package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by quxiangqian on 2018/5/3.
 */

@SpringBootApplication
public class Application {

    @Bean
    public RestTemplate getRestemplate()
    {
        return new RestTemplate();
    }
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
