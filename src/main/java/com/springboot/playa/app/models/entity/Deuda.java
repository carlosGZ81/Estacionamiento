package com.springboot.playa.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "deudas")
public class Deuda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    //variables
    private Integer cantFraccion;
    private Double valorDeuda;
    
    //fecha de creacion
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createAt;
    
    //asociaciones
    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "")
    //private Ingreso ingreso;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantFraccion() {
        return cantFraccion;
    }

    public void setCantFraccion(Integer cantFraccion) {
        this.cantFraccion = cantFraccion;
    }

    //public Double getValorDeuda() {
      //  return valorDeuda * ingreso.getTiempoIngreso();
    //}

    public void setValorDeuda(Double valorDeuda) {
        this.valorDeuda = valorDeuda;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

   //public Ingreso getIngreso() {
     //   return ingreso;
    //}

    //public void setIngreso(Ingreso ingreso) {
      //  this.ingreso = ingreso;
    //}
     
}
