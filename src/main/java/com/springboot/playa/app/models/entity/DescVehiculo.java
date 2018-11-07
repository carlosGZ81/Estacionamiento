
package com.springboot.playa.app.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "desc_vehiculos")
public class DescVehiculo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long id;
    //variables
    private String descVehic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getdescVehic() {
        return descVehic;
    }

    public void setdescVehic(String desc_vehic) {
        this.descVehic = desc_vehic;
    }    
    
}
