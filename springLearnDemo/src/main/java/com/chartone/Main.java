package com.chartone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void  main(String[] agrs){

        //AnnotationConfigApplicationContext 作为spring容器，把配置里面的bean放进去
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        //获取配置的UseFunctionService的bean
//        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
//
//        System.out.println(useFunctionService.SayHello("helloworld"));

        FunctionService functionService = context.getBean(FunctionService.class);
        System.out.println(functionService.SayHello(" World"));
        context.close();
    }
}
