package model;

import java.util.List;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class Customer extends Person {

    public Customer(String name, double rut, int numberPhone, List<Address> addresses) {
        super(name, rut, numberPhone, addresses);
    }

}