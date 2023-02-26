package model;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class Address {
    
    private String city;
    private String neighborhood;
    private String addressTypeOfRoad;
    private String quadrant;
    private String generatingPathway;
    private String licensePlate;

    

    /**
     * @param city
     * @param neighborhood
     * @param addressTypeOfRoad
     * @param quadrant
     * @param generatingPathway
     * @param licensePlate
     */
    public Address(String city, String neighborhood, String addressTypeOfRoad, String quadrant,
            String generatingPathway, String licensePlate) {
        this.city = city;
        this.neighborhood = neighborhood;
        this.addressTypeOfRoad = addressTypeOfRoad;
        this.quadrant = quadrant;
        this.generatingPathway = generatingPathway;
        this.licensePlate = licensePlate;
    }

    /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return String return the neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * @param neighborhood the neighborhood to set
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * @return String return the addressTypeOfRoad
     */
    public String getAddressTypeOfRoad() {
        return addressTypeOfRoad;
    }

    /**
     * @param addressTypeOfRoad the addressTypeOfRoad to set
     */
    public void setAddressTypeOfRoad(String addressTypeOfRoad) {
        this.addressTypeOfRoad = addressTypeOfRoad;
    }

    /**
     * @return String return the quadrant
     */
    public String getQuadrant() {
        return quadrant;
    }

    /**
     * @param quadrant the quadrant to set
     */
    public void setQuadrant(String quadrant) {
        this.quadrant = quadrant;
    }

    /**
     * @return String return the generatingPathway
     */
    public String getGeneratingPathway() {
        return generatingPathway;
    }

    /**
     * @param generatingPathway the generatingPathway to set
     */
    public void setGeneratingPathway(String generatingPathway) {
        this.generatingPathway = generatingPathway;
    }

    /**
     * @return String return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}