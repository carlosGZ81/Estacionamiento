/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.playa.app.models.service;

import com.springboot.playa.app.models.entity.Ingreso;
import com.springboot.playa.app.models.entity.Persona;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface IIngresoService {
        public List<Ingreso> findAll();
	public Ingreso findOne(Long id);
	public void save (Ingreso ingreso);
	public void delete (Long id);
}
