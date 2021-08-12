package com.harcyah.kata.misc.movie_rental;

import org.junit.jupiter.api.Test;

import static com.harcyah.kata.misc.movie_rental.Category.CHILDRENS;
import static com.harcyah.kata.misc.movie_rental.Category.NEW_RELEASE;
import static com.harcyah.kata.misc.movie_rental.Category.REGULAR;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Source: https://codingdojo.org/kata/movie-rental/
public class CustomerTest {

    @Test
    public void testTextRenderer() {
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(new Movie("Jaws", REGULAR), 2));
        customer.addRental(new Rental(new Movie("Golden Eye", REGULAR), 3));
        customer.addRental(new Rental(new Movie("Short New", NEW_RELEASE), 1));
        customer.addRental(new Rental(new Movie("Long New", NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("Bambi", CHILDRENS), 3));
        customer.addRental(new Rental(new Movie("Toy Story", CHILDRENS), 4));

        String expected = "" +
            "Rental Record for Bob\n" +
            "\tJaws\t2.0\n" +
            "\tGolden Eye\t3.5\n" +
            "\tShort New\t3.0\n" +
            "\tLong New\t6.0\n" +
            "\tBambi\t1.5\n" +
            "\tToy Story\t3.0\n" +
            "Amount owed is 19.0\n" +
            "You earned 7 frequent renter points";

        StatementTextRenderer renderer = new StatementTextRenderer();
        String actual = renderer.render(customer.getStatement());
        assertEquals(expected, actual);
    }

    @Test
    public void testHtmlRenderer() {
        Customer customer = new Customer("martin");
        customer.addRental(new Rental(new Movie("Jaws", REGULAR), 2));
        customer.addRental(new Rental(new Movie("Short New", NEW_RELEASE), 1));
        customer.addRental(new Rental(new Movie("Long New", NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("Bambi", CHILDRENS), 3));
        customer.addRental(new Rental(new Movie("Toy Story", CHILDRENS), 4));

        String expected = "" +
            "<h1>Rental Record for <em>martin</em></h1>\n" +
            "<table>\n" +
            "  <tr><td>Jaws</td><td>2.0</td></tr>\n" +
            "  <tr><td>Short New</td><td>3.0</td></tr>\n" +
            "  <tr><td>Long New</td><td>6.0</td></tr>\n" +
            "  <tr><td>Bambi</td><td>1.5</td></tr>\n" +
            "  <tr><td>Toy Story</td><td>3.0</td></tr>\n" +
            "</table>\n" +
            "<p>Amount owed is <em>15.5</em></p>\n" +
            "<p>You earned <em>6</em> frequent renter points</p>";

        StatementHtmlRenderer renderer = new StatementHtmlRenderer();
        String actual = renderer.render(customer.getStatement());
        assertEquals(expected, actual);
    }

}
