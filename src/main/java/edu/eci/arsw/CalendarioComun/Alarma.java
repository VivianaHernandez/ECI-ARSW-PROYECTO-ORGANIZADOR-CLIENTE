/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.CalendarioComun;

import java.awt.Toolkit;
import java.io.Serializable;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Torres
 */
public class Alarma implements Serializable{

    private Date fechaTarea;
    private boolean activo;

    public Alarma(Date fechaTarea) {
        this.fechaTarea = fechaTarea;
        activo = false;
    }
    
    public void setFechaTarea(Date fechaTarea) {
        this.fechaTarea = fechaTarea;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    

    public void activar() {
        Date fechaSis = new Date();
        JFrame jf=new JFrame();
        System.out.println("que sale en fecha"+fechaSis.compareTo(fechaTarea) );
        if (fechaSis.compareTo(fechaTarea) >= 0 ) {
            if (!activo) {
                activo = true;
                String[] options = {"Posponer", "Desactivar"};
                int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                System.out.println("QUE SALE "+seleccion);
                Toolkit.getDefaultToolkit().beep();
                
                if(seleccion==1){
                    desactivar();
                }else{
                    Date nuevaF= new Date();
                    nuevaF.setMinutes(nuevaF.getMinutes()+10);
                    this.setFechaTarea(nuevaF);
                    System.out.println("LA FECHA DESPUES ES :"+nuevaF);
                }
            }
        }
    }

    /*public static void main(String[] args) {
        Alarma al = new Alarma(new Date());
        al.activar();
        

    }*/

    public void desactivar() {
        JOptionPane.showMessageDialog(null, "Alarma desactivada");
        if (activo) {
            activo = false;
        }
    }

    public void posponer(Date fechaTarea) {
        this.fechaTarea = fechaTarea;
        activo = false;
    }

}
