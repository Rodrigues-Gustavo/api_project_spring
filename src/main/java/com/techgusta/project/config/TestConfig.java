package com.techgusta.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.techgusta.project.entities.User;
import com.techgusta.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Lionel Messi", "messi10@gmail.com", "1010101010", "1234567");
		User u2 = new User(null, "Neymar jr", "njr@gmail.com", "1010101010", "1234567");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
