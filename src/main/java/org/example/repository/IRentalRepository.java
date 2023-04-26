package org.example.repository;

import org.example.model.Car;
import org.example.model.Rental;

import java.util.ArrayList;

public interface IRentalRepository {

    void add(Rental rental);
    void deleteById(Long id);
    ArrayList findAll();
    public Long nextIdAvailable();
//    Car findById(Long id);
//    Car findByLicensePlate(String licensePlate);
    void update(Rental rental);

}
