package ar.com.cgarcete.demo.test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ar.com.cgarcete.demo.domain.Person;
import ar.com.cgarcete.demo.repository.PersonRepository;
import ar.com.cgarcete.demo.service.PersonService;
import ar.com.cgarcete.demo.service.impl.PersonServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {
	
	@InjectMocks
	private PersonService personService = new PersonServiceImpl();

	@Mock
	private PersonRepository personRepository;

	@Test
	public void findOneOk() {
		Person jose = new Person();
		jose.setId(1L);
		jose.setFirst("Claudio");
		jose.setLast("Garcete");
		jose.setEmail("faaaaaa@gmail.com");
		
		when(personRepository.findOne(anyLong())).thenReturn(jose);
		
		System.out.println(personService.findOne(anyLong()));
		
		assertNotNull(personService.findOne(anyLong()));

	}//FIN findOneOk();
	
}
