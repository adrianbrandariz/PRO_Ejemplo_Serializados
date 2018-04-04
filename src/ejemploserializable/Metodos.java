package ejemploserializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author serxa
 */
public class Metodos {

    public void escribirFichero(String fichero) {
        ObjectOutputStream fich = null;
        try {
            fich = new ObjectOutputStream(new FileOutputStream(fichero));
            for (int i = 0; i < 3; i++) {
                Ordenador o = new Ordenador(enteiro("velocidade: "), enteiro("memoria: "), cadea("marca: "), decimal("pulgadas: "), cadea("Tipo: "));
                fich.writeObject(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fich != null) {
                try {
                    fich.close();
                } catch (IOException ex) {
                    Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void engadir(String fichero) {
        MeuObjectOutputStream esc = null;
        ObjectOutputStream fich = null;
        try {
            esc = new MeuObjectOutputStream(new FileOutputStream(fichero, true));
            for (int i = 0; i < 2; i++) {
                Ordenador o = new Ordenador(enteiro("velocidade: "), enteiro("memoria: "), cadea("marca: "), decimal("pulgadas: "), cadea("Tipo: "));
                esc.writeObject(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (esc != null) {
                try {
                    esc.close();
                } catch (IOException ex) {
                    Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public String cadea(String s) {
        return JOptionPane.showInputDialog(s);
    }

    public int enteiro(String s) {
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }

    public float decimal(String s) {
        return Float.parseFloat(JOptionPane.showInputDialog(s));
    }

    public void lerFichero(String fichero) {
        ObjectInputStream ler = null;
        Ordenador aux = null;
        try {
            ler = new ObjectInputStream(new FileInputStream(fichero));

            aux = (Ordenador) ler.readObject();
            while (aux != null) {
                System.out.println(aux.toString());
                aux = (Ordenador) ler.readObject();
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("erro 1: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("erro 2: " + ex.getMessage());
        } finally {
            if (ler != null) {
                try {
                    ler.close();
                } catch (IOException ex) {
                    System.out.println("erro de peche :" + ex.getMessage());
                }
            }
        }
    }
}
