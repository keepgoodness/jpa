package com.example.jpa;

import com.example.jpa.entities.Person;
import com.example.jpa.entities.Phone;
import com.example.jpa.repositories.PersonRepository;
import com.example.jpa.repositories.PhoneRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final PhoneRepository phoneRepository;

	@Autowired
	public JpaApplication(PersonRepository personRepository, PhoneRepository phoneRepository) {
		this.personRepository = personRepository;
		this.phoneRepository = phoneRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Person p = new Person("Yordan", "Dimitrov", "Lazarov");
		p.getPhones().add(new Phone("0898857554"));
		p.getPhones().add(new Phone("0898857555"));
		p.getPhones().add(new Phone("0898857556"));
		personRepository.save(p);

	}
}
