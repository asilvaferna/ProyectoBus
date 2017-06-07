/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author adri
 */
public class SuperUsuario extends Usuario{
    private boolean privilegios;

    public SuperUsuario(boolean privilegios) {
        this.privilegios = privilegios;
    }

    public SuperUsuario(boolean privilegios, int userid, String username, String pass, String nombre, int telefono) {
        super(userid, username, pass, nombre, telefono);
        this.privilegios = privilegios;
    }

    public boolean isPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(boolean privilegios) {
        this.privilegios = privilegios;
    }
    
    
}
