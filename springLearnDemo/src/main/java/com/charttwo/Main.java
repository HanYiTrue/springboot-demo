package com.charttwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static  void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.SayHello("Java config"));

        context.close();
    }
}
