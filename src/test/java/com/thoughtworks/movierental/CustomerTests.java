package com.thoughtworks.movierental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    public void test() {
        Customer customer = new Customer("Dean");
        customer.addRental(new Rental(new Movie("The Call", Movie.NEW_RELEASE), 10));
        customer.addRental(new Rental(new Movie("Speed", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("Doll", Movie.CHILDRENS), 5));

        assertEquals("Rental Record for Dean\n" +
                "\tThe Call\t30.0\n" +
                "\tSpeed\t3.5\n" +
                "\tDoll\t4.5\n" +
                "Amount owed is 38.0\n" +
                "You earned 4 frequent renter points", customer.statement());
    }

}