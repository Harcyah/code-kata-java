package com.harcyah.kata.misc.movie_rental;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Customer {

    private final List<Rental> rentals = new ArrayList<>();

    private final String name;

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public Statement getStatement() {
        return new Statement(name, rentals);
    }

}
