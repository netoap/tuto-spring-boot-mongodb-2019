package com.alex.tutomongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.tutomongo.domain.User;
import com.alex.tutomongo.dto.UserDTO;
import com.alex.tutomongo.repository.UserRepository;
import com.alex.tutomongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(()-> new ObjectNotFoundException("Objecto Nao Encontrado"));
	}
	
	public User insert(User u) {
		return repo.insert(u);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
	public void delete (String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User upadate(User u) {
		User user = findById(u.getId());
		updateData(user, u);
		return repo.save(user);
	}
	
	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}
	
	
}
