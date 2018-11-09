package com.example.jpa.repositories;

import com.example.jpa.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jordan
 */
public interface PhoneRepository extends JpaRepository<Phone, Long>{
	
}
