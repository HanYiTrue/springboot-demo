package com.e1;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


@Configuration //配置
@ComponentScan("com.e1")//扫描包使用注册Bean
//@PropertySource("classpath:test.properties")
@PropertySource("classpath:test.properties")// 指定文件地址
public class ElConfig {

    @Value("I Love You!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private  String osName;

    @Value("#{ T(java.lang.Math).random()*100.0}")
    private  double randomNumber;

    @Value("#{demoService.another}")
    private String formAnother;

    @Value("classpath:Ttest.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")  //符号 $  需要配合PropertySourcesPlaceholderConfigurer使用才能获取到值
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(formAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
            System.out.println(environment.getProperty("book.name"));



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
