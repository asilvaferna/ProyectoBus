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

    public boolean insertUser(Cliente cliente) {
        try {
            String sql = "INSERT INTO Usuario VALUES(?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, cliente.getUserid());
            pstmt.setString(2, cliente.getUsername());
            pstmt.setString(3, cliente.getPass());
            pstmt.setString(4, cliente.getNombre());
            pstmt.executeUpdate();

            return true;
        } catch (SQLException ex) {
            // si salta el sqlexception significa que ya existe ese identificador
            System.out.println("Error al insertar");
            return false;
        }
    }

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

    public String getUserPassword(int userid) {
        String sql = "SELECT pass FROM Usuario where userid = ?;";
        String pass = null;
        try {
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, userid);
            pstmt.executeUpdate();
            return pass;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    public String getUserUsername(int userid) {
        String sql = "SELECT username FROM Usuario where userid = ?;";
        String username = null;
        try {
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, userid);
            pstmt.executeUpdate();
            return username;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    public String getUserName(int userid) {
        String sql = "SELECT nombre FROM Usuario where userid = ?;";
        String name = null;
        try {
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, userid);
            pstmt.executeUpdate();
            return name;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    public int getUserID(String username) {
        String sql = "SELECT userid FROM Usuario where username =?;";
        int userid = 0;
        try {
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.executeUpdate();
            return userid;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }

    }

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
    
        public String getCredentials(String username, String pass) {
        try {
            PreparedStatement s;
            s = c.prepareStatement("SELECT username, pass FROM Usuario where username=? AND pass=?;");
            s.setString(1, username);
            s.setString(2, pass);
            s.execute();
            return username + pass;
        } catch (SQLException ex) {
            System.out.println("Credenciales incorrectos");
            return null;
        }

    }

}
