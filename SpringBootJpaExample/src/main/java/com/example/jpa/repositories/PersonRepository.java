package com.example.jpa.repositories;

import com.example.jpa.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jordan
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
	
}
