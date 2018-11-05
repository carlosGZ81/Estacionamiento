package com.springboot.playa.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.springboot.playa.app.models.entity.Vehiculo;
import org.springframework.data.jpa.repository.Query;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Long>{
	
}
