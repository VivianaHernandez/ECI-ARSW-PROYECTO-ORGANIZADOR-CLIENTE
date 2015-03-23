/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  edu.eci.arsw.CalendarioComun;

import java.io.Serializable;
import java.util.Date;

public class TColaborativa implements Serializable{

    private Fecha fecha;
    private String nombre;
    private String descripcion;

    public TColaborativa(Fecha fechaTarea,String nombre,String descripcion) {
        
        this.fecha=fecha;
        this.nombre=nombre;
        this.descripcion=descripcion;
        
    }
    public TColaborativa() {
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
