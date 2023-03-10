package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*

 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class SuperMarket {

	private static List<Product> newProduct;
	private static List<Customer> personCustomer;
	private static List<Supplier> personSupplier;

	public SuperMarket() {
	}

	/**
	 * Estee es el metodo conscructor de la clase.
	 * 
	 * @param newProduct
	 * @param personCustomer
	 * @param personSupplier
	 */
	public SuperMarket(List<Product> newProduct, List<Customer> personCustomer, List<Supplier> personSupplier) {
		SuperMarket.newProduct = newProduct;
		SuperMarket.personCustomer = personCustomer;
		SuperMarket.personSupplier = personSupplier;
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
		SuperMarket.newProduct = newProduct;
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
		SuperMarket.personCustomer = personCustomer;
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
		SuperMarket.personSupplier = personSupplier;
	}

	/**
	 * Este metodo crea productos y los almacena.
	 * 
	 * @param name
	 * @param id
	 * @param currentPrice
	 * @param stock
	 * @param personSupplier
	 * @param category
	 * @throws IOException
	 */
	public void createProduct(String name, int id, int currentPrice, int stock, Supplier personSupplier,
			String category) throws IOException {
		Product product = new Product(name, id, currentPrice, stock, personSupplier, category);
		addProduct(product);
	}

	/**
	 * Este metodo nos permite añadir y almacenar un prducto.
	 * 
	 * @param product
	 * @throws IOException
	 */
	public void addProduct(Product product) throws IOException {
		newProduct = new ArrayList<>();
		newProduct.add(product);

		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\Diego Patiño\\Documents\\GitHub\\trabajo-progra-2\\empresa progra\\src\\resources\\product.txt", true);
			BufferedWriter bufferedWriter;
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(product.getName() + "," + product.getId() + "," + product.getCurrentPrice() + ","
					+ product.getStock() + "," + product.getPersonSupplier() + "," + product.getCategory() + "\n");
			addSupplier(product.getPersonSupplier());
			bufferedWriter.close();
		} catch (IOException e) {
			// No debe imprimir acá
			System.out.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}

	/**
	 * Este metodo nos permite crear y almacenar un cliente.
	 * 
	 * @param name
	 * @param rut
	 * @param numberPhone
	 * @param address
	 */
	public void createCustomer(String name, double rut, int numberPhone, Address address) {
		List<Address> addresses = new ArrayList<>();
		addresses.add(address);
		Customer customer = new Customer(name, rut, numberPhone, addresses);
		addCustomer(customer);
	}

	/**
	 * Este metodo nos permite añadir y alacenar un cliente.
	 * 
	 * @param customer
	 */
	public void addCustomer(Customer customer) {
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\Diego Patiño\\Documents\\GitHub\\trabajo-progra-2\\empresa progra\\src\\resources\\customers.txt", true);
			BufferedWriter bufferedWriter;
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(customer.getName() + "," + customer.getRut() + "," + customer.getNumberPhone() + ","
					+ customer.getAddresses() + "\n");
			bufferedWriter.close();
		} catch (IOException e) {
			// No debe imprimir acá
			System.out.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}

	/**
	 * Este metodo nos permite crear un proveedor.
	 * 
	 * @param name
	 * @param rut
	 * @param numberPhone
	 * @param addresses
	 * @param webSite
	 * @return
	 */
	public Supplier createSupplier(String name, double rut, int numberPhone, List<Address> addresses, String webSite) {
		Supplier supplier = new Supplier(name, rut, numberPhone, addresses, webSite);
		addSupplier(supplier);
		return supplier;
	}

	/**
	 * Este metodo nos añade y almacena un proveedor.
	 * 
	 * @param supplier
	 */
	private void addSupplier(Supplier supplier) {
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\Diego Patiño\\Documents\\GitHub\\trabajo-progra-2\\empresa progra\\src\\resources\\suppliers.txt", true);
			BufferedWriter bufferedWriter;
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(supplier.getName() + "," + supplier.getRut() + "," + supplier.getNumberPhone() + ","
					+ supplier.getAddresses() + "," + supplier.getWebSite() + "\n");
			bufferedWriter.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}

	public static boolean addSell(int product, int quantity) {
		for (Product item : newProduct) {
			if (quantity > 0 && quantity <= item.getStock()) {
				item.setStock(item.getStock() - quantity);
				item.setQuantitySold(item.getQuantitySold() + quantity);
				return true;
			}

		}
		return false;
	}

	/**
	 * Este metodo nos permite revisar si el inventario esta vacio.
	 * 
	 * @return retorna un boolean que denota si esta vacio o no el inventario.
	 */
	public static boolean isEmptyInventory() {
		return newProduct.isEmpty();
	}

	/**
	 * Este metodo nos permite identificar el numero de productos disponibles.
	 * 
	 * @return retorna un entero que denota los productos disponibles.
	 */
	public static int countProducts() {
		return newProduct.size();
	}

	/**
	 * Este metodo nos permite crear objetos de la clase Addres.
	 * 
	 * @param city
	 * @param neighborhood
	 * @param addressTypeOfRoad
	 * @param quadrant
	 * @param generatingPathway
	 * @param licensePlate
	 * @return
	 */
	public List<Address> createAddress(String city, String neighborhood, String addressTypeOfRoad, String quadrant,
			String generatingPathway, String licensePlate) {
		Address address = new Address(city, neighborhood, addressTypeOfRoad, quadrant, generatingPathway, licensePlate);
		List<Address> addresses = new ArrayList<>();
		addresses.add(address);
		return addresses;
	}

	/**
	 * Este es el metodo que nos convierte a una cadena de Strings los datos de
	 * SuperMarket.
	 */
	public static String toStringVa() {
		return "SuperMarket [newProduct=" + newProduct + ", personCustomer=" + personCustomer + ", personSupplier="
				+ personSupplier + "]";
	}

}