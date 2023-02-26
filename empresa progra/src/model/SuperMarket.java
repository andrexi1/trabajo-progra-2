package model;


import java.util.List;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class SuperMarket {
    
    private List<Product> newProduct;
    private List<Customer> personCustomer;
    private List<Supplier> personSupplier;

    /**
     * @param newProduct
     * @param personCustomer
     * @param personSupplier
     */
    public SuperMarket(List<Product> newProduct, List<Customer> personCustomer,
            List<Supplier> personSupplier) {
        this.newProduct = newProduct;
        this.personCustomer = personCustomer;
        this.personSupplier = personSupplier;
    }

    /**
     * @return
     */
    public List<Product> getNewProduct() {
        return newProduct;
    }

    /**
     * @param newProduct
     */
    public void setNewProduct(List<Product> newProduct) {
        this.newProduct = newProduct;
    }

    /**
     * @return
     */
    public List<Customer> getPersonCustomer() {
        return personCustomer;
    }

    /**
     * @param personCustomer
     */
    public void setPersonCustomer(List<Customer> personCustomer) {
        this.personCustomer = personCustomer;
    }
    /**
     * @return
     */
    public List<Supplier> getPersonSupplier() {
        return personSupplier;
    }
    /**
     * @param personSupplier
     */
    public void setPersonSupplier(List<Supplier> personSupplier) {
        this.personSupplier = personSupplier;
    }

    

}