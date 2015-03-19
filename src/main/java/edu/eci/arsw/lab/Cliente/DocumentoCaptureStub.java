/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.lab.Cliente;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author viviana
 */
public interface DocumentoCaptureStub 
{
  public String getTexto() throws DocumentoCaptureException;
  public void setTexto(int Posicion,String texto) throws DocumentoCaptureException;
  
    
  
    
}
