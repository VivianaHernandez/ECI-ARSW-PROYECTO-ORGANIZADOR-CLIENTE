/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  edu.eci.arsw.CalendarioComun;

import java.io.Serializable;
import java.util.Date;

public class TInformativa implements Serializable{

    private Fecha fecha;
    private String nombre;
    private String descripcion;
    
    public TInformativa(String nombre, Date fechaTarea, String descripcion) {
        this.fecha=fecha;
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    public TInformativa() {
    }
    
     public Fecha getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
     public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
