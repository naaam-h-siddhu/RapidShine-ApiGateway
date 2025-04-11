package com.rapidshine.carwash.carwashapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CarWashApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarWashApiGatewayApplication.class, args);
    }

}
