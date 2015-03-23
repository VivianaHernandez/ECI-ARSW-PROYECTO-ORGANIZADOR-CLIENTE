/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.CalendarioComun;

import java.io.Serializable;

public class Fecha implements Serializable {
    
    private int dia;
    private int mes;
    private int ano;

     public Fecha(int dia,int mes,int año)
    {
    this.dia=dia;
    this.mes=mes;
    this.ano=ano;
    }
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
   
}
