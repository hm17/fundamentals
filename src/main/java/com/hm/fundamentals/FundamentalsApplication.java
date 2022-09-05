package com.hm.fundamentals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hm.fundamentals.entity.Application;
import com.hm.fundamentals.repository.ApplicationRepository;

@SpringBootApplication
public class FundamentalsApplication {
	
	private static final Logger log = LoggerFactory.getLogger(FundamentalsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
		
		System.out.println("Hello World!");
	}
	
	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		
		return (args) -> {
			repository.save(new Application("Trackzilla", "troy.barnes", "Application for tracking bugs."));
			repository.save(new Application("Expenses", "mary.jones", "Application to track expense reports."));
			repository.save(new Application("Notifications", "sailor.moon", "Application to send alerts and notifications."));
			
			for (Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
		
	}

}
