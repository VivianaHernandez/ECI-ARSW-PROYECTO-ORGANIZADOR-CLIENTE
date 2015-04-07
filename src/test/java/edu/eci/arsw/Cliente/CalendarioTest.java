/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Cliente;

import edu.eci.arsw.CalendarioComun.CalendarioCaptureException;
import edu.eci.arsw.CalendarioComun.CalendarioCaptureStub;
import edu.eci.arsw.CalendarioComun.Fecha;
import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;
import static edu.eci.arsw.Cliente.Informacion.c;
import java.rmi.RemoteException;
import javax.swing.text.BadLocationException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Torres
 */
public class CalendarioTest {

    Fecha fechaC = new Fecha(9, 4, 2015);
    Fecha fechaI = new Fecha(7, 4, 2015);
    TColaborativa tc = new TColaborativa(fechaC, "colaborativa 1", "esta es una prueba de tarea colaborativa 1");
    TInformativa ti = new TInformativa(fechaI, "informativa 1", "esta es una prueba de tarea informativa 1");

    Calendario c = new Calendario();
    String[] args = null;
        
        

    public CalendarioTest() {
    }

    @Test
    public void crearTareaInformativaTest() throws CalendarioCaptureException, RemoteException {
        c.main(args);
        c.continuarTI(ti);
        assertEquals("informativa 1", ti.getNombre());

    }
    
     @Test
     public void crearTareaColaborativaTest() throws CalendarioCaptureException, RemoteException, BadLocationException {
        c.main(args);
        c.continuarTC(tc);
        assertEquals("colaborativa 1", tc.getNombre());
     }
}
