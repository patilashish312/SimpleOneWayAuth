package com.spr.boot2.OneWayAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.java.Log;



@SpringBootApplication
@Log
public class ApplicationStarter2 {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStarter2.class, args);
		log.info("Testing");
	}
}
