package edu.eci.arsw.CalendarioComun;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

public final class Documento extends javax.swing.JFrame implements Serializable{

    public String palabras = "";
    public String text;
    public String nuevo = "";
    public int pos;
    public boolean estado = true;
    public CalendarioCaptureStub calendarioCaptureStub;

    public Documento(final CalendarioCaptureStub calendarioCaptureStub) throws BadLocationException, CalendarioCaptureException {
        this.calendarioCaptureStub = calendarioCaptureStub;
        initComponents();
        this.setSize(600, 400);
        this.setTitle("Aplicacion del cliente");

        textArea.addCaretListener(new CaretListener() {

            @Override
            public void caretUpdate(CaretEvent e) {
                int pos = e.getDot(), longi = 1;
                text = textArea.getText();
                try {
                    nuevo = textArea.getText(pos - 1, longi);
                } catch (BadLocationException ex) {
                    Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    calendarioCaptureStub.setTexto(pos, nuevo);
                } catch (CalendarioCaptureException ex) {
                    Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
                }

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        /*try {
                            calendarioCaptureStub.notificarCambio(true);
                            palabras = calendarioCaptureStub.getTexto();
                            setTexto(palabras);
                        } catch (CalendarioCaptureException | BadLocationException ex) {
                            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
                    }
                });
            }
        });

        this.setVisible(true);
        }
    
    public void setVisibles(boolean est)
    {
    this.setVisible(est);
    }

    public void setTexto(String texto) throws BadLocationException, CalendarioCaptureException {
        int tams = texto.length();
        String s = texto,ww;
        int uu = 1;
        char w;
     
        if (s.length() > 0) {
            for (int i = 1; i < tams - 1; i++) {
                w = s.charAt(i);
                ww = w + "";
                String a = textArea.getText(i - 1, uu);
                if ((!ww.equals(a)) && (!ww.contains(" "))) {
                    textArea.insert(ww, i);
                    this.repaint();
                }
            }
        }
        calendarioCaptureStub.notificarCambio(false);
    }

    public void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        textjsp = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jFormattedTextField1.setText("jFormattedTextField1");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        textArea.setColumns(20);
        textArea.setRows(5);
        textjsp.setViewportView(textArea);
        getContentPane().add(textjsp, java.awt.BorderLayout.CENTER);

        for (int i = 1; i < 100; i++) {
            textArea.insert(" ", i);}
    }

    public javax.swing.JFormattedTextField jFormattedTextField1;
    public javax.swing.JTextArea textArea;
    public javax.swing.JScrollPane textjsp;
}