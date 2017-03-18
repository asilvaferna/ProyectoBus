/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoBus;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Adri
 */
public class Viaje {
    
    public String clase;
    public String tipo;
    public String edad;
    public int nBilletes;
    public ArrayList<String> destinos = new ArrayList<String>(Arrays.asList("Pontevedra", "Lugo", "Ourense", "Santiago", "A Coruna", "Ferrol"));

    public Viaje(String clase, String tipo, String edad, int nBilletes) {
        this.clase = clase;
        this.tipo = tipo;
        this.edad = edad;
        this.nBilletes = nBilletes;
    }

    
    
    
    
}
