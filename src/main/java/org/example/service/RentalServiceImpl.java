package org.example.service;

import org.example.model.Client;
import org.example.model.Rental;

import java.util.ArrayList;

public class RentalServiceImpl implements IRentalService {

    private IRentalRepository repository;

    public RentalServiceImpl(){

        repository= new rentalRepository;

    }



    @Override
    public void add(IRentalService rental) {
        repository.add( rental);
    }

    @Override
    public void deleteById(Long idRental) {
        repository.deleteById(idRental);
    }

    @Override
    public ArrayList findAll() {
        return repository.findAll();
    }

    @Override
    public Client findById(String idRental) {
        return repository.findById(idRental);
    }

    @Override
    public void update(IRentalService rental) {
        repository.update(rental);
    }
}
