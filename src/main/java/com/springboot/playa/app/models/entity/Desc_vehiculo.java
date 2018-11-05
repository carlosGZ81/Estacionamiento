
package com.springboot.playa.app.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "desc_vehiculos")
public class Desc_vehiculo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long id;
    private String desc_vehic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc_marca_vehic() {
        return desc_vehic;
    }

    public void setDesc_marca_vehic(String desc_marca_vehic) {
        this.desc_vehic = desc_marca_vehic;
    }
    
    
}
