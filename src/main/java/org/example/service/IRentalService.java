package org.example.service;

import org.example.model.Client;

import java.util.ArrayList;

public interface IRentalService {



        void add(org.example.service.IRentalService rental);
        void deleteById(Long idRental);
        ArrayList findAll();
        Client findById(String idRental);
        void update(org.example.service.IRentalService rental);


}
