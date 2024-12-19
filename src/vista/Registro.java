
package vista;

import java.awt.Color;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import modelo.Usuario;
import modelo.UsuarioManager;

public class Registro extends javax.swing.JFrame {

    
    public Registro() {
         init();
        
    }
    public void init(){
        setUndecorated(true);
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        panelFondo.requestFocus();    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        registrarse = new javax.swing.JLabel();
        confirmar = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        guardar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cancelar = new javax.swing.JLabel();
        imagen3 = new modelo.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 236, 209));
        panelFondo.setPreferredSize(new java.awt.Dimension(500, 330));
        panelFondo.setLayout(null);

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

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("O");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(jLabel1);
        jLabel1.setBounds(660, 20, 20, 20);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        registrarse.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        registrarse.setForeground(new java.awt.Color(255, 255, 255));
        registrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarse.setText("REGISTRO DE USUARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(jPanel2);
        jPanel2.setBounds(180, 60, 420, 50);

        confirmar.setBackground(new java.awt.Color(0, 51, 102));
        confirmar.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        confirmar.setForeground(new java.awt.Color(255, 255, 255));
        confirmar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmar.setText("Confirmar Contraseña");
        confirmar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmarFocusLost(evt);
            }
        });
        confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmarMouseExited(evt);
            }
        });
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        panelFondo.add(confirmar);
        confirmar.setBounds(260, 330, 260, 50);

        txtNombre.setBackground(new java.awt.Color(0, 51, 102));
        txtNombre.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Nombre");
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNombreMouseExited(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panelFondo.add(txtNombre);
        txtNombre.setBounds(260, 150, 260, 50);

        txtCorreo.setBackground(new java.awt.Color(0, 51, 102));
        txtCorreo.setFont(new java.awt.Font("Montserrat", 1, 22)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setText("Correo");
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
        txtCorreo.setBounds(260, 210, 260, 50);

        txtContrasena.setBackground(new java.awt.Color(0, 51, 102));
        txtContrasena.setFont(new java.awt.Font("Montserrat", 1, 26)); // NOI18N
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
        txtContrasena.setBounds(260, 270, 260, 50);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        guardar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setText("Guardar");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(jPanel3);
        jPanel3.setBounds(540, 400, 130, 30);

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        cancelar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelar.setText("Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(jPanel4);
        jPanel4.setBounds(90, 400, 130, 30);

        imagen3.setText("imagen3");
        imagen3.setRuta("/resources/usuario.png");
        panelFondo.add(imagen3);
        imagen3.setBounds(80, 180, 130, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMousePressed
      // Obtener los datos del formulario
    String nombre = txtNombre.getText().trim();
    String correo = txtCorreo.getText().trim();
    String contrasena = txtContrasena.getText().trim();

    // Validación de campos
    if (nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", 
                                      "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Crear un nuevo usuario con los datos ingresados
    Usuario nuevoUsuario = new Usuario(nombre, correo, contrasena);

    // Guardar el nuevo usuario en el archivo
    try {
        // Llamamos al método guardarUsuario de UsuarioManager para guardar el usuario en el archivo
        UsuarioManager usuarioManager = new UsuarioManager();
        usuarioManager.guardarUsuario(nuevoUsuario);

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente", 
                                      "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar los campos del formulario
        txtNombre.setText("");
        txtCorreo.setText("");
        txtContrasena.setText("");

        // Redirigir a la ventana de sesión
        Sesion sesion = new Sesion();
        sesion.setVisible(true);
        dispose(); // Cierra la ventana actual
    } catch (Exception e) {  // Captura cualquier excepción en general
        JOptionPane.showMessageDialog(this, "Error al guardar el usuario: " + e.getMessage(),
                                      "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_guardarMousePressed

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarMouseClicked

    private void cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMousePressed
    FormInicio formInicio=new FormInicio();
    formInicio.setVisible(true);
    dispose();
    }//GEN-LAST:event_cancelarMousePressed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if(txtNombre.getText().equals("Nombre"))
           txtNombre.setText("");
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
      if(txtCorreo.getText().equals("Correo"))
           txtCorreo.setText("");
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
         if(txtNombre.getText().equals(""))
           txtNombre.setText("Nombre");
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
       if(txtCorreo.getText().equals(""))
           txtCorreo.setText("Correo");
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if(txtContrasena.getText().equals("Contraseña"))
           txtContrasena.setText("");
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        if(txtContrasena.getText().equals(""))
           txtContrasena.setText("Contraseña");
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void confirmarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmarFocusGained
        if(confirmar.getText().equals("Confirmar Contraseña"))
           confirmar.setText("");
    }//GEN-LAST:event_confirmarFocusGained

    private void confirmarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmarFocusLost
        if(confirmar.getText().equals(""))
           confirmar.setText("Confirmar Contraseña");
    }//GEN-LAST:event_confirmarFocusLost

    private void txtNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseEntered
       Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       txtNombre.setBorder(borde);
    }//GEN-LAST:event_txtNombreMouseEntered

    private void txtNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseExited
       txtNombre.setBorder(null);
    }//GEN-LAST:event_txtNombreMouseExited

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

    private void confirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseEntered
       Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       confirmar.setBorder(borde);
    }//GEN-LAST:event_confirmarMouseEntered

    private void confirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseExited
       confirmar.setBorder(null);
    }//GEN-LAST:event_confirmarMouseExited

    private void cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseEntered
       Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       cancelar.setBorder(borde);
    }//GEN-LAST:event_cancelarMouseEntered

    private void cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseExited
       cancelar.setBorder(null);
    }//GEN-LAST:event_cancelarMouseExited

    private void guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseEntered
       Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       guardar.setBorder(borde);
    }//GEN-LAST:event_guardarMouseEntered

    private void guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseExited
       guardar.setBorder(null);
    }//GEN-LAST:event_guardarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelar;
    private javax.swing.JTextField confirmar;
    private javax.swing.JLabel guardar;
    private modelo.Imagen imagen3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel registrarse;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
