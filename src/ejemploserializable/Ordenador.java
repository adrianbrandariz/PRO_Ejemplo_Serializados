package ejemploserializable;

import java.io.Serializable;

/**
 *
 * @author ssahuquilloembade
 */
public class Ordenador implements Serializable {
    
    private Cpu procesador = new Cpu();
    private Pantalla pantalla = new Pantalla();
    private Rato rato = new Rato();
    
    public Ordenador(int memoria, int velocidade, String marca, float pulgadas, String tipo) {
        procesador.setMemoria(memoria);
        procesador.setVelocidade(velocidade);
        pantalla.setMarca(marca);
        pantalla.setPulgadas(pulgadas);
        rato.setTipo(tipo);
    }
    
    public Ordenador() {
        procesador = new Cpu();
        pantalla = new Pantalla();
        rato = new Rato();
        
    }
    
    public Cpu getProcesador() {
        return procesador;
    }
    
    public Pantalla getPantalla() {
        return pantalla;
    }
    
    public Rato getRato() {
        return rato;
    }
    
    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }
    
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }
    
    public void setRato(Rato rato) {
        this.rato = rato;
    }
    
    @Override
    public String toString() {
        return "Ordenador\n" + "procesador=" + procesador + "\npantalla=" + pantalla + "\nrato=" + rato;
    }
    
}
