package com.springboot.playa.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "vehiculos")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //variables
    @NotEmpty
    private String dominio;
    //enumerador
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private TipoVehiculo tipoVehic;
    
    private Integer marca_vehic;
    private Integer desc_vehic;

    /*@NotNull*/
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createAt;

    //asociacion bidireccional
    @OneToMany(mappedBy = "vehiculo", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Ingreso> ingresos;

    //inicializacion de la lista
    public Vehiculo() {
        ingresos = new ArrayList<Ingreso>();
    }

    //para guardar la fecha de carga del registro
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

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    
    
    public Integer getMarca_vehic() {
        return marca_vehic;
    }

    public void setMarca_vehic(Integer marca_vehic) {
        this.marca_vehic = marca_vehic;
    }

    public Integer getDesc_vehic() {
        return desc_vehic;
    }

    public void setDesc_vehic(Integer desc_vehic) {
        this.desc_vehic = desc_vehic;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    public void addIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
    }
    private static final long serialVersionUID = 1L;

    public TipoVehiculo getTipoVehic() {
        return tipoVehic;
    }

    public void setTipoVehic(TipoVehiculo tipoVehic) {
        this.tipoVehic = tipoVehic;
    }
    
    
}
