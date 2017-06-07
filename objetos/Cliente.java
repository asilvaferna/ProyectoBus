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
public class Cliente extends Usuario {

    public Cliente() {
    }

    public Cliente(int userid, String username, String pass, String nombre, int telefono) {
        super(userid, username, pass, nombre, telefono);
    }
    
}
