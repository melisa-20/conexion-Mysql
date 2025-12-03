package org.example.mysql;

public class Bebidas {
    private int idBebidas;
    private  String marca;
    private double precio;
    private int cantidad;

    public Bebidas(String marca, double precio, int cantidad) {
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public  String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public  double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}


