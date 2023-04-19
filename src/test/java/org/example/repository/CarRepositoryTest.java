package org.example.repository;

import org.example.model.Car;
import org.example.model.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarRepositoryTest {

    CarRepository repository;

    @BeforeEach
    void setUp() {

        repository = new CarRepository();
        Car car1 = new Car(128L,"4567JKP");
        Car car2 = new Car(192L,"9876PYT");
        repository.add(car1);
        repository.add(car2);

    }

    @Test
    void add() {

        Car car3 = new Car(500L,"147TRW");
        Car car4 = new Car(501L,"1236DFG");
        repository.add(car3);
        Assertions.assertEquals(car3,repository.findById(500L));

    }

    @Test
    void deleteById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void nextIdAvailable() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByLicensePlate() {
    }

    @Test
    void update() {
    }
}