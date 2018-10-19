package com.springboot.playa.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.playa.app.models.dao.IVehiculoDao;
import com.springboot.playa.app.models.entity.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoDao vehiculoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> findAll() {
		return (List<Vehiculo>)vehiculoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Vehiculo findOne(Long id) {
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void save(Vehiculo vehiculo) {
		vehiculoDao.save(vehiculo);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		vehiculoDao.deleteById(id);
	}

}
