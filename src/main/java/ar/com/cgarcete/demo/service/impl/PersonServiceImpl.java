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

	@Override
	public Optional<Person> findOnee(Long id) {
		Person person = personRepository.findOne(id);
		return Optional.ofNullable(person);
	}

	@Override
	public Person findOne(Long id) {
		Person person = personRepository.findOne(id);
		return person;
	}	
	
	@Override
	public Optional<Person> update(Long id, Person person) {
		Optional<Person> personOptional = this.findOnee(id);

		if (personOptional.isPresent()) {
			
			Person personOriginal = personOptional.get();
			personOriginal.setFirst(person.getFirst());
			personOriginal.setLast(person.getLast());
			personOriginal.setEmail(person.getEmail());
			personOriginal.setEsEstudiante(person.isEsEstudiante());
			
			Person propietarioActualizado = personRepository.save(personOriginal);
			return Optional.of(propietarioActualizado);
		}

		return personOptional;
	}

	@Override
	public List<Person> findAll() {
		return (List<Person>) personRepository.findAll();
	}

	@Override
	public Optional<Person> delete(Long id) {
		Optional<Person> person = findOnee(id);
		if (person.isPresent()) {
			Person entity = person.get();
			entity.setEsEstudiante(false);
			personRepository.save(entity);
		}
		return person;
	}


}
