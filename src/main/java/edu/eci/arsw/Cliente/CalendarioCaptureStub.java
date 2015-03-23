/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Cliente;

import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;



public interface CalendarioCaptureStub 
{
  public String getTexto() throws CalendarioCaptureException;
  public void setTexto(int Posicion,String texto) throws CalendarioCaptureException;
  public TColaborativa getTareaColaborativa()throws CalendarioCaptureException;
  public TInformativa getTareaInformativa()throws CalendarioCaptureException;
}
