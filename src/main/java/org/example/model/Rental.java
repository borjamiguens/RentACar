package org.example.model;

import java.util.Date;

public class Rental {



    private Long id;
    private Date startDate;
    private Date endDate;

    private Car car;

    private Client client;



    public Rental(Long idRental , Date startDate, Date endDate, Car car, Client client) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.car = car;
        this.client = client;
        this.id=id;
    }



    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Car getCar() {
        return car;
    }

    public Client getClient() {
        return client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
