package com.empresa.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.workshopmongo.domain.User;
import com.empresa.workshopmongo.repository.UserRepository;
import com.empresa.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo; 
	
	public List<User> findAll() {
    return repo.findAll();
	}
	
		
	public User findById(String id) {
	Optional<User> obj = repo.findById(id);
	return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}
