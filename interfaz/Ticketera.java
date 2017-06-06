/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import bd.OperacionesBD;
import operaciones.Viaje;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import operaciones.Importe;
import java.util.ArrayList;

/**
 * @authorr Pablo
 * @author Adri
 */
public class Ticketera extends javax.swing.JFrame {

    public ArrayList<Viaje> base = new ArrayList<>();

    /**
     * Creates new form Prueba
     */
    public Ticketera() {
        initComponents();

        //Componentes obsoletos
        jComboBoxNBilletes.setVisible(false);
        jlblNBilletes.setVisible(false);
    }

    public String getDestino() {
        return jComboBoxDestinos.getSelectedItem().toString();
    }

    public int getBilletes() {
//        return Integer.parseInt(jComboBoxNBilletes.getSelectedItem().toString());
        return 1;
    }

    public String getTipo() {
        if (jRBTipo1.isSelected()) {
            return jRBTipo1.getText();
        } else {
            return jRBTipo2.getText();
        }
    }

    public String getClase() {
        if (jRBClase1.isSelected()) {
            return jRBClase1.getText();

        } else {
            return jRBClase2.getText();
        }
    }

    public String getEdad() {
        if (jRBEdad1.isSelected()) {
            return jRBEdad1.getText();
        } else if (jRBEdad2.isSelected()) {
            return jRBEdad2.getText();
        } else {
            return jRBEdad3.getText();
        }
    }

    public String getTiempo() {
        Calendar timer = Calendar.getInstance();
        timer.getTime();

        SimpleDateFormat tTime = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        return tTime.format(timer.getTime());
    }

