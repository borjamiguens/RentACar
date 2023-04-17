package org.example.repository;

import org.example.model.Car;
import org.example.model.Client;

import java.util.ArrayList;

public class CarRepository implements ICarRepository {

    private final ArrayList<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();
    }

    @Override
    public void add(Car car) {
        car.setId(nextIdAvailable());
        cars.add(car);
    }

    @Override
    public void deleteById(Long id) {
        for(Car car: cars){
            if(car.getId()==id){
                cars.remove(car);
            }
        }
    }

    @Override
    public ArrayList findAll() {
        return cars;
    }

    @Override
    public Long nextIdAvailable() {
        return null;
    }

    @Override
    public Car findById(Long id) {
        for(Car car:cars){
            if(car.getId()==id){
                return car;
            }
        }
        return null;
    }

    @Override
    public Car findByLicensePlate(String licensePlate) {
        for(Car car:cars){
            if(car.getLicensePlate().equals(licensePlate)){
                return car;
            }
        }
        return null;
    }

    @Override
    public void update(Car car) {

    }
}
