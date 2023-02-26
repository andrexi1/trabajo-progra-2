package model;

import java.util.List;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class Supplier extends Person{
    private String webSite;

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

}