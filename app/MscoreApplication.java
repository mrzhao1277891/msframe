package com.ect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MscoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscoreApplication.class, args);
	}

}
