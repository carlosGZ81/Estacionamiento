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
import javax.validation.constraints.NotEmpty;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "vehiculos")
public class Vehiculo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String dominio;
	private Integer tipo_vehic;
	private Integer marca_vehic;
	private Integer desc_vehic;
	
	/*@NotNull*/
	@Column(name ="create_at")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
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
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public Integer getTipo_vehic() {
		return tipo_vehic;
	}
	public void setTipo_vehic(Integer tipo_vehic) {
		this.tipo_vehic = tipo_vehic;
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
	
	

}
