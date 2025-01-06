package com.mycompany.mavenproject1.model;

public class Producto {
    //atributos
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private boolean activo;
    private String codBarra;

    //constructores
    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, double precio, int stock, boolean activo, String codBarra) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.activo = activo;
        this.codBarra = codBarra;
    }
    

    //getters y setters
    public int getId() {
        return id;
    }
    //chikes, capaz despues deberiamos sacarle el set id asi no andamos seteando ids, son unicas y no deberiamos andar seteandola
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
    
    //metodos

    
}
