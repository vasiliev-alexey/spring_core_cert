package com.av.config;

import com.av.beans.SimpleBean;
import com.av.beans.SimpleBeanImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by vasiliev-alexey on 03.02.17.
 */
@Configuration
@PropertySource("classpath:simple.properties")
public class SimpleConfig {

    @Value("${message}")
    private String message;

    @Bean
    public SimpleBean simpleBeanOne (){

        SimpleBean simpleBean = new SimpleBeanImpl();
        ((SimpleBeanImpl)simpleBean).setMessage(message);
      return simpleBean;
    }

    @Bean
    public SimpleBean simpleBeanTwo (){

        SimpleBean simpleBean = new SimpleBeanImpl();
        ((SimpleBeanImpl)simpleBean).setMessage(message + " world");
        return simpleBean;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer
    propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }




}
