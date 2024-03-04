package com.microservicios1.regysterService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegysterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegysterServiceApplication.class, args);
	}

}
