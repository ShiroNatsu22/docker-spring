package archetype.java.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class StartApplication {

	@RequestMapping("/")
    public String index() {
        return "Welcome to Dockerized Spring Boot Application!";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}