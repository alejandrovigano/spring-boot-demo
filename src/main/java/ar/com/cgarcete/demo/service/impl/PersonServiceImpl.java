package ar.com.cgarcete.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.cgarcete.demo.domain.Person;
import ar.com.cgarcete.demo.repository.PersonRepository;
import ar.com.cgarcete.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Long save(Person person) {
		Person result = personRepository.save(person);
		return result.getId();
	}

//	@Override
//	public Optional<Person> findOne(Long id) {
//		Person person = personRepository.findOne(id);
//		return Optional.ofNullable(person);
//	}

	@Override
	public Person findOne(Long id) {
		Person person = personRepository.findOne(id);
		return person;
	}	
	
	@Override
	public Optional<Person> update(Long id, Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAll() {
		return (List<Person>) personRepository.findAll();
	}

	@Override
	public Optional<Person> delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
