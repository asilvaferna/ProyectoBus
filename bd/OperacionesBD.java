/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Cliente;

/**
 *
 * @author adri
 */
public class OperacionesBD {

    private String url = "jdbc:postgresql://localhost:5432/VigoBus";
    private String user = "postgres";
    private String pwd = "postgres";
    private Connection c;
    private Statement stmt;

    public OperacionesBD() {
        c = connect();
    }

    // Conexion a la base de datos
    public Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, user, pwd);

        } catch (ClassNotFoundException ex) {
            System.out.println("Error en la clase");
            return null;
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
            return null;
        }

    }

    // Insertar un usuario dado un objeto cliente por parametro
    public boolean insertUser(Cliente cliente) {
        try {
            String sql = "INSERT INTO Usuario VALUES(?,?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, cliente.getUserid());
            pstmt.setString(2, cliente.getUsername());
            pstmt.setString(3, cliente.getPass());
            pstmt.setString(4, cliente.getNombre());
            pstmt.setInt(5, cliente.getTelefono());
            pstmt.executeUpdate();

            return true;
        } catch (SQLException ex) {
            // si salta el sqlexception significa que ya existe ese identificador
            System.out.println("Error al insertar");
            return false;
        }
    }

    // Insertar un bus dado un objeto bus por parametro
    public void insertBus(objetos.Buses bus) {
        try {
            String sql = "INSERT INTO Bus VALUES(?,?,?)";
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, bus.getBusid());
            pstmt.setString(2, bus.getTrayecto());
            pstmt.setInt(3, bus.getPlazas());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            // si salta sqlException significa que ya existe ese Bus
            System.out.println("Error al insertar");
        }
    }

    //Obtener la contraseña dado un id de usuario
    public String getUserPassword(int userid) {
        String sql = "SELECT pass FROM Usuario where userid =" + userid + ";";
        String pass = null;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                pass = rs.getString("pass");
            }
            return pass;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    // Obtener el username dado un id de usuario
    public String getUserUsername(int userid) {
        String sql = "SELECT username FROM Usuario where userid = " + userid + ";";
        String username = null;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                username = rs.getString("username");
            }
            return username;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    // Obtener el nombre del usuario dado su id 
    public String getUserName(int userid) {
        String sql = "SELECT nombre FROM Usuario where userid =" + userid + " ;";
        String nombre = null;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                nombre = rs.getString("nombre");
            }
            return nombre;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    // Obtener el id del usuario dado su username
    public int getUserID(String username) {
        String sql = "SELECT userid FROM Usuario where username ='" + username + "';";
        int userid = 0;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                userid = rs.getInt("userid");
            }
            return userid;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }

    }

    // Insertar una fila en la tabla viaje dado un cliente y un bus
    public void insertViaje(Cliente cliente, objetos.Buses bus) {
        try {
            String sql = "INSERT INTO Viajes VALUES(?,?)";
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, cliente.getUserid());
            pstmt.setInt(2, bus.getBusid());
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            // si salta el sqlexception significa que ya existe ese identificador
            System.out.println("Error al insertar");
        }
    }


    // Obtener el id del bus dada una ruta
    public int getBusID(String ruta) {
        String sql = "SELECT busid FROM Bus where trayecto ='" + ruta + "';";
        int busid = 0;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                busid = rs.getInt("busid");
            }
            return busid;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }

    }

    public int getTelefono(int userid) {
        String sql = "SELECT telefono FROM Usuario where userid='" + userid + "';";
        int telefono = 0;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                telefono = rs.getInt("telefono");
            }
            return telefono;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }
    }

}
