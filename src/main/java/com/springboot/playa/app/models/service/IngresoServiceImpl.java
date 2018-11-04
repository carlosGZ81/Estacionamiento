package com.springboot.playa.app.models.service;

import com.springboot.playa.app.models.dao.IIngresoDao;
import com.springboot.playa.app.models.entity.Ingreso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class IngresoServiceImpl implements IIngresoService{
    
    @Autowired
    private IIngresoDao ingresoDao;

    @Override
    @Transactional (readOnly = true)
    public List<Ingreso> findAll() {
        return(List<Ingreso>) ingresoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Ingreso findOne(Long id) {
        return ingresoDao.findById(id).orElse(null);
    }

    @Override
    public void save(Ingreso ingreso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
