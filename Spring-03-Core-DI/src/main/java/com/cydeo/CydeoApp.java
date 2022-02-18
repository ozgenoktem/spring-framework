package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {


        //application context is interface, and annotationConfig is class
        //bean factory is interface
        //application context extends bean factory
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigApp.class);

        Java java=context.getBean(Java.class);
        java.getTeachingHours();
    }
}
