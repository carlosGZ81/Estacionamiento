
package com.springboot.playa.app.models.dao;

import com.springboot.playa.app.models.entity.Ingreso;
import org.springframework.data.repository.CrudRepository;


public interface IIngresoDao extends CrudRepository<Ingreso, Long>{
    
}
