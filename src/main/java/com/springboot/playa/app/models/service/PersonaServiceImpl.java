package com.springboot.playa.app.models.service;

import com.springboot.playa.app.models.dao.IPersonaDao;
import com.springboot.playa.app.models.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

@Service
public class PersonaServiceImpl implements IPersonaService {

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
        return personaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        personaDao.deleteById(id);
    }
    
    @Override
    public Page<Persona> findAll(Pageable pageable) {  
        return personaDao.findAll(pageable);
    }
    
    /*@Override
    public Persona saveAPI(Persona vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
}
