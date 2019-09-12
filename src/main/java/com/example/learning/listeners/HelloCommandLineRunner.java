package com.example.learning.listeners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 属于ioc容器，要加@component注解
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("HelloCommandLineRunner");
    }
}
