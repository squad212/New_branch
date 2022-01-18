package com.trainning.sarita.Basicproject.OopsProject;

public class Address {
    private String streetName;
    private String apartmentNumber;
    private String city;
    private String state;
    private int zipCode;

    // creation

    public Address(String streetName, String apartmentNumber, String city, String state, int zipCode) {
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return streetName + " " + apartmentNumber+ " "+ city+ " "+state+ " "+zipCode+" ";


    }
}

