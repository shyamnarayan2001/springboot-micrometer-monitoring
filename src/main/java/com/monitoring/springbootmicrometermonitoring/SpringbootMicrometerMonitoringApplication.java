package com.monitoring.springbootmicrometermonitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootMicrometerMonitoringApplication {

	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome to our new boss..";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicrometerMonitoringApplication.class, args);
	}

}
