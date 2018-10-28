package com.springboot.playa.app.models.service;

import com.springboot.playa.app.models.dao.IPersonaDao;
import com.springboot.playa.app.models.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements IPersonaService{
    
    @Autowired
    private IPersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    @Transactional
    public void save(Persona vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    @Transactional
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*@Override
    public Persona saveAPI(Persona vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
    
}
