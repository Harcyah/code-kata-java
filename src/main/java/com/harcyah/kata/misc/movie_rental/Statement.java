package com.harcyah.kata.misc.movie_rental;

import lombok.Getter;

import java.util.List;

@Getter
public class Statement {

    private final String name;
    private final List<Rental> rentals;
    private final double totalAmount;
    private final int renterPoints;

    public Statement(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
        this.totalAmount = rentals.stream().mapToDouble(Rental::getCost).sum();
        this.renterPoints = rentals.stream().mapToInt(Rental::getRenterPoints).sum();
    }

}
