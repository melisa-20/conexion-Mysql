package org.example.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    private static final String URL="jdbc:mysql://localhost:3306/BODEGA";
    private static final String USERNAME="root";
    private static final String PASSAWORD="";

    public Conexion() throws SQLException {
    }

    public void conectarBD(){

    }
    public static Connection obtenerConcexion() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSAWORD);
    }

}
