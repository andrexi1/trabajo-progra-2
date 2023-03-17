package view;
import java.util.Scanner;

public class View {
    private Scanner console;

    public View() {
        console = new Scanner(System.in);
    }

    public int readInt(String message) {
        System.out.println(message);
        int number = Integer.parseInt(console.nextLine());
        return number;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}