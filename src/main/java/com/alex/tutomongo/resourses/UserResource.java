package com.alex.tutomongo.resourses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alex.tutomongo.domain.User;

@RestController
@RequestMapping(value = "/users")	
public class UserResource {
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<User>> findAll(){
		User user1 = new User(1, "Alex", "alex@gmail.com");
		User user2 = new User(2, "Marcio", "marcio@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(user1,user2));
		return ResponseEntity.ok().body(list);
	}

}