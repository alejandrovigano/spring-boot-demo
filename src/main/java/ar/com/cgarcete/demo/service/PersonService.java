package ar.com.cgarcete.demo.service;

import java.util.List;
import java.util.Optional;

import ar.com.cgarcete.demo.domain.Person;

public interface PersonService {
	Long save(Person propietario);

	Optional<Person> findOne(Long id);

	Optional<Person> update(Long id, Person propietario);
	
	List<Person> findAll();
	
	Optional<Person> delete(Long id);
}
