package com.harcyah.kata.misc.movie_rental;

public class StatementTextRenderer {

    public String render(Statement statement) {
        StringBuilder builder = new StringBuilder();

        builder.append("Rental Record for ");
        builder.append(statement.getName());
        builder.append("\n");

        for (Rental rental : statement.getRentals()) {
            builder.append("    ");
            builder.append(rental.getMovieTitle());
            builder.append("    ");
            builder.append(rental.getCost());
            builder.append("\n");
        }

        builder.append("Amount owed is ").append(statement.getTotalAmount()).append("\n");
        builder.append("You earned ").append(statement.getRenterPoints()).append(" frequent renter points");
        builder.append("\n");

        return builder.toString();
    }

}
