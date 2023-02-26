package model;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class SuperMarket {
    private Product[] newProduct;
    private Customer[] personCustomer;
    private Supplier[] personSupplier;
    public SuperMarket(Product[] newProduct, Customer[] personCustomer, Supplier[] personSupplier) {
        this.newProduct = newProduct;
        this.personCustomer = personCustomer;
        this.personSupplier = personSupplier;
    }
    public Product[] getNewProduct() {
        return newProduct;
    }
    public void setNewProduct(Product[] newProduct) {
        this.newProduct = newProduct;
    }
    public Customer[] getPersonCustomer() {
        return personCustomer;
    }
    public void setPersonCustomer(Customer[] personCustomer) {
        this.personCustomer = personCustomer;
    }
    public Supplier[] getPersonSupplier() {
        return personSupplier;
    }
    public void setPersonSupplier(Supplier[] personSupplier) {
        this.personSupplier = personSupplier;
    }


}