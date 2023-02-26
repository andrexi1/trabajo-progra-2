package model;

import java.util.List;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class Person  {
    private String name;
    private double rut;
    private int numberPhone;
    private List<Address> addresses;



    
    /**
     * @param name
     * @param rut
     * @param numberPhone
     * @param addresses
     */
    public Person(String name, double rut, int numberPhone, List<Address> addresses) {
        this.name = name;
        this.rut = rut;
        this.numberPhone = numberPhone;
        this.addresses = addresses;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the rut
     */
    public double getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(double rut) {
        this.rut = rut;
    }

    /**
     * @return int return the numberPhone
     */
    public int getNumberPhone() {
        return numberPhone;
    }

    /**
     * @param numberPhone the numberPhone to set
     */
    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    /**
     * @return Address [] return the addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * @param addresses the addresses to set
     */
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

}