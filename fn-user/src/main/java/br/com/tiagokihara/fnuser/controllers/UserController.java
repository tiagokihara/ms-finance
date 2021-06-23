package br.com.tiagokihara.fnuser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagokihara.fnuser.entities.User;
import br.com.tiagokihara.fnuser.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> getById(@PathVariable Long id) {
		return ResponseEntity.ok(userRepository.findById(id).orElseThrow());
	}

	@GetMapping(value = "/search")
	public ResponseEntity<User> getByEmail(@RequestParam String email) {
		return ResponseEntity.ok(userRepository.findByEmail(email).orElseThrow(IllegalArgumentException::new));
	}
}
