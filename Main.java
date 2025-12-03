package org.example;

import org.example.mysql.Bebidas;
import org.example.mysql.BebidasDAO;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws SQLException  {

        BebidasDAO dao =new BebidasDAO();
        Bebidas bebida= new Bebidas("YOGURT",8,17);
        dao.guardarBebidas(bebida);

    }
}