    public double setImporteTicket(double precio) {
        return precio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanelBackground1 = new javax.swing.JPanel();
        jPanelBackground2 = new javax.swing.JPanel();
        jRBClase1 = new javax.swing.JRadioButton();
        jlblClase = new javax.swing.JLabel();
        jRBClase2 = new javax.swing.JRadioButton();
        jlblTipo = new javax.swing.JLabel();
        jRBTipo1 = new javax.swing.JRadioButton();
        jRBTipo2 = new javax.swing.JRadioButton();
        jlblEdad = new javax.swing.JLabel();
        jRBEdad1 = new javax.swing.JRadioButton();
        jRBEdad2 = new javax.swing.JRadioButton();
        jRBEdad3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxDestinos = new javax.swing.JComboBox<>();
        jPanelOperations = new javax.swing.JPanel();
        jlblSubTotal = new javax.swing.JLabel();
        jlblImpuestos = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jlblSubTotalR = new javax.swing.JLabel();
        jlblImpuestosR = new javax.swing.JLabel();
        jlblTotalR = new javax.swing.JLabel();
        jlblTitulo = new javax.swing.JLabel();
        jButtonTotal = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBackground1.setBackground(new java.awt.Color(118, 205, 206));

        jPanelBackground2.setBackground(new java.awt.Color(150, 224, 222));

        buttonGroup1.add(jRBClase1);
        jRBClase1.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jRBClase1.setSelected(true);
        jRBClase1.setText("Ordinario");
        jRBClase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBClase1MouseClicked(evt);
            }
        });
        jRBClase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBClase1ActionPerformed(evt);
            }
        });

        jlblClase.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblClase.setText("Clase");

        buttonGroup1.add(jRBClase2);
        jRBClase2.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jRBClase2.setText("Premium");
        jRBClase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBClase2ActionPerformed(evt);
            }
        });

        jlblTipo.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblTipo.setText("Tipo");

        buttonGroup2.add(jRBTipo1);
        jRBTipo1.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jRBTipo1.setSelected(true);
        jRBTipo1.setText("Único");
        jRBTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTipo1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRBTipo2);
        jRBTipo2.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jRBTipo2.setText("Ida-Vuelta");
        jRBTipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTipo2ActionPerformed(evt);
            }
        });

        jlblEdad.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblEdad.setText("Edad");

        buttonGroup3.add(jRBEdad1);
        jRBEdad1.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jRBEdad1.setSelected(true);
        jRBEdad1.setText("Adulto");
        jRBEdad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEdad1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRBEdad2);
        jRBEdad2.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jRBEdad2.setText("Senior");
        jRBEdad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEdad2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRBEdad3);
        jRBEdad3.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jRBEdad3.setText("Junior");
        jRBEdad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEdad3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel5.setLabelFor(jComboBoxDestinos);
        jLabel5.setText("Destino");

        jComboBoxDestinos.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jComboBoxDestinos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pontevedra", "Ourense", "Lugo", "Santiago", "A Coruña", "Ferrol" }));
        jComboBoxDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxDestinosMouseClicked(evt);
            }
        });
        jComboBoxDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDestinosActionPerformed(evt);
            }
        });

        jPanelOperations.setBackground(new java.awt.Color(255, 255, 255));

        jlblSubTotal.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblSubTotal.setLabelFor(jlblSubTotalR);
        jlblSubTotal.setText("Sub Total");

        jlblImpuestos.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblImpuestos.setLabelFor(jlblImpuestosR);
        jlblImpuestos.setText("Impuestos");

        jlblTotal.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblTotal.setLabelFor(jlblTotalR);
        jlblTotal.setText("Total");

        jlblSubTotalR.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblSubTotalR.setText("0");

        jlblImpuestosR.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblImpuestosR.setText("0");

        jlblTotalR.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblTotalR.setText("0");

        javax.swing.GroupLayout jPanelOperationsLayout = new javax.swing.GroupLayout(jPanelOperations);
        jPanelOperations.setLayout(jPanelOperationsLayout);
        jPanelOperationsLayout.setHorizontalGroup(
            jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperationsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblSubTotal)
                    .addComponent(jlblImpuestos)
                    .addComponent(jlblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblSubTotalR)
                    .addComponent(jlblImpuestosR)
                    .addComponent(jlblTotalR))
                .addGap(80, 80, 80))
        );
        jPanelOperationsLayout.setVerticalGroup(
            jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperationsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSubTotal)
                    .addComponent(jlblSubTotalR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblImpuestos)
                    .addComponent(jlblImpuestosR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal)
                    .addComponent(jlblTotalR))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanelBackground2Layout = new javax.swing.GroupLayout(jPanelBackground2);
        jPanelBackground2.setLayout(jPanelBackground2Layout);
        jPanelBackground2Layout.setHorizontalGroup(
            jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackground2Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jPanelOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackground2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBClase2)
                    .addComponent(jRBClase1)
                    .addComponent(jlblClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBTipo1)
                            .addComponent(jlblTipo)
                            .addComponent(jRBTipo2)
                            .addComponent(jLabel5))
                        .addGap(57, 57, 57)
                        .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBEdad2)
                            .addComponent(jRBEdad1)
                            .addComponent(jRBEdad3)
                            .addComponent(jlblEdad))))
                .addGap(82, 82, 82))
        );
        jPanelBackground2Layout.setVerticalGroup(
            jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackground2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblClase)
                    .addComponent(jlblTipo)
                    .addComponent(jlblEdad))
                .addGap(18, 18, 18)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBClase1)
                    .addComponent(jRBTipo1)
                    .addComponent(jRBEdad1))
                .addGap(18, 18, 18)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBClase2)
                    .addComponent(jRBTipo2)
                    .addComponent(jRBEdad2))
                .addGap(18, 18, 18)
                .addComponent(jRBEdad3)
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanelOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jlblTitulo.setFont(new java.awt.Font("Krungthep", 0, 36)); // NOI18N
        jlblTitulo.setText("BUS");

        jButtonTotal.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jButtonTotal.setText("Siguiente");
        jButtonTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTotalMouseClicked(evt);
            }
        });
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bus.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBackground1Layout = new javax.swing.GroupLayout(jPanelBackground1);
        jPanelBackground1.setLayout(jPanelBackground1Layout);
        jPanelBackground1Layout.setHorizontalGroup(
            jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackground1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackground1Layout.createSequentialGroup()
                        .addComponent(jButtonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)
                        .addComponent(jlblTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackground1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPanelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelBackground1Layout.setVerticalGroup(
            jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackground1Layout.createSequentialGroup()
                .addGroup(jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackground1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9))
                    .addGroup(jPanelBackground1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jlblTitulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTotal)
                    .addComponent(jButtonReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBClase1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBClase1MouseClicked

    }//GEN-LAST:event_jRBClase1MouseClicked

    private void jRBTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTipo1ActionPerformed
        totalizador();
    }//GEN-LAST:event_jRBTipo1ActionPerformed

    private void jComboBoxDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDestinosActionPerformed
        totalizador();
    }//GEN-LAST:event_jComboBoxDestinosActionPerformed
    Importe importe = new Importe();

    //Definimos los decimales a mostrar
    DecimalFormat dosDecimales = new DecimalFormat("0.00");

    private void totalizador() {

        //SubTotal
        jlblSubTotalR.setText(dosDecimales.format(getBilletes() * importe.precioBilleteAII(getDestino(), getClase(), getEdad(), getTipo())) + " €");

        //Impuestos
        jlblImpuestosR.setText(importe.getImpuestos() + " €");

        //Total
        jlblTotalR.setText(dosDecimales.format(getBilletes() * importe.precioBilleteDII(getDestino(), getClase(), getEdad(), getTipo())) + " €");
    }
    private void jButtonTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTotalMouseClicked
       OperacionesBD consulta = new OperacionesBD();
        totalizador();

        String totalUnitario = String.valueOf(dosDecimales.format(importe.precioBilleteDII(getDestino(), getClase(), getEdad(), getTipo())) + " €");

        // Abrir ventana de Ticket
        for (int i = 0; i < getBilletes(); i++) {
            Ticket ticket = new Ticket(
                    consulta.getUserName(Login.userID),  
                    consulta.getUserUsername(Login.userID), getClase(), getTipo(), getEdad(), getDestino(), totalUnitario, getTiempo());
            Viaje viaje = new Viaje(ticket.referencia, getClase(), getTipo(), getEdad(), getDestino());
            ticket.setVisible(true);
            base.add(viaje);
        }


    }//GEN-LAST:event_jButtonTotalMouseClicked

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed

    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jComboBoxNBilletes.setSelectedItem("1");
        jComboBoxDestinos.setSelectedItem("Pontevedra");
        jlblSubTotalR.setText("0");
        jlblImpuestosR.setText("0");
        jlblTotalR.setText("0");
        jRBTipo1.setSelected(true);
        jRBClase1.setSelected(true);
        jRBEdad1.setSelected(true);

    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jRBEdad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEdad3ActionPerformed
        totalizador();
    }//GEN-LAST:event_jRBEdad3ActionPerformed

    private void jComboBoxDestinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDestinosMouseClicked

    }//GEN-LAST:event_jComboBoxDestinosMouseClicked

    private void jRBClase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBClase1ActionPerformed
        totalizador();
    }//GEN-LAST:event_jRBClase1ActionPerformed

    private void jRBClase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBClase2ActionPerformed
        totalizador();
    }//GEN-LAST:event_jRBClase2ActionPerformed

    private void jRBTipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTipo2ActionPerformed
        totalizador();
    }//GEN-LAST:event_jRBTipo2ActionPerformed

    private void jRBEdad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEdad1ActionPerformed
        totalizador();
    }//GEN-LAST:event_jRBEdad1ActionPerformed

    private void jRBEdad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEdad2ActionPerformed
        totalizador();
    }//GEN-LAST:event_jRBEdad2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JComboBox<String> jComboBoxDestinos;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanelBackground1;
    private javax.swing.JPanel jPanelBackground2;
    private javax.swing.JPanel jPanelOperations;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRBClase1;
    private javax.swing.JRadioButton jRBClase2;
    private javax.swing.JRadioButton jRBEdad1;
    private javax.swing.JRadioButton jRBEdad2;
    private javax.swing.JRadioButton jRBEdad3;
    private javax.swing.JRadioButton jRBTipo1;
    private javax.swing.JRadioButton jRBTipo2;
    private javax.swing.JLabel jlblClase;
    private javax.swing.JLabel jlblEdad;
    private javax.swing.JLabel jlblImpuestos;
    private javax.swing.JLabel jlblImpuestosR;
    private javax.swing.JLabel jlblSubTotal;
    private javax.swing.JLabel jlblSubTotalR;
    private javax.swing.JLabel jlblTipo;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JLabel jlblTotalR;
    // End of variables declaration//GEN-END:variables
}
