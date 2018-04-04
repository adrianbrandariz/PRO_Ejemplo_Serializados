package ejemploserializable;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploSerializable {

    public static void main(String[] args) {
        Metodos obxfich = null;
        obxfich = new Metodos();
        obxfich.escribirFichero("ordenador.dat");
        obxfich.lerFichero("ordenador.dat");
        obxfich.engadir("ordenador.dat");
        obxfich.lerFichero("ordenador.dat");
    }
    
}
