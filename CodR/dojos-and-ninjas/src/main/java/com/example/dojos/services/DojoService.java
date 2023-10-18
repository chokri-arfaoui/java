package com.example.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dojos.models.Dojo;
import com.example.dojos.repository.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojorepository;

	// READ ALL
	public List<Dojo> findAll() {
		return dojorepository.findAll();
	}

	// CREATE
	public Dojo createDojo(Dojo Dojo) {
		return dojorepository.save(Dojo);
	}

	// READ ONE
	public Dojo findDojo(Long id) {
		Optional<Dojo> maybeDojo = dojorepository.findById(id);
		if (maybeDojo.isPresent()) {
			return maybeDojo.get();
		} else {
			return null;
		}
	}

	// UPDATE
	public Dojo updateDojo(Dojo Dojo) {
		return dojorepository.save(Dojo);
	}

	// DELETE
	public void deleteDojo(Long id) {
		dojorepository.deleteById(id);
	}

}
