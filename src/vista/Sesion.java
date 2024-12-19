
package vista;

import java.awt.Color;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import modelo.Usuario;
import modelo.UsuarioManager;


public class Sesion extends javax.swing.JFrame {
     
    public Sesion(){
       
         init();
        
    }
    public void init(){
        setUndecorated(true);
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        panelFondo.requestFocus();
        
       
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        iniciar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblCierre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        imagen3 = new modelo.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 236, 209));
        panelFondo.setPreferredSize(new java.awt.Dimension(500, 330));
        panelFondo.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIO DE SESION");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(200, 90, 360, 47);

        txtCorreo.setBackground(new java.awt.Color(0, 51, 102));
        txtCorreo.setFont(new java.awt.Font("Montserrat", 1, 22)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setText("Correo Electronico");
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCorreoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCorreoMouseExited(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        panelFondo.add(txtCorreo);
        txtCorreo.setBounds(240, 180, 280, 50);

        txtContrasena.setBackground(new java.awt.Color(0, 51, 102));
        txtContrasena.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasena.setText("Contraseña");
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusLost(evt);
            }
        });
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtContrasenaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtContrasenaMouseExited(evt);
            }
        });
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        panelFondo.add(txtContrasena);
        txtContrasena.setBounds(240, 240, 280, 50);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        iniciar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        iniciar.setForeground(new java.awt.Color(255, 255, 255));
        iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iniciar.setText("Iniciar");
        iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelFondo.add(jPanel3);
        jPanel3.setBounds(520, 360, 130, 30);

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cancelar");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(jPanel4);
        jPanel4.setBounds(100, 360, 130, 30);

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(255, 0, 0));
        lblCierre.setText("O");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(700, 20, 20, 20);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("O");
        panelFondo.add(jLabel2);
        jLabel2.setBounds(680, 20, 20, 20);

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("O");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(jLabel5);
        jLabel5.setBounds(660, 20, 20, 20);

        imagen3.setText("imagen3");
        imagen3.setRuta("/resources/secion1.png");
        panelFondo.add(imagen3);
        imagen3.setBounds(70, 160, 140, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void iniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMousePressed
     // Obtener los valores ingresados
    String correo = txtCorreo.getText().trim();
    String contrasena = new String(txtContrasena.getText()).trim();

    // Validar que los campos no estén vacíos
    if (correo.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", 
                                      "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Buscar el usuario en el archivo
        Usuario usuario = UsuarioManager.buscarUsuarioPorCorreo(correo);

        // Validar si existe el usuario y si la contraseña coincide
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso", 
                                          "Éxito", JOptionPane.INFORMATION_MESSAGE);
            // Aquí puedes redirigir a la siguiente ventana o funcionalidad
            // Por ejemplo: abrirVentanaPrincipal();
            Menu menu=new Menu();
            menu.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos", 
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer los usuarios: " + e.getMessage(), 
                                      "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_iniciarMousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
    FormInicio formInicio=new FormInicio();
    formInicio.setVisible(true);
    dispose();
    }//GEN-LAST:event_jLabel4MousePressed

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if(txtCorreo.getText().equals("Correo Electronico"))
           txtCorreo.setText("");
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
       if(txtContrasena.getText().equals("Contraseña"))
           txtContrasena.setText("");
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if(txtCorreo.getText().equals(""))
           txtCorreo.setText("Correo Electronico");
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
       if(txtContrasena.getText().equals(""))
           txtContrasena.setText("Contraseña");
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void txtCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseEntered
       Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       txtCorreo.setBorder(borde);
    }//GEN-LAST:event_txtCorreoMouseEntered

    private void txtCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseExited
       txtCorreo.setBorder(null);
    }//GEN-LAST:event_txtCorreoMouseExited

    private void txtContrasenaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       txtContrasena.setBorder(borde);
    }//GEN-LAST:event_txtContrasenaMouseEntered

    private void txtContrasenaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMouseExited
       txtContrasena.setBorder(null);
    }//GEN-LAST:event_txtContrasenaMouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       jLabel4.setBorder(borde);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void iniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseEntered
       Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       iniciar.setBorder(borde);
    }//GEN-LAST:event_iniciarMouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
       jLabel4.setBorder(null);
    }//GEN-LAST:event_jLabel4MouseExited

    private void iniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseExited
       iniciar.setBorder(null);
    }//GEN-LAST:event_iniciarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imagen3;
    private javax.swing.JLabel iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
