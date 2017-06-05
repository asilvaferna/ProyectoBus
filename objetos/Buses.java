/*
 *Objeto bus
 */

package objetos;

/**
 * 
 * @author Pablo
 */
public class Buses {

    String ruta;
    int identificador;

    public Buses(String ruta, int identificador) {
        this.ruta = ruta;
        this.identificador = identificador;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
}
