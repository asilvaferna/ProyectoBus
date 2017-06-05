/*
 * Objeto cliente
 */

package objetos;

/**
 * 
 * @author Pablo
 */
public class Cliente {
   
    private int userid;
    private String username;
    private String pass;
    private String nombre;

    public Cliente() {
    }
    
    public Cliente(int userid, String username, String pass, String nombre) {
        this.userid = userid;
        this.username = username;
        this.pass = pass;
        this.nombre = nombre;
    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
