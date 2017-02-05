package com.av.config;

import com.av.beans.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by vasiliev-alexey on 04.02.17.
 */
@Configuration
@Import(SimpleConfig.class)
@ComponentScan(basePackages = "com.av.config")
public class ComplexConfig {


    @Bean
    public TestBean testBean() {

        return new TestBean();


    }

}
