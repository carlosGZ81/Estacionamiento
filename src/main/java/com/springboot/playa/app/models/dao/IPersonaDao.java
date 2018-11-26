package com.springboot.playa.app.models.dao;

import com.springboot.playa.app.models.entity.Persona;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IPersonaDao extends PagingAndSortingRepository<Persona, Long>{
    
}
