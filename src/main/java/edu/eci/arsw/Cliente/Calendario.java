
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Cliente;

import edu.eci.arsw.CalendarioComun.Alarma;
import edu.eci.arsw.CalendarioComun.CalendarioCaptureException;
import edu.eci.arsw.CalendarioComun.CalendarioCaptureStub;
import edu.eci.arsw.CalendarioComun.Documento;
import edu.eci.arsw.CalendarioComun.Fecha;
import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.BadLocationException;
import javazoom.jl.decoder.JavaLayerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calendario extends JFrame {

    static JLabel jLabel11;
    static Calendario calendario = null;
    static TColaborativa colab;
    static TInformativa infor;
    private Fecha fechac;
    static CalendarioCaptureStub calendarioCaptureStub;
    static Documento d;
    static Informacion vp;
    static CalendarioL calenda=new CalendarioL();
    static Alarma alarma;
    static Date date;
    static ArrayList<TInformativa> ti;
    static ArrayList<TColaborativa> tc;
    static int tam=0;
    
    public Calendario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jSpinField1 = new com.toedter.components.JSpinField();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fecha.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 102)));

        jLabel1.setFont(new java.awt.Font("Curlz MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 153));
        jLabel1.setText("Seleccione una fecha");

        jLabel2.setFont(new java.awt.Font("Curlz MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 153));
        jLabel2.setText("para comenzar");

        jLabel3.setFont(new java.awt.Font("Curlz MT", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("BIENVENID@");

        seleccionar.setBackground(new java.awt.Color(102, 0, 102));
        seleccionar.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        seleccionar.setForeground(new java.awt.Color(255, 51, 255));
        seleccionar.setText("Seleccionar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
    
        int mes = fecha.getCalendar().get(Calendar.MONTH) + 1;
        int año = fecha.getCalendar().get(Calendar.YEAR);
        int dia = fecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        date=new Date(año,mes,dia);
        fechac = new Fecha(dia, mes, año);
        calendario.setVisible(false);
        
        try {
            validarSiExisteTarea(fechac);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       

        System.out.println("VOLVIO A CALENDARIO");
    }//GEN-LAST:event_seleccionarActionPerformed
public static void main(String args[]) throws CalendarioCaptureException, RemoteException {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        calendarioCaptureStub = (CalendarioCaptureStub) ac.getBean("calendarioCaptureStub");
        
        verTareas();
        
        calendario = new Calendario();
        calendario.setVisible(true);
        calendario.setLocationRelativeTo(null);
        calendario.setSize(415, 415);
        calendario.setResizable(false);
    }
    
    public void validarSiExisteTarea(Fecha fechac) throws MalformedURLException, FileNotFoundException, JavaLayerException
    {
        int ban=0;
         tam=tam+ti.size()+tc.size();
        
        System.out.println("Tamaño "+tam);
        
        if (ti.size() > 0) {
            for (int i = 0; i < ti.size(); i++) {
                System.out.println("444444444422QUE TRAE FECHA EN INFORMATIVA"+calenda.getTareasInformativas().get(i).getFecha().getDia());
                if (ti.get(i).getFecha().getDia()==fechac.getDia()&& ti.get(i).getFecha().getAnio()==fechac.getAnio()&& ti.get(i).getFecha().getMes()==fechac.getMes()) {
                   
                        Calendar Cal= Calendar.getInstance();
                        String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR)+" "+Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+":"+Cal.get(Cal.SECOND); 
                        int mes=Cal.get(Cal.MONTH)+1;
                        System.out.println("fecha : "+fec);
                        System.out.println("dia 1 de calendario : "+Cal.get(Cal.DATE)+"  dia 2 de tarea : "+ti.get(i).getFecha().getDia());
                        System.out.println("mes 1 de calendario : "+mes+"  dia 2 de tarea : "+ti.get(i).getFecha().getMes());
                        System.out.println("año 1 de calendario : "+Cal.get(Cal.YEAR)+"  dia 2 de tarea : "+ti.get(i).getFecha().getAnio());
                        
                        Date fe=new Date(ti.get(i).getFecha().getAnio(), ti.get(i).getFecha().getMes(), ti.get(i).getFecha().getDia());
                        
                        if(ti.get(i).getFecha().getDia()==Cal.get(Cal.DATE)&&
                           ti.get(i).getFecha().getMes()==mes&&
                           ti.get(i).getFecha().getAnio()==Cal.get(Cal.YEAR)){
                            System.out.println("PASO ACA");
                            
                            Date fech=ti.get(i).getAlarma().getFechaTarea();
                            System.out.println("ACRIVA LA ALARMA ");
                            ti.get(i).getAlarma().activar();
                            System.out.println("DIA "+fech.getDate());
                            System.out.println("MES  "+fech.getMonth());
                            System.out.println("AÑO "+fech.getYear());
                        }
                        
                    DatosTareas dt=new DatosTareas(calenda.getTareasInformativas().get(i),this);
                    ban++;
                    System.out.println("ENTRO A ESTE IF 4444444444444 DEL FOR");
                } else {
                    if(ban<1){
                        ban++;
                        
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ CREO UNO NUEVO ACA ~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        Informacion in = new Informacion(fechac, this);
                    }
                }
            }
        }
        if (tc.size() > 0) {
            for (int i = 0; i < tc.size(); i++) {
                System.out.println("444444444422QUE TRAE FECHA EN INFORMATIVA"+calenda.getTareasColaborativas().get(i).getFecha().getDia());
                if (tc.get(i).getFecha().getDia()==fechac.getDia()&& tc.get(i).getFecha().getAnio()==fechac.getAnio()&& tc.get(i).getFecha().getMes()==fechac.getMes()) {
                    
                    DatosTareas dt=new DatosTareas(calenda.getTareasColaborativas().get(i),this);
                    System.out.println("ENTRO A ESTE IF 4444444444444 DEL FOR");
                } else {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ NUEVO UNO CREO ~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    Informacion in = new Informacion(fechac, this);
                }
            }
        }
        if(tam==0){
            Informacion in = new Informacion(fechac, this);
        }
    }
    
    public static void verTareas() throws CalendarioCaptureException, RemoteException
    {
        ti=calendarioCaptureStub.getTareaInformativa();
        for(int i=0;i<ti.size();i++)
        {  
                adicionarTareaICalendario(ti.get(i));
            
                System.out.println("*******************************Tarea "+ti.get(i).getNombre());
                
        }
        
        tc=calendarioCaptureStub.getTareaColaborativa();
        for(int j=0;j<tc.size();j++)
        {
            
        adicionarTareaCCalendario(tc.get(j));
        System.out.println("***************************************+Tarea "+tc.get(j).getNombre());
        }
    }
    public static void adicionarTareaICalendario(TInformativa ti)
    {
        calenda.agregarTareaInformativa(ti);
    
    }
    
    public static void adicionarTareaCCalendario(TColaborativa tc)
    {
        calenda.agregarTareaColaborativa(tc);
    }

    public CalendarioCaptureStub getStub()
    {
    return calendarioCaptureStub;
    }
    
    public void continuarTI(TInformativa inform) throws CalendarioCaptureException, RemoteException {
        infor = inform;
        System.out.println("Traer Nombre: " + inform.getNombre());
        System.out.println("Traer descripcion: " + inform.getDescripcion());
        System.out.println("Traer Fecha: " + inform.getFecha().getDia());
        
      
        alarma=new Alarma(date);
        inform.setAlarma(alarma);
        
        calendarioCaptureStub.enviarTareaInformativa(inform);
        calenda.agregarTareaInformativa(infor);
        System.out.println("Salio de informativa ");
    }

    public void continuarTC(TColaborativa colabo) throws CalendarioCaptureException, RemoteException, BadLocationException {
        colab = colabo;
        System.out.println("Traer Nombre: " + colabo.getNombre());
        System.out.println("Traer descripcion: " + colabo.getDescripcion());
        System.out.println("Traer Fecha: " + colabo.getFecha().getDia());
        System.out.println("tarea colaborativa viene en" + colabo.getClass().getName());
        d=new Documento(calendarioCaptureStub);
        //colab.setDoc(d);
        calenda.agregarTareaColaborativa(colab);
        calendarioCaptureStub.enviarTareaColaborativa(colab);
        
        System.out.println("Salio de colaborativa ");
    }

    public static CalendarioCaptureStub getProxy(String ip, int puerto, String nombreObjeto) throws AccessException, RemoteException, NotBoundException {

        Registry reg = LocateRegistry.getRegistry(ip, puerto);
        CalendarioCaptureStub objeto = (CalendarioCaptureStub) reg.lookup(nombreObjeto);
        return objeto;
    }

    public void setCalendarioCaptureStub(CalendarioCaptureStub calendarioCaptureStub) {
        this.calendarioCaptureStub = calendarioCaptureStub;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fecha;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JButton seleccionar;
    // End of variables declaration//GEN-END:variables
}
