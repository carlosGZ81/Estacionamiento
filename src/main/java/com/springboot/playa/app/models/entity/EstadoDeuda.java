/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.playa.app.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado_deudas")
public class EstadoDeuda implements Serializable{
       
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long id;
    
    private String desc_deuda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc_deuda() {
        return desc_deuda;
    }

    public void setDesc_deuda(String desc_deuda) {
        this.desc_deuda = desc_deuda;
    }
    
    
}
