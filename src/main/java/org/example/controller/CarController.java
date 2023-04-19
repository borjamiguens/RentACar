package org.example.controller;

import org.example.model.Car;
import org.example.service.CarServiceImpl;
import org.example.service.ICarService;

import java.util.ArrayList;

public class CarController {


        private ICarService service;
        public CarController() {
            service = new CarServiceImpl();
        }

        public void add(Long id, String licensePlate){
            Car car = new Car(id,licensePlate);
            service.add(car);

        }

        public void deleteById(Long id){
            service.deleteById(id);

        }

        public ArrayList findAll(){
            return service.findAll();
        }

        public Car findByLicensePlate(String licensePlate){

            return service.findByLicensePlate(licensePlate);
        }

        public void update(Long id, String licensePlate){
            Car car = new Car(id,licensePlate);
            service.update(car);
        }


    }



