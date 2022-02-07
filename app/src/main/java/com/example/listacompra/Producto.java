package com.example.listacompra;

public class Producto {
    private String nombreProducto;
    private String marca;
    private String descripcion;
    private Double peso;
    private Double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(String nombreProducto, String marca, String descripcion, Double peso, Double precio, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.descripcion = descripcion;
        this.peso = peso;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
