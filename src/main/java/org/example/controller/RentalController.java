package org.example.controller;

import org.example.model.Car;
import org.example.model.Client;
import org.example.model.Rental;
import org.example.service.IRentalService;
import org.example.service.RentalServiceImpl;

import java.util.Date;

public class RentalController {

    private IRentalService service;

    public RentalController(){
        service=new RentalServiceImpl();
    }

    public void add(Long id, Car car, Client client, Date startDate, Date endDate){
        Rental rental=new Rental(id,startDate,endDate,car,client);
        service.add(rental);

    }

}
