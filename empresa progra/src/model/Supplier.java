package model;

import java.util.List;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class Supplier extends Person{
    
    private String webSite;

    /**
     * @param name
     * @param rut
     * @param numberPhone
     * @param addresses
     * @param webSite
     */
    public Supplier(String name, double rut, int numberPhone, List<Address> addresses, String webSite) {
        super(name, rut, numberPhone, addresses);
        this.webSite = webSite;
    }

    /**
     * @return String return the webSite
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * @param webSite the webSite to set
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public String toString() {
        return "Supplier [webSite=" + webSite + "]";
    }

    
}