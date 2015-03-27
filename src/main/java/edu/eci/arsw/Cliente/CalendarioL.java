/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Cliente;

import edu.eci.arsw.CalendarioComun.Fecha;
import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;
import static edu.eci.arsw.Cliente.Calendario.ti;
import java.util.ArrayList;

/**
 *
 * @author Torres
 */
public class CalendarioL {

    private ArrayList<TInformativa> tareasInformativas = new ArrayList<TInformativa>();
    private ArrayList<TColaborativa> tareasColaborativas = new ArrayList<TColaborativa>();

    CalendarioL() {

    }

    public void agregarTareaInformativa(TInformativa ti) {
        if (!tareasInformativas.contains(ti)) {
            tareasInformativas.add(ti);
        }
    }

    public void agregarTareaColaborativa(TColaborativa tc) {
        if (!tareasColaborativas.contains(tc)) {
            tareasColaborativas.add(tc);
        }
    }

    public ArrayList<TInformativa> getTareasInformativas() {
        return tareasInformativas;
    }

    public void setTareasInformativas(ArrayList<TInformativa> tareasInformativas) {
        this.tareasInformativas = tareasInformativas;
    }

    public ArrayList<TColaborativa> getTareasColaborativas() {
        return tareasColaborativas;
    }

    public void setTareasColaborativas(ArrayList<TColaborativa> tareasColaborativas) {
        this.tareasColaborativas = tareasColaborativas;
    }

}
