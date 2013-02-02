package pl.polak.spring.rest.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import pl.polak.spring.rest.domain.Patient;

public interface SpringRestDemoRepository extends CrudRepository<Patient, Serializable>{

}
