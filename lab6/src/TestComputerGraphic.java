import pl.edu.uwm.a2.Bitmap;
import pl.edu.uwm.a2.ComputerGraphic;
import pl.edu.uwm.a2.Vector;

import java.util.ArrayList;

public class TestComputerGraphic {

    public static void main(String[] args) {
        ArrayList<ComputerGraphic> lista = new ArrayList<>();
        lista.add(new Bitmap());
        lista.add(new Bitmap());
        lista.add(new Bitmap());
        lista.add(new Vector());
        lista.add(new Vector());
        for( ComputerGraphic elem: lista){
            elem.loadFile();
        }
    }
}
