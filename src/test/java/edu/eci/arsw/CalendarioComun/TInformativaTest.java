/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.CalendarioComun;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2085941
 */
public class TInformativaTest {
    
    public TInformativaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class TInformativa.
     */
    @org.junit.Test
    public void testGetNombre() {
        System.out.println("getNombre");
        TInformativa instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class TInformativa.
     */
    @org.junit.Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        TInformativa instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class TInformativa.
     */
    @org.junit.Test
    public void testGetFecha() {
        System.out.println("getFecha");
        TInformativa instance = null;
        Fecha expResult = null;
        Fecha result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class TInformativa.
     */
    @org.junit.Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Fecha fecha = null;
        TInformativa instance = null;
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class TInformativa.
     */
    @org.junit.Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        TInformativa instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class TInformativa.
     */
    @org.junit.Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        TInformativa instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarma method, of class TInformativa.
     */
    @org.junit.Test
    public void testGetAlarma() {
        System.out.println("getAlarma");
        TInformativa instance = null;
        Alarma expResult = null;
        Alarma result = instance.getAlarma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarma method, of class TInformativa.
     */
    @org.junit.Test
    public void testSetAlarma() {
        System.out.println("setAlarma");
        Alarma alarma = null;
        TInformativa instance = null;
        instance.setAlarma(alarma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
