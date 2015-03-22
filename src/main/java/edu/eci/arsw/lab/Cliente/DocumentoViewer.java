package edu.eci.arsw.lab.Cliente;

import java.awt.*;
import javax.swing.*;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocumentoViewer {

    static DocumentoCaptureStub documentoCaptureStub;
    static String palabras;
    static boolean b=true;
    static String text;
    static String nuevo="";
    static int pos;
    
    public static void main(String[] args) throws java.io.IOException, AWTException, InterruptedException, DocumentoCaptureException, RemoteException, AccessException, NotBoundException, BadLocationException {
      
        initComponents();
        jf.setSize(600,400);
        jf.setTitle("Aplicacion del cliente");
        jf.setVisible(true);
      
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        final DocumentoCaptureStub documentoCaptureStub = (DocumentoCaptureStub)ac.getBean("documentoCaptureStub");
        
        textArea.addCaretListener(new CaretListener(){
        
                @Override
                public void caretUpdate(CaretEvent e){
               
               int pos=e.getDot(),longi=1;
               text=textArea.getText();
              
                    try {
                        nuevo = textArea.getText(pos-1,longi);
                    } catch (BadLocationException ex) {
                        Logger.getLogger(DocumentoViewer.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                    try {
                        documentoCaptureStub.setTexto(pos,nuevo);
                    } catch (DocumentoCaptureException ex) {
                        Logger.getLogger(DocumentoViewer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        });
        try {
                      
            while(b==true){
            palabras=documentoCaptureStub.getTexto();
                        setTexto(palabras);
                        jf.repaint();
            }
                    } catch (DocumentoCaptureException ex) {
                        Logger.getLogger(DocumentoViewer.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
    
    public static DocumentoCaptureStub getProxy(String ip, int puerto, String nombreObjeto) throws AccessException, RemoteException, NotBoundException {

        Registry reg = LocateRegistry.getRegistry(ip, puerto);
        DocumentoCaptureStub objeto = (DocumentoCaptureStub) reg.lookup(nombreObjeto);
        return objeto;
    }

    public void setDocumentoCaptureStub(DocumentoCaptureStub documentoCaptureStub) {
        this.documentoCaptureStub = documentoCaptureStub;
    }
    
    public static void setTexto(String texto) throws BadLocationException
    {
     String s=texto;
     int uu=1,i;
     char w;
  
        for (i = 0; i < s.length(); i++) {
            w = s.charAt(i);
            String ww = w + "";
            String a = textArea.getText(i, uu);

            if (!ww.equals(a)) {
                textArea.insert(ww, i);
            }
        }
    for(i=s.length();i<100;i++)
     {
     textArea.insert(" ", i);
     }
    }
 
    private static void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
          try {
            //mec.Guardar(evt, textArea, defaultPath);
        } catch (Exception ex) {
            Logger.getLogger(DocumentoViewer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                            

    private static void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                              
        try {
            //mec.cargar(textArea, defaultPath);
        } catch (Exception ex) {
            Logger.getLogger(DocumentoViewer.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        for(int i=0;i<100;i++){
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