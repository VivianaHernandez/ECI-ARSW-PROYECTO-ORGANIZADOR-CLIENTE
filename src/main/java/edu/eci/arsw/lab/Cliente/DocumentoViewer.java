package edu.eci.arsw.lab.Cliente;

import edu.eci.arsw.arsw.utils.Palabras;
import edu.eci.arsw.utils.NetUtils;
import javax.imageio.ImageIO;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.*;

import javax.swing.*;

import java.awt.Graphics;
import java.io.ObjectOutputStream;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocumentoViewer {

    static DocumentoCaptureStub documentoCaptureStub;
    static Documento d;
    static Palabras palabras;
    static String text;
    static String texto;
    static int cont=0;
    static int espacio=-1;
    
    public static void main(String[] args) throws java.io.IOException, AWTException, InterruptedException, DocumentoCaptureException, RemoteException, AccessException, NotBoundException {
        /*COMENTARIO*/
        
        initComponents();
        jf.setSize(800,600);
        jf.setTitle("Aplicacion del cliente");
       
        jf.setVisible(true);
      
        
        System.out.println("IP address Cliente:" + NetUtils.getIPAddress());
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        final DocumentoCaptureStub documentoCaptureStub = (DocumentoCaptureStub)ac.getBean("documentoCaptureStub");
        
        //texto = documentoCaptureStub.getTexto();
      
        
        actualizarDocumento(texto); 
        
      
        
        textArea.addCaretListener(new CaretListener(){
        
                @Override
                public void caretUpdate(CaretEvent e){
               
               int pos=e.getDot();
               
               text=textArea.getText();
               //int lastspace=text.lastIndexOf(" ", pos);
               int longi=1;
               
               String nuevo="";
                    try {
                        
                        nuevo = textArea.getText(pos-1,longi);
                        System.out.println("text "+nuevo);
                         System.out.println("posicion+ "+pos);
                        
                        
                    } catch (BadLocationException ex) {
                        Logger.getLogger(DocumentoViewer.class.getName()).log(Level.SEVERE, null, ex);
                    }
               
             
               /*if(lastspace!=espacio){
                   
                       band=true;
                       nuevo=text.substring(cont,pos);
                       cont=lastspace;
                       
                       Palabras palabra=new Palabras(cont,nuevo);
                       
                 */      
                       try {
                           
                        texto=documentoCaptureStub.getTexto();
                    } catch (DocumentoCaptureException ex) {
                        Logger.getLogger(DocumentoViewer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                       
                        documentoCaptureStub.setTexto(pos,nuevo);
                    } catch (DocumentoCaptureException ex) {
                        Logger.getLogger(DocumentoViewer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    setTexto(texto);
                    jf.repaint();
                       
                       
                   
               
               
             
           
                    
                
                }
                
                
                
                
        });
        /*
        System.out.println("Alli........");
         System.out.println("palabras "+palabras.size());
        Iterator it = palabras.keySet().iterator();
                    while (it.hasNext()) {
                        Integer key = (Integer) it.next();
                        System.out.println("Clave: " + key + " -> Valor: " + palabras.get(key));
                    }
                
                
                
        activateButton=new JButton("Stop and exit");
        activateButton.setPreferredSize(new Dimension(40,40)); 
        activateButton.addActionListener(
           new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
            stopandexit=true;
            }
        }
         );
        
        
        
        while(!stopandexit)
        {
        texto=documentoCaptureStub.getTexto();
        documentoCaptureStub.setTexto(textArea.getText());
        setTexto(texto);
        jf.repaint();
        }
        */
    }
    
   
    
    public static void actualizarDocumento(String texto)
    {
     setTexto(texto);
    }
    
    public static DocumentoCaptureStub getProxy(String ip, int puerto, String nombreObjeto) throws AccessException, RemoteException, NotBoundException {

        Registry reg = LocateRegistry.getRegistry(ip, puerto);
        DocumentoCaptureStub objeto = (DocumentoCaptureStub) reg.lookup(nombreObjeto);
        return objeto;
    }

    public void setDocumentoCaptureStub(DocumentoCaptureStub documentoCaptureStub) {
        this.documentoCaptureStub = documentoCaptureStub;
    }
    
    public static void setTexto(String texto)
    {
    String pal=textArea.getText();
    
   //System.out.println("palabras "+pal);
     
      
     
        //textArea.setText(texto);
    
    //textArea.append(textArea.getText()+texto);
    //textArea.insert(texto,1);
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
    }// </editor-fold>  
    
   
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
