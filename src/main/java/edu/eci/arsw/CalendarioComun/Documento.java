package edu.eci.arsw.CalendarioComun;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

public final class Documento extends javax.swing.JFrame {

    public String palabras = "";
    public boolean b = true;
    public String text;
    public String nuevo = "";
    public int pos;
    public boolean estado = true;
    public CalendarioCaptureStub calendarioCaptureStub;
    public int band = 0;
    public boolean stopAndExit = false;
    public JButton activationButton;

    public Documento(final CalendarioCaptureStub calendarioCaptureStub) throws BadLocationException, CalendarioCaptureException {
        this.calendarioCaptureStub = calendarioCaptureStub;
        initComponents();
        this.setSize(600, 400);
        this.setTitle("Aplicacion del cliente");

        textArea.addCaretListener(new CaretListener() {

            @Override
            public void caretUpdate(CaretEvent e) {
                band++;
                System.out.println("Banderz: " + band);
                int pos = e.getDot(), longi = 1;
                text = textArea.getText();

                try {
                    nuevo = textArea.getText(pos - 1, longi);
                    System.out.println("Nuevo: " + nuevo + ".");
                    System.out.println("Pos: " + pos);
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

                        System.out.println("entro´++++++++++++++++");
                        try {
                            calendarioCaptureStub.notificarCambio(true);
                            palabras = calendarioCaptureStub.getTexto();
                            System.out.println("Tamaño: " + palabras.length());
                            setTexto(palabras);

                        } catch (CalendarioCaptureException | BadLocationException ex) {
                            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            }
        });

        activationButton = new JButton("Stop and exit");

        activationButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        stopAndExit = true;

                    }
                }
        );

        getContentPane().add(activationButton, BorderLayout.NORTH);

        this.setVisible(true);

        while (!stopAndExit) {
            palabras = calendarioCaptureStub.getTexto();
            setTexto(palabras);
        }

    }

    public void setTexto(String texto) throws BadLocationException, CalendarioCaptureException {
        System.out.println("Etro al metodo=)=)=)=)=)=)=)=)=)=)=)=)=)=)");
        int tams = texto.length();

        System.out.println("Tamaño s " + texto.length());

        String s = texto;
        int uu = 1;
        char w;
        String ww;
        System.out.println("SSSSS: ." + s + ".");
        if (s.length() > 0) {
            for (int i = 1; i < tams - 1; i++) {

                System.out.println("Aquise traba....");
                w = s.charAt(i);
                ww = w + "";

                System.out.println("\nww:" + w + ".. En" + i);

                String a = textArea.getText(i - 1, uu);
                System.out.println("AA:" + a + ".. En" + i);
                if ((!ww.equals(a)) && (!ww.contains(" "))) {

                    System.out.println("va a insertar:" + ww + ".. En" + i);
                    textArea.insert(ww, i);
                    this.repaint();
                }
            }

        }
        calendarioCaptureStub.notificarCambio(false);
    }

    public void setVisibles(boolean estado) {
        this.setVisible(estado);
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
            textArea.insert(" ", i);
        }
    }

    public javax.swing.JFormattedTextField jFormattedTextField1;
    public javax.swing.JTextArea textArea;
    public javax.swing.JScrollPane textjsp;
}
