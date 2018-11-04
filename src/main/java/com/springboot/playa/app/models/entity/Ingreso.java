
package com.springboot.playa.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ingresos")
public class Ingreso implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long id;
    
    private Long id_persona;
    private Long id_operador;
    private Date fecha_desde;
    private Date fecha_hasta;
    private Date tiempo_ingreso;
    
   @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createAt;

    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public Long getId_operador() {
        return id_operador;
    }

    public void setId_operador(Long id_operador) {
        this.id_operador = id_operador;
    }

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Date fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public Date getTiempo_ingreso() {
        return tiempo_ingreso;
    }

    public void setTiempo_ingreso(Date tiempo_ingreso) {
        this.tiempo_ingreso = tiempo_ingreso;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    
    
    
}
