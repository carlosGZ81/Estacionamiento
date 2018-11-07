
package com.springboot.playa.app.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "marca_vehiculos")
public class MarcaVehiculo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long id;
    private String marca_vehic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca_vehic() {
        return marca_vehic;
    }

    public void setMarca_vehic(String marca_vehic) {
        this.marca_vehic = marca_vehic;
    }
    
    
}
