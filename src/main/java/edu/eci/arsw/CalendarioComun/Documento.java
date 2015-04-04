/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.CalendarioComun;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

public class Documento implements Serializable{

    static String palabras="";
    static boolean b=true;
    static String text;
    static String nuevo="";
    static int pos;
    public boolean estado=true;
    static CalendarioCaptureStub calendarioCaptureStub;
    public int band=0;
    
    public Documento(final CalendarioCaptureStub calendarioCaptureStub) throws BadLocationException, CalendarioCaptureException {
        this.calendarioCaptureStub = calendarioCaptureStub;
        initComponents();
        jf.setSize(600, 400);
        jf.setTitle("Aplicacion del cliente");
        jf.setVisible(true);

     
        textArea.addCaretListener(new CaretListener() {

            @Override
            public void caretUpdate(CaretEvent e) {
            band++;
            System.out.println("Banderz: "+band);
                int pos = e.getDot(), longi = 1;
                text = textArea.getText();
                        
                try {
                    nuevo = textArea.getText(pos-1, longi);
                    System.out.println("Nuevo: " +nuevo+".");
                    System.out.println("Pos: " +pos);
                } catch (BadLocationException ex) {
                    Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    calendarioCaptureStub.setTexto(pos, nuevo);
                } catch (CalendarioCaptureException ex) {
                    Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
                }

                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        
                        System.out.println("entro´++++++++++++++++");
                        try {
                            calendarioCaptureStub.notificarCambio(true);
                            palabras = calendarioCaptureStub.getTexto();
                            System.out.println("Tamaño: "+palabras.length());
                            setTexto(palabras);
                            
                            
                        
                        } catch (CalendarioCaptureException ex) {
                            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (BadLocationException ex) {
                            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                    }
                });

            }
        });
       
         System.out.println("Hello afuera "+estado);
    while(jf.isActive()){
      palabras = calendarioCaptureStub.getTexto();
    System.out.println("Hello "+estado);
      setTexto(palabras);  
      estado=calendarioCaptureStub.estadoCambio();
    }
      
    }

    
    public static void setTexto(String texto) throws BadLocationException, CalendarioCaptureException
    {
 System.out.println("Etro al metodo=)=)=)=)=)=)=)=)=)=)=)=)=)=)");
 int tams=texto.length();
 
 System.out.println("Tamaño s "+texto.length());
 
    String s=texto;
     int uu=1;
     char w;
     String ww;
  System.out.println("SSSSS: ."+s+".");
  if(s.length()>0){
   for (int i = 1; i < tams-1; i++) {
            
       System.out.println("Aquise traba....");
       w = s.charAt(i);
            ww = w + "";
            
             System.out.println("\nww:"+w+".. En"+i);
            
            String a = textArea.getText(i-1, uu);
            System.out.println("AA:"+a+".. En"+i);
            if ((!ww.equals(a))&&(!ww.contains(" "))) {
               
                System.out.println("va a insertar:"+ww+".. En"+i);
                textArea.insert(ww, i);
                 jf.repaint();   
            }
   }
    
   
 
   
  
  } 
     calendarioCaptureStub.notificarCambio(false); 
    }
    
 
    private static void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
          try {
            //mec.Guardar(evt, textArea, defaultPath);
        } catch (Exception ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                            

    private static void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                              
        try {
            //mec.cargar(textArea, defaultPath);
        } catch (Exception ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void setVisibles(boolean estado)
    {
    jf.setVisible(estado);
    }
    
    public static void initComponents() {

        jf=new JFrame();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        textjsp = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        loadMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jFormattedTextField1.setText("jFormattedTextField1");

        jf.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        textjsp.setViewportView(textArea);

        jf.getContentPane().add(textjsp, java.awt.BorderLayout.CENTER);

        for(int i=1;i<100;i++){
       textArea.insert(" ",i);}
                
        jMenu1.setText("File");

        saveMenuItem.setText("save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenuItem);

        loadMenuItem.setText("load");
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenuItem);

        exitMenuItem.setText("Quit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               // exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jf.setJMenuBar(jMenuBar1);

        jf.pack();
    }
    
    private static boolean stopandexit=false;
    private static javax.swing.JFrame jf;
    private static javax.swing.JButton activateButton;
    private static javax.swing.JMenuItem exitMenuItem;
    private static javax.swing.JFormattedTextField jFormattedTextField1;
    private static javax.swing.JMenu jMenu1;
    private static javax.swing.JMenu jMenu2;
    private static javax.swing.JMenuBar jMenuBar1;
    private static javax.swing.JMenuItem loadMenuItem;
    private static javax.swing.JMenuItem saveMenuItem;
    private static javax.swing.JTextArea textArea;
    private static javax.swing.JScrollPane textjsp;  
}
