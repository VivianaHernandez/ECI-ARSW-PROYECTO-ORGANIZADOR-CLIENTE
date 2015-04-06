package edu.eci.arsw.CalendarioComun;

import java.io.Serializable;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDesripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
      public void setDoc(Documento doc) {
        this.doc = doc;
        System.out.println("llego doc");
    }

    public Documento getDoc() {
        return doc;
    }
}
