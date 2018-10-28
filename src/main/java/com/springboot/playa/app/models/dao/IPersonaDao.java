package com.springboot.playa.app.models.dao;

import com.springboot.playa.app.models.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
