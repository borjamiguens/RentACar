package org.example.model;

public class Car {



    private Long id;
    private String licensePlate;


    public Car(Long id, String licensePlate) {
        this.id = id;
        this.licensePlate = licensePlate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String setLicensePlate(){
        return licensePlate;
    }



}
