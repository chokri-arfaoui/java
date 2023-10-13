package com.chokri.Savetravels.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chokri.Savetravels.models.Pocketbook;

@Repository
public interface PocketbookRepository extends CrudRepository<Pocketbook, Long> {
//	READ ALL
	List<Pocketbook>findAll();
}
