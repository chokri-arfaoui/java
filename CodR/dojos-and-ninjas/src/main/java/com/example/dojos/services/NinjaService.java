package com.example.dojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dojos.models.Ninja;
import com.example.dojos.repository.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository ninjaRepository;

	public List<Ninja> findByDojoId(long dojoId) {
		return ninjaRepository.findByDojoId(dojoId);
	}

} 
