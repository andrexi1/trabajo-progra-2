package presenter;

import model.*;
import view.*;

import java.util.ArrayList;
import java.util.List;

public class Presenter {
    private Calculator calculator;
    private View view;
    public Presenter(){
        calculator = new Calculator();
        view = new View();
    }

    public void showMenu(){
        view.showMessage("Menu \n 1.Suma\n 2.Restar \n 3.Division \n 4.Multiplicacion \n 5.Historial \n 6.Ordenar  historial ascendente\n 7.Ordenar  historial descendente \n 8.Buscar en el historial \n 9.Salir");
        int option = view.readInt("Ingrese una opcion");
        double number1;
        double number2;
        double result;

        switch (option){
            case 1:
                number1 = view.readInt("Ingrese el primer numero");
                number2 = view.readInt("Ingrese el segundo numero");
                result = calculator.sum(number1, number2);
                view.showMessage("El resultado es: " + result);
                calculator.history(number1,number2, "+", result);
                showMenu();
                break;

            case 2:
                number1 = view.readInt("Ingrese el primer numero");
                number2 = view.readInt("Ingrese el segundo numero");
                result = calculator.sustraction(number1, number2);
                view.showMessage("El resultado es: " + result);
                calculator.history(number1,number2, "-", result);
                showMenu();
                break;

            case 3:
                number1 = view.readInt("Ingrese el primer numero");
                number2 = view.readInt("Ingrese el segundo numero");
                result = calculator.division(number1, number2);
                view.showMessage("El resultado es: " + result);
                calculator.history(number1,number2, "/", result);
                showMenu();
                break;
            case 4:
                number1 = view.readInt("Ingrese el primer numero");
                number2 = view.readInt("Ingrese el segundo numero");
                result = calculator.multiplication(number1, number2);
                view.showMessage("El resultado es: " + result);
                calculator.history(number1,number2, "*", result);
                showMenu();
                break;
            case 5:
                view.showMessage("El historial es:");
                calculator.orderHistory();
                showMenu();
                break;

            case 6:
                view.showMessage("El historial es:");
                orderHistory(1);
                showMenu();
                break;
            case 7:
                view.showMessage("El historial es:");
                orderHistory(2);
                showMenu();
                break;
            case 8:
                searchInHistory(view.readInt("Ingrese el numero de la operacion que desea buscar"));
                showMenu();
            case 9:
                System.exit(0);
                break;

        }
    }

    public void showArray(){
        List<String> history = calculator.getHistory();
        for (int i = 0; i < history.size(); i++) {
            view.showMessage(history.get(i));
        }
    }

    public void orderHistory(int a){
        if(a == 1){
            for (int i = 0; i < calculator.orderHistory().size(); i++) {
                view.showMessage(calculator.orderHistory().get(i));
            }
        }else{
            for (int i = calculator.orderHistory().size(); i > 0 ; i--) {
                view.showMessage(calculator.orderHistory().get(i-1));
            }
        }
    }

    public void searchInHistory(int a){
        view.showMessage("La operacion " + a + " es: " + calculator.getHistory().get(a-1));
    }


    public void run(){
        showMenu();
    }

    public static void main(String[] args) {
        new Presenter().run();
    }
}
