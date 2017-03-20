/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.IOException;
import impresora.PrintPDF;
//import ticket.Number;

/**
 *
 * @author Adri
 */
public class Ticket extends javax.swing.JFrame {

    /**
     * Creates new form Ticket
     */
    public Ticket() {
        initComponents();
    }
    
    public Ticket(String clase, String tipo, String edad, String destino, String precio, String hora){
        initComponents();
        
        //Number n = new Number();
        
        jlblClaseR.setText(clase);
        jlblTipoR.setText(tipo);
        jlblEdadR.setText(edad);

        jlblOrigenR.setText("Vigo");
        jlblDestinoR.setText(destino);
        jlblPrecioR.setText(precio);
        jlblHoraFechaR.setText(hora);
        jlblAsientoR.setText(String.valueOf(n.GenerarAsiento()));
        jlblTicketR.setText(String.valueOf(n.GenerarTicket()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblTipo3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlblClase = new javax.swing.JLabel();
        jlblTipo = new javax.swing.JLabel();
        jlblEdad = new javax.swing.JLabel();
        jlblAsiento = new javax.swing.JLabel();
        jlblTicket = new javax.swing.JLabel();
        jlblOrigen = new javax.swing.JLabel();
        jlblDestino = new javax.swing.JLabel();
        jlblClaseR = new javax.swing.JLabel();
        jlblTipoR = new javax.swing.JLabel();
        jlblEdadR = new javax.swing.JLabel();
        jlblAsientoR = new javax.swing.JLabel();
        jlblOrigenR = new javax.swing.JLabel();
        jlblDestinoR = new javax.swing.JLabel();
        jlblTicketR = new javax.swing.JLabel();
        jlblPrecio = new javax.swing.JLabel();
        jlblPrecioR = new javax.swing.JLabel();
        jlblHoraFecha = new javax.swing.JLabel();
        jlblHoraFechaR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonImprimir = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();

        jlblTipo3.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblTipo3.setText("Nº Ticket:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 203, 196));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlblClase.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblClase.setText("Clase:");

        jlblTipo.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblTipo.setText("Tipo:");

        jlblEdad.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblEdad.setText("Edad:");

        jlblAsiento.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblAsiento.setText("Asiento:");

        jlblTicket.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblTicket.setText("Nº Ticket:");

        jlblOrigen.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblOrigen.setText("Origen:");

        jlblDestino.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblDestino.setText("Destino:");

        jlblClaseR.setText("jLabel1");

        jlblTipoR.setText("jLabel1");

        jlblEdadR.setText("jLabel1");

        jlblAsientoR.setText("jLabel1");

        jlblOrigenR.setText("jLabel1");

        jlblDestinoR.setText("jLabel1");

        jlblTicketR.setText("jLabel1");

        jlblPrecio.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblPrecio.setText("Precio: ");

        jlblPrecioR.setText("jLabel1");

        jlblHoraFecha.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblHoraFecha.setText("Hora y Fecha:");

        jlblHoraFechaR.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblClase)
                    .addComponent(jlblAsiento)
                    .addComponent(jlblTicket)
                    .addComponent(jlblClaseR)
                    .addComponent(jlblAsientoR)
                    .addComponent(jlblTicketR)
                    .addComponent(jlblPrecioR)
                    .addComponent(jlblPrecio))
                .addGap(153, 153, 153)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblHoraFecha)
                            .addComponent(jlblHoraFechaR))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblTipo)
                                    .addComponent(jlblDestino)
                                    .addComponent(jlblOrigen)
                                    .addComponent(jlblTipoR))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblEdad)
                                    .addComponent(jlblEdadR)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblDestinoR)
                                    .addComponent(jlblOrigenR))
                                .addGap(128, 128, 128)))
                        .addGap(56, 56, 56))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblClase)
                    .addComponent(jlblTipo)
                    .addComponent(jlblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblClaseR)
                    .addComponent(jlblTipoR)
                    .addComponent(jlblEdadR))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAsiento)
                    .addComponent(jlblOrigen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAsientoR)
                    .addComponent(jlblOrigenR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTicket)
                    .addComponent(jlblDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblDestinoR)
                    .addComponent(jlblTicketR))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblPrecioR))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblHoraFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblHoraFechaR)))
                .addGap(55, 55, 55))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ticket.png"))); // NOI18N

        jButtonImprimir.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jButtonImprimir.setText("Imprimir");
        jButtonImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonImprimirMouseClicked(evt);
            }
        });

        jButtonCerrar.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCerrarMouseClicked(evt);
            }
        });
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(195, 195, 195))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCerrar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonImprimir)
                    .addComponent(jButtonCerrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarMouseClicked
        setVisible(false);
    }//GEN-LAST:event_jButtonCerrarMouseClicked

    private void jButtonImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonImprimirMouseClicked
        String clase = jlblClase.getText();
        String claseR = jlblClaseR.getText();
        String tipo = jlblTipo.getText();
        String tipoR = jlblTipoR.getText();
        String edad = jlblEdad.getText();
        String edadR = jlblEdadR.getText();
        String asiento = jlblAsiento.getText();
        String asientoR = jlblAsientoR.getText();
        String origen = jlblOrigen.getText();
        String origenR = jlblOrigenR.getText();
        String ticket = jlblTicket.getText();
        String ticketR = jlblTicketR.getText();
        String destino = jlblDestino.getText();
        String destinoR = jlblDestinoR.getText();
        String precio = jlblPrecio.getText();
        String precioR = jlblPrecioR.getText();
        String hora = jlblHoraFecha.getText();
        String horaR = jlblHoraFechaR.getText();

        try {
            PrintPDF impresora = new PrintPDF();
            // Cabecera
            impresora.imprimeTexto("Vigo Bus Ticket", 300, 710, 32, "negrita");
            impresora.imprimeImagen(70, 650);
            // Cuerpo: titulos
            impresora.imprimeTexto(clase, 50, 600, 16, "normal");
            impresora.imprimeTexto(tipo, 250, 600, 16, "normal");
            impresora.imprimeTexto(edad, 450, 600, 16, "normal");
            impresora.imprimeTexto(asiento, 50, 450, 16, "normal");
            impresora.imprimeTexto(origen, 250, 450, 16, "normal");
            impresora.imprimeTexto(ticket, 50, 300, 16, "normal");
            impresora.imprimeTexto(destino, 250, 300, 16, "normal");
            impresora.imprimeTexto(precio, 50, 150, 16, "normal");
            impresora.imprimeTexto(hora, 250, 150, 16, "normal");
            // Cuerpo: resultados
            impresora.imprimeTexto(claseR, 50, 550, 13, "normal");
            impresora.imprimeTexto(tipoR, 250, 550, 13, "normal");
            impresora.imprimeTexto(edadR, 450, 550, 13, "normal");
            impresora.imprimeTexto(origenR, 250, 400, 13, "normal");
            impresora.imprimeTexto(asientoR, 50, 400, 13, "normal");
            impresora.imprimeTexto(destinoR, 250, 250, 13, "normal");
            impresora.imprimeTexto(ticketR, 50, 250, 13, "normal");
            impresora.imprimeTexto(precioR, 50, 100, 13, "normal");
            impresora.imprimeTexto(horaR, 250, 100, 13, "normal");
            // Cerramos el stream
            impresora.cerrarContenido();

            impresora.guardarPDF();
            impresora.cerrarPDF();

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
        System.out.println("Fichero creado en: " + System.getProperty("user.dir"));
    }//GEN-LAST:event_jButtonImprimirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlblAsiento;
    private javax.swing.JLabel jlblAsientoR;
    private javax.swing.JLabel jlblClase;
    private javax.swing.JLabel jlblClaseR;
    private javax.swing.JLabel jlblDestino;
    private javax.swing.JLabel jlblDestinoR;
    private javax.swing.JLabel jlblEdad;
    private javax.swing.JLabel jlblEdadR;
    private javax.swing.JLabel jlblHoraFecha;
    private javax.swing.JLabel jlblHoraFechaR;
    private javax.swing.JLabel jlblOrigen;
    private javax.swing.JLabel jlblOrigenR;
    private javax.swing.JLabel jlblPrecio;
    private javax.swing.JLabel jlblPrecioR;
    private javax.swing.JLabel jlblTicket;
    private javax.swing.JLabel jlblTicketR;
    private javax.swing.JLabel jlblTipo;
    private javax.swing.JLabel jlblTipo3;
    private javax.swing.JLabel jlblTipoR;
    // End of variables declaration//GEN-END:variables
}
