package org.example.service;

import org.example.model.Client;
import org.example.model.Rental;

import java.util.ArrayList;

public interface IRentalService {


        void add(Rental rental);

        void deleteById(Long id);

        ArrayList findAll();

        Client findById(String id);

        void update(Rental rental);
}

