package org.example.model;

public class Car {



    private int id;
    private String licensePlate;


    public Car(int id, String licensePlate) {
        this.id = id;
        this.licensePlate = licensePlate;
    }

    public int getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

}
