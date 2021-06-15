package info.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication()
public class AppBackendApplication {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AppBackendApplication.class);
		Properties props = new Properties();
		props.setProperty("server.port", "8083");

		app.setDefaultProperties(props);
		app.run(args);
	}

}
