package com.chokri.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.chokri.bookclub.models.LoginUser;
import com.chokri.bookclub.models.User;
import com.chokri.bookclub.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	// TO-DO: Write register and login methods!
	public User register(User newUser, BindingResult result) {
		// TO-DO: Additional validations!
		// Reject if email is taken (present in database)
		Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
		if (potentialUser.isPresent()) {
			result.rejectValue("email", "registerError", "email is taken");
		}
		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("password", "registerError", "paswords does not match");
		}
		if (result.hasErrors()) {
			return null;
		} else {
			// hash and set password, save user to DB
			String hashPW = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashPW);
			// SAVE TO DB
			return userRepo.save(newUser);
		}
	}

	public User login(LoginUser newLoginObject, BindingResult result) {
		// TO-DO: Additional validations!
		// FIND IF USER IS PRESENT IN DB
		Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
		if (!potentialUser.isPresent()) {
			result.rejectValue("email", "loginErrors", "Email is not found");
		} else {
			User user = potentialUser.get();
			if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
				result.rejectValue("password", "loginErrors", "invalid password");
			}
			if (result.hasErrors()) {
				return null;
			} else {
				return user;
			}

		}

		return null;
	}

	public Optional<User> findById(long id) {
		return userRepo.findById(id);
	}
}
