package model;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class Product {
    
    private int id;
    private int currentPrice;
    private int stock;
    private Supplier personSupplier;
    private String category;


    public Product(int id, int currentPrice, int stock, Supplier personSupplier, String category) {
        this.id = id;
        this.currentPrice = currentPrice;
        this.stock = stock;
        this.personSupplier = personSupplier;
        this.category = category;
    }

    


    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return int return the currentPrice
     */
    public int getCurrentPrice() {
        return currentPrice;
    }

    /**
     * @param currentPrice the currentPrice to set
     */
    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * @return int return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return Supplier return the personSupplier
     */
    public Supplier getPersonSupplier() {
        return personSupplier;
    }

    /**
     * @param personSupplier the personSupplier to set
     */
    public void setPersonSupplier(Supplier personSupplier) {
        this.personSupplier = personSupplier;
    }

    /**
     * @return String return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

}