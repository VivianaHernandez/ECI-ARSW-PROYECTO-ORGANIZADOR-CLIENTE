/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.CalendarioComun;

import java.rmi.RemoteException;
import java.util.ArrayList;

public interface CalendarioCaptureStub 
{
  public String getTexto() throws CalendarioCaptureException;
  public void setTexto(int Posicion,String texto) throws CalendarioCaptureException;
  
  public void enviarTareaInformativa(TInformativa ti) throws CalendarioCaptureException,RemoteException;
  public void enviarTareaColaborativa(TColaborativa tc) throws CalendarioCaptureException,RemoteException;
  
  public ArrayList<TColaborativa> getTareaColaborativa()throws CalendarioCaptureException,RemoteException;
  public ArrayList<TInformativa> getTareaInformativa()throws CalendarioCaptureException,RemoteException;
}
