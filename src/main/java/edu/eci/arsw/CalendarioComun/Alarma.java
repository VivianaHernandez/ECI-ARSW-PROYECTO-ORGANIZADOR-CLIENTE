
package edu.eci.arsw.CalendarioComun;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

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

    public Date getFechaTarea() {
        return fechaTarea;
    }

    public void activar() throws FileNotFoundException, JavaLayerException {
        
          if (!activo) {
            activo = true;
            AudioClip sonido;
            FileInputStream fis;
            Player player;
            fis = new FileInputStream("C:\\Users\\Viviana\\Documents\\miverdad.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
            String[] options = {"Desactivar"};

            int seleccion = JOptionPane.showOptionDialog(null, "La alarma está sonando ¿desea desactivarla?", "La alarma está sonando", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (seleccion == 0) {
                desactivar();}
        }
    }

    public void desactivar() {
        JOptionPane.showMessageDialog(null, "Alarma desactivada");
        if (activo) {
            activo = false;}
    }
    
    public void posponer(Date fechaTarea) {
        this.fechaTarea = fechaTarea;
        activo = false;
    }
}