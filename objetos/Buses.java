/*
 *Objeto bus
 */

package objetos;

/**
 * 
 * @author Pablo
 */
public class Buses {

    private int busid;
    private String trayecto;
    private final int plazas = 3;

    public Buses() {
    }

    public int getBusid() {
        return busid;
    }

    public void setBusid(int busid) {
        this.busid = busid;
    }

    public String getTrayecto() {
        return trayecto;
    }

    public void setTrayecto(String trayecto) {
        this.trayecto = trayecto;
    }
    
    public int getPlazas(){
        return plazas;
    }
    
    
    
    
}
