package com.emp.info.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

/**
 * Registry service boot applciation.
 * @author Sudhakar Reddy
 *
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EmployeeRegistryApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("My Registry Service Application :: STARTED");
		SpringApplication.run(EmployeeRegistryApplication.class, args);
	}

}
