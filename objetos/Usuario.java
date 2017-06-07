/*
 * Objeto cliente
 */

package objetos;

/**
 * 
 * @author Pablo
 */
public class Usuario {
   
    private int userid;
    private String username;
    private String pass;
    private String nombre;
    private int telefono;

    public Usuario() {
    }
    
    public Usuario(int userid, String username, String pass, String nombre, int telefono) {
        this.userid = userid;
        this.username = username;
        this.pass = pass;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    
}
