package com.joshuastringfellow.statsscraper.repos;


import com.joshuastringfellow.statsscraper.model.Registration;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationRepository extends CrudRepository<Registration, String> {
}
