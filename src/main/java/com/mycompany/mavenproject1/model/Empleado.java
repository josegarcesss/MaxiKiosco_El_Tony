package com.mycompany.mavenproject1.model;

public class Empleado {
    private int idEmpleado;
    private String contrasenia;
    private boolean esAdmin;
    private String nombre;
    private String apellido;
    private long telefono;
    private String direccion;
    private String email;
    
    //Constructores

    public Empleado() {
    }

    public Empleado(String contrasenia, boolean esAdmin, String nombre, String apellido, long telefono, String direccion, String email) { //constructor sin id
        this.contrasenia = contrasenia;
        this.esAdmin = esAdmin;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public Empleado(int idEmpleado, String contrasenia, boolean esAdmin, String nombre, String apellido, long telefono, String direccion, String email) { //constructor con id
        this.idEmpleado = idEmpleado;
        this.contrasenia = contrasenia;
        this.esAdmin = esAdmin;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }
    
    //Getters & Setters

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //to String

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", contrasenia=" + contrasenia + ", esAdmin=" + esAdmin + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + '}';
    }
    
}
