package com.edu.uptc.prgII.Enterprice.model;

import java.util.List;

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
