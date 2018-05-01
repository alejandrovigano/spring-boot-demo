package ar.com.cgarcete.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ar.com.cgarcete.demo.domain.Person;
import ar.com.cgarcete.demo.repository.PersonRepository;



@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner runner(PersonRepository repository) {
		
		return args -> {
			repository.save(	new Person("nanana", "rerer", "nana@gmail.com", true)	);
			repository.save(	new Person("bebebe", "fefefe", "asdasd@gmail.com" , true)	);
			repository.save(	new Person("rororo", "wewewe", "bigiyu@gmail.com", true)	);
		};
	}
	
}
