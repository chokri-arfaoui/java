package com.example.dojos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dojos.models.Ninja;

@Repository
public interface NinjaRepository  extends CrudRepository<Ninja, Long>{
	
	List<Ninja> findByDojoId(long dojoId);
}