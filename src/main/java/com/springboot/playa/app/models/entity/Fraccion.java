/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.playa.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fracciones")
public class Fraccion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    //variables
    private Float valorFraccion;
    private Integer tiempoFraccion;
    private Date fechaDesde;
    private Date fechaHasta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getValorFraccion() {
        return valorFraccion;
    }

    public void setValorFraccion(Float valorFraccion) {
        this.valorFraccion = valorFraccion;
    }

    public Integer getTiempoFraccion() {
        return tiempoFraccion;
    }

    public void setTiempoFraccion(Integer tiempoFraccion) {
        this.tiempoFraccion = tiempoFraccion;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    
    
}
