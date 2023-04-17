package org.example.repository;

import org.example.model.Car;
import org.example.model.Client;

import java.util.ArrayList;

public interface ICarRepository {

    void add(Car car);
    void deleteById(Long id);
    ArrayList findAll();
    public Long nextIdAvailable();
    Car findById(Long id);
    Car findByLicensePlate(String licensePlate);
    void update(Car car);
}
