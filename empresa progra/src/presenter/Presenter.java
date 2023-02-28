package presenter;

import model.SuperMarket;
import view.View;

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
                //Crea el cliente pidiendole al usuario los datos. Falta conectar la direccion
                superMarket.createCustomer(view.readString("Ingrese el nombre"), view.readDouble("Ingrese el numero del RUT"), view.readInt("Ingrese el número de telefono"), null);
                view.showMessage("Cliente creado exitosamente");
                showMenu();
                break;

            /*case 2:

                showMenu();
                break;

            case 3:
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

    public void run(){
        showMenu();
    }

    public static void main(String[] args) {
        new Presenter().run();
    }
}

