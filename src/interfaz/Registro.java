/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import bd.OperacionesBD;
import objetos.Cliente;

/**
 * @authorr Pablo
 * @author Adri
 */
public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();

    }

    public Cliente usuarioNuevo() {
        
        int userid = Integer.parseInt(jTDNI.getText());
        String username = jTCorreoELectronico.getText();
        String pass = jPassword.getText();
        String nombre = jTNombre.getText();
        
        return new Cliente(userid, username, pass, nombre);

    }

    public void letraDNI() {
        try {
            int dni = Integer.parseInt(jTDNI.getText());
            jlAlerta.setText("");
            if (String.valueOf(dni).length() == 8) {

                String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
                int modulo = dni % 23;
                char letra = juegoCaracteres.charAt(modulo);
                jTLetraDNI.setText(String.valueOf(letra));

            } else {
                jTLetraDNI.setText("   ");
                jlAlerta.setText("Introduce un DNI válido.");
            }
        } catch (NumberFormatException ex) {
            jlAlerta.setText("Introduce un DNI válido.");
        }
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
        jlGuion = new javax.swing.JLabel();
        jlblCorreo = new javax.swing.JLabel();
        jlblDNI = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTDNI = new javax.swing.JTextField();
        jTCorreoELectronico = new javax.swing.JTextField();
        jTLetraDNI = new javax.swing.JTextField();
        jlblNombre1 = new javax.swing.JLabel();
        jlContraseña = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jlblTitulo = new javax.swing.JLabel();
        jBConfirmar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jlAlerta = new javax.swing.JLabel();

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

        jlGuion.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlGuion.setText("-");

        jlblCorreo.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblCorreo.setText("Correo");

        jlblDNI.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblDNI.setText("DNI");

        jTDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTDNIKeyReleased(evt);
            }
        });

        jTLetraDNI.setEditable(false);
        jTLetraDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlblNombre1.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblNombre1.setText("Nombre");

        jlContraseña.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlContraseña.setText("Contraseña");

        javax.swing.GroupLayout jPanelBackground2Layout = new javax.swing.GroupLayout(jPanelBackground2);
        jPanelBackground2.setLayout(jPanelBackground2Layout);
        jPanelBackground2Layout.setHorizontalGroup(
            jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackground2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblNombre1)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBackground2Layout.createSequentialGroup()
                                .addComponent(jlblDNI)
                                .addGap(103, 103, 103))
                            .addGroup(jPanelBackground2Layout.createSequentialGroup()
                                .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jTLetraDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCorreoELectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblCorreo))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanelBackground2Layout.createSequentialGroup()
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jlContraseña)
                        .addGap(622, 622, 622))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackground2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(541, 541, 541)))
                .addComponent(jlGuion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBackground2Layout.setVerticalGroup(
            jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackground2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addComponent(jlblNombre1)
                        .addGap(1, 1, 1)
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addComponent(jlblDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTLetraDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jlblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTCorreoELectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlGuion))
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jlblTitulo.setFont(new java.awt.Font("Krungthep", 0, 36)); // NOI18N
        jlblTitulo.setText("NUEVO USUARIO");

        jBConfirmar.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bus.png"))); // NOI18N

        jlAlerta.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlAlerta.setForeground(new java.awt.Color(234, 14, 28));
        jlAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelBackground1Layout = new javax.swing.GroupLayout(jPanelBackground1);
        jPanelBackground1.setLayout(jPanelBackground1Layout);
        jPanelBackground1Layout.setHorizontalGroup(
            jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackground1Layout.createSequentialGroup()
                .addGroup(jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackground1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackground1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackground1Layout.createSequentialGroup()
                                .addComponent(jlAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBConfirmar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackground1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelBackground1Layout.setVerticalGroup(
            jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackground1Layout.createSequentialGroup()
                .addGroup(jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackground1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9))
                    .addGroup(jPanelBackground1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jlblTitulo)))
                .addGap(24, 24, 24)
                .addComponent(jPanelBackground2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBConfirmar)
                    .addComponent(jlAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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


    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        this.setVisible(false);
        OperacionesBD operaciones = new OperacionesBD();
        operaciones.insertUser(usuarioNuevo());
        new Login().setVisible(true);
    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void jTDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDNIKeyReleased
        letraDNI();
    }//GEN-LAST:event_jTDNIKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanelBackground1;
    private javax.swing.JPanel jPanelBackground2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTCorreoELectronico;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTLetraDNI;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JLabel jlAlerta;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlGuion;
    private javax.swing.JLabel jlblCorreo;
    private javax.swing.JLabel jlblDNI;
    private javax.swing.JLabel jlblNombre1;
    private javax.swing.JLabel jlblTitulo;
    // End of variables declaration//GEN-END:variables
}
