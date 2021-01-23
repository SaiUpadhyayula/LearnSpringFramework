package com.programming.techie;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JavaLifecycleHooks {

    @PostConstruct
    public void init() {
        System.out.println("Inside init JavaLifecycle Hooks");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside destroy JavaLifecycle Hooks");
    }
}
