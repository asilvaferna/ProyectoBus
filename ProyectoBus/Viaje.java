/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoBus;

/**
 *
 * @author Adri
 */
public class Viaje {

    public String id;
    public String clase;
    public String tipo;
    public String edad;
    public String destino;

    public Viaje(String id, String clase, String tipo, String edad, String destino) {
        this.id = id;
        this.clase = clase;
        this.tipo = tipo;
        this.edad = edad;
        this.destino = destino;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

}
