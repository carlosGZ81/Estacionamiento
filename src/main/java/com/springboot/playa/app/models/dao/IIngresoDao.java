
package com.springboot.playa.app.models.dao;

import com.springboot.playa.app.models.entity.Ingreso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 @Repository
public interface IIngresoDao extends CrudRepository<Ingreso, Long>{
    
}
