package ar.com.cgarcete.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Person {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotEmpty(message="El campo first es obligatorio")
	private String first;
	
	private String last;
	
	private String email;
	
	public Person() {
		
	}
	
	public Person(Long id, String first, String last, String email) {
		super();
		this.id = id;
		this.first = first;
		this.last = last;
		this.email = email;
	}
	public Person(String first, String last, String email) {
		super();
		this.first = first;
		this.last = last;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", first=" + first + ", last=" + last + ", email=" + email + "]";
	}
	
	
	
	
}
