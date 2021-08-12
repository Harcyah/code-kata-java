package com.harcyah.kata.misc.movie_rental;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Rental {

    private final Movie movie;
    private final int daysRented;

    public String getMovieTitle() {
        return movie.getTitle();
    }

    public double getCost() {
        return movie.getCategory().getCost(daysRented);
    }

    public int getRenterPoints() {
        return movie.getCategory().getRenterPoints(daysRented);
    }

}
