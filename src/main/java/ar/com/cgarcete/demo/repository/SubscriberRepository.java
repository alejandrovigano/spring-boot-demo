package ar.com.cgarcete.demo.repository;

import org.springframework.data.repository.CrudRepository;

import ar.com.cgarcete.demo.domain.Subscriber;


//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface SubscriberRepository  extends CrudRepository<Subscriber, Long>{

}
