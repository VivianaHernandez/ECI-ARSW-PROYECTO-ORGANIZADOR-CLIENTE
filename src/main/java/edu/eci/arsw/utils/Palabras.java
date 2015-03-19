/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.arsw.utils;

import java.io.Serializable;

/**
 *
 * @author Viviana
 */
public class Palabras implements Serializable{
   private int posicion;
   private String texto;

  public Palabras(int posicion,String texto)
  {
  this.posicion=posicion;
  this.texto=texto;
  }
   
   public void setPalabras(int posicion) {
        this.posicion = posicion;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPalabras() {
        return posicion;
    }

    public String getTexto() {
        return texto;
    }
    
}
