package org.example.model;

import java.util.Date;

public class Rental {



    private Long idRental;
    private Date startDate;
    private Date endDate;

    private Car car;

    private Client client;

    public Rental(Long idRental , Date startDate, Date endDate, Car car, Client client) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.car = car;
        this.client = client;
        this.idRental=idRental;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

}
