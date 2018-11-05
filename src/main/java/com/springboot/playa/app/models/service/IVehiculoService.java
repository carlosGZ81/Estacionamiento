package com.springboot.playa.app.models.service;

import java.util.List;

import com.springboot.playa.app.models.entity.Vehiculo;
import org.springframework.data.jpa.repository.Query;

public interface IVehiculoService {

       
	public List<Vehiculo> findAll();
	public Vehiculo findOne(Long id);
	public void save (Vehiculo vehiculo);
	public void delete (Long id);
	public Vehiculo saveAPI(Vehiculo vehiculo);
}
