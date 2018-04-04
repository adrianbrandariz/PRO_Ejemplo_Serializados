package ejemploserializable;

import java.io.Serializable;

/**
 *
 * @author ssahuquilloembade
 */
public class Cpu implements Serializable {

    private int velocidade;
    private int memoria;

//Constructor por defecto
    public Cpu() {
    }
//Constructor por parámetros

    public Cpu(int velocidade, int memoria) {
        this.velocidade = velocidade;
        this.memoria = memoria;
    }
//Getters

    public int getVelocidade() {
        return velocidade;
    }

    public int getMemoria() {
        return memoria;
    }
//Setters

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
//ToString

    @Override
    public String toString() {
        return "CPU\n" + "velocidade=" + velocidade + "\nmemoria=" + memoria;
    }

}
