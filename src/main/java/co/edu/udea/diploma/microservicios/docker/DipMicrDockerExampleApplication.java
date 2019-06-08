package co.edu.udea.diploma.microservicios.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DipMicrDockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DipMicrDockerExampleApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Docker Home";
	}
}
