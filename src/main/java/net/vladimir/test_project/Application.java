package net.vladimir.test_project;

import net.vladimir.test_project.dao.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	@Autowired
	ContactRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}



