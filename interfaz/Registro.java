/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

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
        
        String nombre = jTNombre.getText();
        String apellidos = jTApellidos.getText();
        int edad = Integer.parseInt(jTEdad.getText());
        String dni = jTDNI.getText() + jTLetraDNI.getText();
        String correo = jTCorreoELectronico.getText();
        String password = jPassword.getSelectedText();

        return new Cliente(nombre, apellidos, correo, edad, dni, password);
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
        jlblApellidos = new javax.swing.JLabel();
        jlblEdad = new javax.swing.JLabel();
        jlblTelefono = new javax.swing.JLabel();
        jlblCorreo = new javax.swing.JLabel();
        jlblDNI = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTApellidos = new javax.swing.JTextField();
        jTEdad = new javax.swing.JTextField();
        jTDNI = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jTCorreoELectronico = new javax.swing.JTextField();
        jTLetraDNI = new javax.swing.JTextField();
        jlblNombre1 = new javax.swing.JLabel();
        jlAlerta = new javax.swing.JLabel();
        jlContraseña = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jlblTitulo = new javax.swing.JLabel();
        jBConfirmar = new javax.swing.JButton();
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

        jlGuion.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlGuion.setText("-");

        jlblApellidos.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblApellidos.setText("Apellidos");

        jlblEdad.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblEdad.setText("Edad");

        jlblTelefono.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlblTelefono.setText("Teléfono");

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

        jlAlerta.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jlAlerta.setForeground(new java.awt.Color(234, 14, 28));
        jlAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
                        .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTLetraDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlGuion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(167, Short.MAX_VALUE))
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblEdad)
                            .addComponent(jTEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblDNI)
                            .addComponent(jlblNombre1)
                            .addGroup(jPanelBackground2Layout.createSequentialGroup()
                                .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(107, Short.MAX_VALUE))))
            .addGroup(jPanelBackground2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackground2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jlblApellidos))
                    .addComponent(jlblTelefono)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCorreo)
                    .addComponent(jTCorreoELectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContraseña)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanelBackground2Layout.setVerticalGroup(
            jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackground2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblApellidos)
                    .addComponent(jlblNombre1))
                .addGap(1, 1, 1)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblEdad)
                .addGap(5, 5, 5)
                .addComponent(jTEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblDNI)
                .addGap(3, 3, 3)
                .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTLetraDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlGuion))
                    .addComponent(jlAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblTelefono)
                .addGap(4, 4, 4)
                .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTCorreoELectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jlblTitulo.setFont(new java.awt.Font("Krungthep", 0, 36)); // NOI18N
        jlblTitulo.setText("USUARIO NUEVO");

        jBConfirmar.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bus.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBackground1Layout = new javax.swing.GroupLayout(jPanelBackground1);
        jPanelBackground1.setLayout(jPanelBackground1Layout);
        jPanelBackground1Layout.setHorizontalGroup(
            jPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackground1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackground1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addComponent(jPanelBackground2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBConfirmar)
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
    private javax.swing.JTextField jTApellidos;
    private javax.swing.JTextField jTCorreoELectronico;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTEdad;
    private javax.swing.JTextField jTLetraDNI;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JLabel jlAlerta;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlGuion;
    private javax.swing.JLabel jlblApellidos;
    private javax.swing.JLabel jlblCorreo;
    private javax.swing.JLabel jlblDNI;
    private javax.swing.JLabel jlblEdad;
    private javax.swing.JLabel jlblNombre1;
    private javax.swing.JLabel jlblTelefono;
    private javax.swing.JLabel jlblTitulo;
    // End of variables declaration//GEN-END:variables
}
