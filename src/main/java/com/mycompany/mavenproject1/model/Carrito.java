
package com.mycompany.mavenproject1.model;

import java.util.ArrayList;


public class Carrito {
    private ArrayList<Producto> productos;
    private int cantidadProd;
    private double subtotal;
    private double descuento;
    private double precioFinal;

    //constructores
    public Carrito() {
    }

    public Carrito(ArrayList<Producto> productos, int cantidadProd, double subtotal, double descuento, double precioFinal) {
        this.productos = new ArrayList<>();
        this.cantidadProd = cantidadProd;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.precioFinal = precioFinal;
    }
    
    //Getters & Setters

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getCantidadProd() {
        return cantidadProd;
    }

    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    //toString

    @Override
    public String toString() {
        return "Carrito{" + "productos=" + productos + ", cantidadProd=" + cantidadProd + ", subtotal=" + subtotal + ", descuento=" + descuento + ", precioFinal=" + precioFinal + '}';
    }
    
    //metodos
}
