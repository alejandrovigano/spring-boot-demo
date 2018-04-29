package ar.com.cgarcete.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ar.com.cgarcete.demo.domain.Subscriber;
import ar.com.cgarcete.demo.repository.SubscriberRepository;



@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner runner(SubscriberRepository repository) {
		
		return args -> {
			repository.save(	new Subscriber("cvv", "erer", "nana@gmail.com")	);
			repository.save(	new Subscriber("dff", "vc", "asdasd@gmail.com")	);
			repository.save(	new Subscriber("cccc", "sadas", "bigiyu@gmail.com")	);
		};
	}
	
}
