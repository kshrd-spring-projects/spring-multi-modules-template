package com.khorn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * We have to run project from controller in web-client module
 * not parent-project
 * if SpringBoot cannot scan package of Controller, Service and Repository
 * we use Annotation @ComponentScan to find them
 * @ComponentScan(basePackages= {"com.khorn"})
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args); 
    }
}
