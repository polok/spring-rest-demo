package pl.polak.spring.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.polak.spring.rest.repository.SpringRestDemoRepository;

@Service
public class SpringRestDemoService {

	@Autowired
	private SpringRestDemoRepository repository;
}
