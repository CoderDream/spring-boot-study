package com.bjc.bjcsso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.unicon.cas.client.configuration.EnableCasClient;

@EnableCasClient
@SpringBootApplication
public class BjcSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BjcSsoApplication.class, args);
    }

}
