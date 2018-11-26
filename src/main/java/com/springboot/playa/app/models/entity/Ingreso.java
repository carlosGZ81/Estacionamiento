package com.springboot.playa.app.models.entity;



import java.io.Serializable;
//import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
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
    
    @Column(name = "fec_ing")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaDesde;
    
    @Column(name= "fec_egre")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaHasta;
    
    @Column(name = "fraccion_tiempo")
    private Integer tiempoIngreso;
    @Column(name = "valor_deuda")
    private Double valorDeuda;
    @Column(name = "estado_Deuda")
    private String estadoDeuda;
    
    
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createAt;
    
    //asociacion con vehiculo
    @ManyToOne(fetch = FetchType.LAZY)
    private Vehiculo vehiculo;
    
    //@OneToOne
    //private Deuda deuda;

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

    public Integer getTiempoIngreso() {
        return tiempoIngreso;
    }

   public void setTiempoIngreso(Integer tiempoIngreso) {
        this.tiempoIngreso = tiempoIngreso;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

//    public Deuda getDeuda() {
//        return deuda;
//    }
//
//    public void setDeuda(Deuda deuda) {
//        this.deuda = deuda;
//    }

    public String getEstadoDeuda() {
        return estadoDeuda;
    }

    public void setEstadoDeuda(String estadoDeuda) {
        this.estadoDeuda = estadoDeuda;
    }

    public Double getValorDeuda() {
      //  valorDeuda = tiempoIngreso * 2.5;
        return valorDeuda;
    }

    public void setValorDeuda(Double valorDeuda) {
        this.valorDeuda = valorDeuda;
    }
  
//    public Integer getFraccion(){
//        // esto despues lo tengo que cambiar tomandolo desde fecha inicio y fecha fin
//        tiempoIngreso = 60;
//        return tiempoIngreso.intValue()/15;
//    }       
           
    private static final long serialVersionUID = 1L;
}
