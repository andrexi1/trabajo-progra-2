package presenter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Address;
import model.SuperMarket;
import model.Supplier;
import view.View;

public class Presenter {
private View view;
	private SuperMarket superMarket;

	public Presenter() {
		view = new View();
		superMarket = new SuperMarket();
	}

	public void showMenu() throws IOException {
		view.showMessage(
				"Menu \n 1.Crear cliente\n 2.Crear proveedor \n 3.Crear Producto \n 4.Crear venta \n 5.Ver las ventas totales \n 6.Salir");
		int option = view.readInt("Ingrese una opcion");

		switch (option) {
		case 1:

			superMarket.createCustomer(view.readString("Ingrese el nombre"),
					view.readDouble("Ingrese el numero del RUT"), view.readInt("Ingrese el nÃºmero de telefono"),
					createAddresses());
			view.showMessage("Cliente creado exitosamente");
			showMenu();
			break;

		case 2:
			superMarket.createSupplier(view.readString("Ingrese el nombre"),
					view.readDouble("Ingrese el numero del RUT"), view.readInt("Ingrese el nÃºmero de telefono"),
					createAddresseses(), view.readString("Ingrese el sitio web"));
			view.showMessage("Proveedor creado exitosamente");
			showMenu();
			break;

		case 3:
			superMarket.createProduct(view.readString("Ingrese el nombre"), view.readInt("Ingrese el ID"),
					view.readInt("Ingrese el precio"), view.readInt("Ingrese el stock"), createSupplier(),
					view.readString("Ingrese categoria"));
			showMenu();
			break;

		
		case 4:
			addSell();
			showMenu();
			break;

		case 6:
			System.exit(0);
			break;

		}
	}

	public Address createAddresses() {

		Address address = new Address(view.readString("Ingrese la ciudad"), view.readString("Ingrese el barrio"),
				view.readString("Ingrese el tipo de calle"), view.readString("Ingrese numero de cuadrante"),
				view.readString("Ingrese cuadrante de la via generadora"), view.readString("Ingrese placa"));
		return address;
	}

	public List<Address> createAddresseses() {
		Address address = new Address(view.readString("Ingrese la ciudad"), view.readString("Ingrese el barrio"),
				view.readString("Ingrese el tipo de calle"), view.readString("Ingrese numero de cuadrante"),
				view.readString("Ingrese cuadrante de la via generadora"), view.readString("Ingrese placa"));
		List<Address> addresses = new ArrayList<>();
		addresses.add(address);
		return addresses;
	}

	public Supplier createSupplier() {
		Supplier supplier = new Supplier(view.readString("Ingrese el nombre"),
				view.readDouble("Ingrese el numero del RUT"), view.readInt("Ingrese el nÃºmero de telefono"),
				createAddresseses(), view.readString("Ingrese el sitio web"));
		return supplier;
	}

	private void addSell(){
        view.showMessage("\n *AÃ±adir venta de:* \n");
        if (SuperMarket.isEmptyInventory() != false) {
            view.showMessage("\n_______El Inventario Esta Vacio_______\n");
        } else {
            view.showListProducts(SuperMarket.toStringVa());
            int option;
            do {
                option = view.readInt("Por Favor Elija Producto a Vender");
                if (option >= 1 && option <= SuperMarket.countProducts()) {
                    view.showMessage("**La opcion no es valida**");
                }
            } while (option < 1 || option > SuperMarket.countProducts());
            //aÃ±adir venta
            int quantity;
            boolean isValidSell;
            do {
                quantity = view.readInt("Cantidad Vendida");
                isValidSell = !SuperMarket.addSell(option, quantity);
                if (!isValidSell) {
                    view.showMessage("**La Cantidad no es valida**");
                }
            } while (!isValidSell);
        }
    }

	public void run() throws IOException {
		showMenu();
	}


	public static void main(String[] args) throws IOException {
		new Presenter().run();
	}
}
