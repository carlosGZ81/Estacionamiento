package com.springboot.playa.app.models.dao;

//import org.springframework.data.repository.CrudRepository;
import com.springboot.playa.app.models.entity.Vehiculo;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IVehiculoDao extends PagingAndSortingRepository<Vehiculo, Long>{
	
}
