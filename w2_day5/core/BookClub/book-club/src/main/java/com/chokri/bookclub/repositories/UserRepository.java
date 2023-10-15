package com.chokri.bookclub.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chokri.bookclub.models.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	// Find by Email
		Optional<User> findByEmail(String email);
}
