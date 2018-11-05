
package com.springboot.playa.app.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tipo_vehiculos")
public class Tipo_vehiculo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long id;
    private String tipo_vehic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_vehic() {
        return tipo_vehic;
    }

    public void setTipo_vehic(String tipo_vehic) {
        this.tipo_vehic = tipo_vehic;
    }
    
    
}
