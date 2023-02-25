package org.OOP.ClassAndMethods.BikesShop;

public enum BikeType {
    Road("Road"),
    Graved("Graved"),
    Mountains("Mountains");

    private String types;

    BikeType(String types) {
        this.types = types;
    }

    public String getTypes() {
        return types;
    }
}
