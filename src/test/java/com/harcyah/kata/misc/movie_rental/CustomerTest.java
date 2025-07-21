package com.harcyah.kata.misc.movie_rental;

import org.junit.jupiter.api.Test;

import static com.harcyah.kata.misc.movie_rental.Category.CHILDRENS;
import static com.harcyah.kata.misc.movie_rental.Category.NEW_RELEASE;
import static com.harcyah.kata.misc.movie_rental.Category.REGULAR;
import static io.hosuaby.inject.resources.core.InjectResources.resource;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Source: https://codingdojo.org/kata/movie-rental/
class CustomerTest {

    @Test
    void textRenderer() {
        // Given
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(new Movie("Jaws", REGULAR), 2));
        customer.addRental(new Rental(new Movie("Golden Eye", REGULAR), 3));
        customer.addRental(new Rental(new Movie("Short New", NEW_RELEASE), 1));
        customer.addRental(new Rental(new Movie("Long New", NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("Bambi", CHILDRENS), 3));
        customer.addRental(new Rental(new Movie("Toy Story", CHILDRENS), 4));
        StatementTextRenderer renderer = new StatementTextRenderer();

        // When
        String actual = renderer.render(customer.getStatement());

        // Then
        String expected = resource().withPath("com/harcyah/kata/misc/movie_rental/result.text").text();
        assertEquals(expected, actual);
    }

    @Test
    void htmlRenderer() {
        // Given
        Customer customer = new Customer("martin");
        customer.addRental(new Rental(new Movie("Jaws", REGULAR), 2));
        customer.addRental(new Rental(new Movie("Short New", NEW_RELEASE), 1));
        customer.addRental(new Rental(new Movie("Long New", NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("Bambi", CHILDRENS), 3));
        customer.addRental(new Rental(new Movie("Toy Story", CHILDRENS), 4));
        StatementHtmlRenderer renderer = new StatementHtmlRenderer();

        // When
        String actual = renderer.render(customer.getStatement());

        // Then
        String expected = resource().withPath("com/harcyah/kata/misc/movie_rental/result.html").text();
        assertEquals(expected, actual);
    }

}
