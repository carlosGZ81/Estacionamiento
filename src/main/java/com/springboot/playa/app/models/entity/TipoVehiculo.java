package com.springboot.playa.app.models.entity;

public enum TipoVehiculo {
    AUTO ("auto"),
    MOTO ("moto"),
    CAMIONETA("camioneta"),
    CAMION("camion"),
    UTILITARIO("utilitario"),
    OTRO("otro");
    
   
     private final String displayName;

    TipoVehiculo(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
