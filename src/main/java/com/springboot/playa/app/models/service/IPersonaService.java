package com.springboot.playa.app.models.service;

import com.springboot.playa.app.models.entity.Persona;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPersonaService {
        public List<Persona> findAll();
        
        public Page<Persona> findAll(Pageable pageable);
        
	public Persona findOne(Long id);
        
	public void save (Persona persona);
        
	public void delete (Long id);
        
	//public Persona saveAPI(Persona persona);
}
