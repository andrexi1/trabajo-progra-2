package view;

import java.util.Scanner;
/*
 * @author Andres barrera-Javier Lopez-Diego Patiño
 * 
 */

public class View {
	private Scanner console;

	public View() {
		console = new Scanner(System.in);
	}
	/**
	 *  
	 * @param message
	 * @return
	 */
	public int readInt(String message) {
		System.out.println(message);
		int number = Integer.parseInt(console.nextLine());
		return number;
	}

	public double readDouble(String message) {
		System.out.println(message);
		double number = Double.valueOf(console.nextLine());
		return number;
	}

	public String readString(String message) {
		System.out.println(message);
		String string = console.nextLine();
		return string;
	}

	public void showListProducts(String ListProducts){
        System.out.println(ListProducts);
    }

	public void showMessage(String message) {
		System.out.println(message);
	}


}