package com.mycompany.mavenproject1.model;

import java.sql.Time;
import java.sql.Date;

public class Ticket {
    private int idTicket;
    private Date fecha; //posible uso de datetime para simplificar
    private Time hora;
    private Carrito carrito;
    private String medioPago;
    
    //constructores

    public Ticket() {
    }

    public Ticket(Date fecha, Time hora, Carrito carrito, String medioPago) { //constructor sin id
        this.fecha = fecha;
        this.hora = hora;
        this.carrito = carrito;
        this.medioPago = medioPago;
    }

    public Ticket(int idTicket, Date fecha, Time hora, Carrito carrito, String medioPago) { //constructor con id
        this.idTicket = idTicket;
        this.fecha = fecha;
        this.hora = hora;
        this.carrito = carrito;
        this.medioPago = medioPago;
    }
    
    //Getters & Setters

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
    //to String

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", fecha=" + fecha + ", hora=" + hora + ", carrito=" + carrito + ", medioPago=" + medioPago + '}';
    }
    
    
}
