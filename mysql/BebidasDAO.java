package org.example.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BebidasDAO {
    public void  guardarBebidas( Bebidas bebida ) throws SQLException {
        String consulta = "insert into bebidas(marca,precio,cantidad)values(?,?,?)";

        try (Connection connection = Conexion.obtenerConcexion();
             PreparedStatement statement = connection.prepareStatement(consulta)
        ){
            statement.setString(1, bebida.getMarca());
            statement.setDouble(2, bebida.getPrecio());
            statement.setInt(3, bebida.getCantidad());


            int filas = statement.executeUpdate();
            if (filas >0){
                System.out.println("producto enviado  ala BASE DE DATOS :)");
            }
        }catch (SQLException e){
            System.out.println("error de conexion"+ e.getMessage());
        }



    }
}
