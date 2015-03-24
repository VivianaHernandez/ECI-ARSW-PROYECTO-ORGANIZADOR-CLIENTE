/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.CalendarioComun;

import java.io.Serializable;

/**
 *
 * @author Torres
 */
public class TColaborativa implements Serializable{
    private String nombre;
    private Fecha fecha;
    private String descripcion;
    private Documento doc;

    public TColaborativa(Fecha fecha, String nombre, String descripcion){
        this.fecha=fecha;
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getDesripcion() {
        return descripcion;
    }

    public void setDesripcion(String desripcion) {
        this.descripcion = desripcion;
    }
    
      public void setDoc(Documento doc) {
        this.doc = doc;
    }

    public Documento getDoc() {
        return doc;
    }
}
