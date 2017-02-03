package com.av.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by vasiliev-alexey on 03.02.17.
 */
@Configuration
@Import(SimpleConfig.class)
public class AllConfig {
}
