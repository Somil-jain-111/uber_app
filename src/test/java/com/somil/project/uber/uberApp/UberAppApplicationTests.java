package com.somil.project.uber.uberApp;

import com.somil.project.uber.uberApp.entity.User;
import com.somil.project.uber.uberApp.entity.enums.UserRoles;
import com.somil.project.uber.uberApp.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class UberAppApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRepository() {
		User user = User.builder()
				.name("somil")
				.email("somilj11111@gmail.com")
				.password("111111")
				.roles(Set.of(UserRoles.RIDER))
				.build();
		userRepository.save(user);
	}

	@Transactional
	@Test
	void getAllData() {
		List<User> userEntity = userRepository.findAll();
		for (User user : userEntity) {
			System.out.println(user);  // Access roles inside the transaction
		}
	}


//	@Transactional
//	@Test
//	void getData(){
//	 User	UseruserEntity = userRepository.findByEmail("somillj1@gmail.com");
////		for (User user : userEntity) {
//			System.out.println(UseruserEntity);  // Access roles inside the transaction
////		}
//	}
//

}