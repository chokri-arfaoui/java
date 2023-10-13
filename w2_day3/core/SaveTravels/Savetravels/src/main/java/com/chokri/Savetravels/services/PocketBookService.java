package com.chokri.Savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chokri.Savetravels.models.Pocketbook;
import com.chokri.Savetravels.repositories.PocketbookRepository;

@Service
public class PocketBookService {
	
	@Autowired
	private PocketbookRepository pocketbookRepository;

//	C R U D
//	READ ALL
	public List<Pocketbook>findAll(){
		return pocketbookRepository.findAll();
	}
//	 CREATE
	public Pocketbook createPocketBook(Pocketbook pocketbook) {
		return  pocketbookRepository.save(pocketbook);
	}
//	READ ONE
	public Pocketbook findPocketBook(Long id) {
		Optional<Pocketbook> onePocketBook=pocketbookRepository.findById(id);  
		if(onePocketBook.isPresent()) {
			return onePocketBook.get();
			
		}else {
			return(null);
		}
				
	}
	// UPDATE 
		public Pocketbook updateBook(Pocketbook pocketbook) {
			return pocketbookRepository.save(pocketbook);
		}
		
	// DELETE
		public void deletePocketBook(Long id) {
			pocketbookRepository.deleteById(id);
		}

		
}
