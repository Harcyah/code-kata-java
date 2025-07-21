package com.harcyah.kata.misc.movie_rental;

public class StatementHtmlRenderer {

    public String render(Statement statement) {
        StringBuilder builder = new StringBuilder();

        builder.append("<h1>Rental Record for <em>");
        builder.append(statement.getName());
        builder.append("</em></h1>\n");

        builder.append("<table>\n");
        for (Rental rental : statement.getRentals()) {
            builder.append("  <tr><td>");
            builder.append(rental.getMovieTitle());
            builder.append("</td><td>");
            builder.append(rental.getCost());
            builder.append("</td></tr>\n");
        }
        builder.append("</table>\n");

        builder.append("<p>Amount owed is <em>").append(statement.getTotalAmount()).append("</em></p>\n");
        builder.append("<p>You earned <em>").append(statement.getRenterPoints()).append("</em> frequent renter points</p>");
        builder.append("\n");

        return builder.toString();
    }

}
