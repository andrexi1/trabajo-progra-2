package model;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class Customer extends Person {

    /**
     * @param name
     * @param rut
     * @param numberPhone
     * @param addresses
     */
    public Customer(String name, double rut, int numberPhone, List<Address> addresses) {
        super(name, rut, numberPhone, addresses);
    }


    @Override
    public String toString() {
        return "Customer []";
    }



}
