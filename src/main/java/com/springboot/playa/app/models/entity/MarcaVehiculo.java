package com.springboot.playa.app.models.entity;

public enum MarcaVehiculo {
    AUDI("AUDI1"),
    CHEVROLET("CHEVROLET1"),
    BMW("BMW"),
    FIAT("FIAT"),
    PEUGEOT("PEUGEOT"),
    VOLVO("VOLVO"),
    CITROEN("CITROEN"),
    CHRYSLER("CHRYSLER"),
    OTRO("OTRO");

    private final String displayName;

    MarcaVehiculo(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
