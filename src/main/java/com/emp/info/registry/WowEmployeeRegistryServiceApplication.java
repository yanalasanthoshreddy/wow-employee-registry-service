package com.emp.info.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WowEmployeeRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WowEmployeeRegistryServiceApplication.class, args);
	}

}
