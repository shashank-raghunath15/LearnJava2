package org.shashank.learnJava.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"org.shashank.learnJava.service"})
public class ServiceConfig {

}
