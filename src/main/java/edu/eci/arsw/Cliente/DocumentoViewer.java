package edu.eci.arsw.Cliente;

import edu.eci.arsw.CalendarioComun.TColaborativa;
import java.awt.*;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.text.BadLocationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocumentoViewer {

    static CalendarioCaptureStub calendarioCaptureStub;
    static Documento d;
    static TColaborativa tc;
   
            
    public static void main(String[] args) throws java.io.IOException, AWTException, InterruptedException, CalendarioCaptureException, RemoteException, AccessException, NotBoundException, BadLocationException {
      
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        final CalendarioCaptureStub calendarioCaptureStub = (CalendarioCaptureStub)ac.getBean("calendarioCaptureStub");
        d=new Documento(calendarioCaptureStub);
        
        tc=calendarioCaptureStub.getTareaColaborativa();
        
        System.out.println("*******************************************");
        
        System.out.println("Nombre: "+tc.getNombre());
        System.out.println("Fecha: "+tc.getFecha().getDia());
        System.out.println("descripcion: "+tc.getDescripcion());
        
    }
    
    public static CalendarioCaptureStub getProxy(String ip, int puerto, String nombreObjeto) throws AccessException, RemoteException, NotBoundException {

        Registry reg = LocateRegistry.getRegistry(ip, puerto);
        CalendarioCaptureStub objeto = (CalendarioCaptureStub) reg.lookup(nombreObjeto);
        return objeto;
    }

    public void setDocumentoCaptureStub(CalendarioCaptureStub calendarioCaptureStub) {
        this.calendarioCaptureStub = calendarioCaptureStub;
    }
}