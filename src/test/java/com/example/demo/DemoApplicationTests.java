package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.GeneralUser;
import com.example.demo.service.UserService;
import static org.assertj.core.api.Assertions.assertThat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
@Transactional // Rollback the transaction after each test
class DemoApplicationTests {

	@Autowired
	private UserService generalUserService;

	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	public void whenCreateUser_thenUserCanBeFound() {
		logger.info("Creating a new user with username 'testUser'");
		GeneralUser user = new GeneralUser(null, "testUser", "password123");
		generalUserService.createUser(user);
		logger.info("User created successfully.");

		logger.info("Retrieving the user by username 'testUser'");
		GeneralUser found = generalUserService.getUserByUsername(user.getUsername());

		assertThat(found).isNotNull();
		assertThat(found.getUsername()).isEqualTo(user.getUsername());
		logger.info("Assertion passed: The retrieved username matches the created user's username.");
	}

}
