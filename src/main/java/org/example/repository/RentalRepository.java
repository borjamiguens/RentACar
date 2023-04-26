package org.example.repository;

import org.example.model.Car;
import org.example.model.Rental;

import java.util.ArrayList;

public class RentalRepository implements IRentalRepository{

    private final ArrayList<Rental> rentals;

    public RentalRepository(){

        rentals=new ArrayList();

    }

    @Override
    public void add(Rental rental) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public ArrayList findAll() {
        return null;
    }

    @Override
    public Long nextIdAvailable() {
        return null;
    }

//    @Override
//    public Rental findById(Long id) {
//        return null;
//    }

//    @Override
//    public Car findByLicensePlate(String licensePlate) {
//        return null;
//    }
//
    @Override
    public void update(Rental rental) {

    }
}
