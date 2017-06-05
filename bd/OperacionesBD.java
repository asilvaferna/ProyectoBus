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

    public void insertUser(Cliente cliente) {
        try {
            String sql = "INSERT INTO Usuario VALUES(?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, cliente.getUserid());
            pstmt.setString(2, cliente.getUsername());
            pstmt.setString(3, cliente.getPass());
            pstmt.setString(4, cliente.getNombre());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            // si salta el sqlexception significa que ya existe ese identificador
            System.out.println("Error al insertar");
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
        String sql = "SELECT pass FROM Usuario where userid = " + userid + ";";
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
    
        public String getUserName(int userid) {
        String sql = "SELECT nombre FROM Usuario where userid = " + userid + ";";
        String name = null;
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                name = rs.getString("name");
            }
            return name;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }
    
        public int getUserID(String username) {
        String sql = "SELECT userid FROM Usuario where userid = " +"'"+ username +"'"+ ";";
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
    
    

}
