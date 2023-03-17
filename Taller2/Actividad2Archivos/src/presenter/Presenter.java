package presenter;
import model.*;
import view.*;

import java.io.FileNotFoundException;

public class Presenter {

    private RemoveTextSpaces model;
    private View view;

    public Presenter() {
        model = new RemoveTextSpaces();
        view = new View();
    }

    private void run() throws FileNotFoundException {
        model.Remove("src/resources/archive.txt");
        view.showMessage("Se eliminaron los espacios del texto con exito");
    }
    public static void main(String[] args) throws FileNotFoundException {
        new Presenter().run();
    }

}
