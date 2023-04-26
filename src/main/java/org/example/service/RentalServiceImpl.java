package org.example.service;

import org.example.model.Client;
import org.example.model.Rental;
import org.example.repository.IRentalRepository;
import org.example.repository.RentalRepository;

import java.util.ArrayList;

public class RentalServiceImpl implements IRentalService {

    private IRentalRepository repository;

    public RentalServiceImpl(){

        repository= new RentalRepository();

    }



    @Override
    public void add(Rental rental) {
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
    public Client findById(String id) {
        return null;
    }

//    @Override
//    public Client findById(String idRental) {
//        return repository.findById(idRental);
//    }

    @Override
    public void update(Rental rental) {
        repository.update(rental);
    }
}
