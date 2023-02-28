package presenter;

import model.Address;
import model.SuperMarket;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class Presenter {
    private View view;
    private SuperMarket superMarket;

    public Presenter(){
        view = new View();
        superMarket = new SuperMarket();
    }

    public void showMenu(){
        view.showMessage("Menu \n 1.Crear cliente\n 2.Crear proveedor \n 3.Crear Producto \n 4.Crear venta \n 5.Ver las ventas totales \n 6.Salir");
        int option = view.readInt("Ingrese una opcion");

        switch (option){
            case 1:
                //Crea el cliente pidiendole al usuario los datos. Falta conectar la direccion view.readString("Ingrese la ciudad"), view.readString("Ingrese el barrio"), view.readString("Ingrese el tipo de via"), view.readString("Ingrese el cuadrante"), view.readString("Ingrese el numero de via generdora"), view.readString("Ingrese el numero de placa")
                superMarket.createCustomer(view.readString("Ingrese el nombre"), view.readDouble("Ingrese el numero del RUT"), view.readInt("Ingrese el número de telefono"), createAddresses());
                view.showMessage("Cliente creado exitosamente");
                showMenu();
                break;

            case 2:
                superMarket.createSuplier(view.readString("Ingrese el nombre"), view.readDouble("Ingrese el numero del RUT"), view.readInt("Ingrese el número de telefono"), createAddresseses(), view.readString("Ingrese el sitio web"));
                view.showMessage("Proveedor creado exitosamente");
                showMenu();
                break;

            /*case 3:
                showMenu();
                break;
            case 4:

                showMenu();
                break;
            case 5:

                showMenu();
                break;*/

            case 6:
                System.exit(0);
                break;

        }
    }

    public Address createAddresses(){

        Address address = new Address(view.readString("Ingrese la ciudad"), view.readString("Ingrese el barrio"), view.readString("Ingrese el tipo de calle"), view.readString("Ingrese numero de cuadrante"), view.readString("Ingrese cuadrante de la via generadora"), view.readString("Ingrese placa"));
        return address;
    }
    public List<Address> createAddresseses(){
        Address address = new Address(view.readString("Ingrese la ciudad"), view.readString("Ingrese el barrio"), view.readString("Ingrese el tipo de calle"), view.readString("Ingrese numero de cuadrante"), view.readString("Ingrese cuadrante de la via generadora"), view.readString("Ingrese placa"));
        List<Address> addresses = new ArrayList<>();
        addresses.add(address);
        return addresses;
    }

    public void run(){
        showMenu();
    }

    public static void main(String[] args) {
        new Presenter().run();
    }
}

