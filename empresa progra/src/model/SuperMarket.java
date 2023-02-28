package model;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class SuperMarket {
    
    private List<Product> newProduct;
    private List<Customer> personCustomer;
    private List<Supplier> personSupplier;

    public SuperMarket() {
    }

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

    /**
     * @param productSell
     * @return
     * @throws IOException
     */
    public Product addProduct(Product productSell) throws IOException {
        newProduct = new ArrayList<>() ;
        newProduct.add(productSell);
        File archive = new File("product.txt");
        if(!archive.exists()){
            try {
                archive.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try (BufferedWriter archiveProduct = new BufferedWriter(new FileWriter("product.txt",true))) {
                archiveProduct.write(String.valueOf(productSell));
            }
        }
        
        return (Product) newProduct;
    }


    public void createCustomer(String name, double rut, int numberPhone, Address address){
        List <Address> addresses = new ArrayList<>();
        addresses.add(address);
        Customer customer = new Customer(name, rut, numberPhone, addresses);
        addCustomer(customer);
    }

    public void addCustomer(Customer customer) {
        try {
            FileWriter fileWriter = new FileWriter("empresa progra/src/resources/customers.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.getName() + "," + customer.getRut() + "," + customer.getNumberPhone() + "," + customer.getAddresses() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            //No debe imprimir acá
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void createSuplier (String name, double rut, int numberPhone, List<Address> addresses, String webSite){
        Supplier supplier = new Supplier(name, rut, numberPhone, addresses, webSite);
        addSuplier(supplier);
    }

    private void addSuplier(Supplier supplier) {
        try {
            FileWriter fileWriter = new FileWriter("empresa progra/src/resources/suppliers.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(supplier.getName() + "," + supplier.getRut() + "," + supplier.getNumberPhone() + "," + supplier.getAddresses() + "," + supplier.getWebSite() +  "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            //No debe imprimir acá
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public List<Address> createAddress(String city, String neighborhood, String addressTypeOfRoad, String quadrant, String generatingPathway, String licensePlate){
        Address address = new Address(city,neighborhood,addressTypeOfRoad,quadrant,generatingPathway,licensePlate);
        List<Address> addresses = new ArrayList<>();
        addresses.add(address);
        return addresses;
    }



    @Override
    public String toString() {
        return "SuperMarket [newProduct=" + newProduct + ", personCustomer=" + personCustomer + ", personSupplier="
                + personSupplier + "]";
    }


}