package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RandomMacApplication {

    public static void main(String[] args) {
        //SpringApplication.run(RandomMacApplication.class, args);
        Mac mac = new Mac();
        for (int i = 0; i < 5000; i++) {
            System.out.println(mac.randomMac());
        }
    }

}
