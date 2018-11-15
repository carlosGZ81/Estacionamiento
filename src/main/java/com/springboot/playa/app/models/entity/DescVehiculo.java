
package com.springboot.playa.app.models.entity;




public enum DescVehiculo{
    
   SEDAN3P("SEDAN 3 PUERTAS"),
   SEDAN4P("SEDAN 4 PUERTAS");

    private final String displayName;

    DescVehiculo(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
