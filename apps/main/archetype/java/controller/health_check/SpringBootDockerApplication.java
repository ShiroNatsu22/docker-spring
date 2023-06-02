package main.archetype.java.controller.health_check;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

public class SpringBootDockerApplication {

	@RequestMapping("/health-check")
	public String healthCheck() {
		return "OK";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}