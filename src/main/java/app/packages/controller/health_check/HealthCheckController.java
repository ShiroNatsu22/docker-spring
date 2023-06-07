package packages.controller.health_check;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@RequestMapping("/health-check")
	public String index() {
		return "OK";
	}

}