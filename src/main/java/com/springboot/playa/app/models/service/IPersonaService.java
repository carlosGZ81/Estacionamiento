package com.springboot.playa.app.models.service;

import com.springboot.playa.app.models.entity.Persona;
import java.util.List;

public interface IPersonaService {
        public List<Persona> findAll();
	public Persona findOne(Long id);
	public void save (Persona persona);
	public void delete (Long id);
	//public Persona saveAPI(Persona persona);
}
