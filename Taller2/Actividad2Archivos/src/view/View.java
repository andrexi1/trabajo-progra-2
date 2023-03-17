package view;
import java.util.Scanner;

public class View {
    private Scanner console;

    public View() {
        console = new Scanner(System.in);
    }

    public String readStringFile(String message) {
        System.out.println(message);
        String file = console.nextLine();
        return file;
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
}