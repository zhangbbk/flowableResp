package com.ultimatech;

import org.flowable.ui.modeler.properties.FlowableModelerAppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangbbk
 * @date 2019/11/13 16:10
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = {"com.ultimatech","org.flowable.ui.modeler","org.flowable.ui.common"})
public class flowableSpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(flowableSpringbootApplication.class, args);
    }

    @Bean
    public FlowableModelerAppProperties flowableModelerAppProperties(){
        FlowableModelerAppProperties flowableModelerAppProperties = new FlowableModelerAppProperties();
        return flowableModelerAppProperties;
    }
}
