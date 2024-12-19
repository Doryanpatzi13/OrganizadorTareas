
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class FormInicio extends javax.swing.JFrame {

   
    public FormInicio() {
        
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
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iniciarSesion = new javax.swing.JPanel();
        lbliniciar = new javax.swing.JLabel();
        registrarse = new javax.swing.JPanel();
        lblregistrarse = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();

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

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("O");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(jLabel1);
        jLabel1.setBounds(660, 20, 20, 20);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("O");
        panelFondo.add(jLabel2);
        jLabel2.setBounds(680, 20, 20, 20);

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Seguimiento de Tarea");
        panelFondo.add(jLabel3);
        jLabel3.setBounds(160, 90, 440, 60);

        iniciarSesion.setBackground(new java.awt.Color(0, 102, 102));

        lbliniciar.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        lbliniciar.setForeground(new java.awt.Color(255, 255, 255));
        lbliniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliniciar.setText("INICIAR SESION");
        lbliniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbliniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbliniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbliniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbliniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iniciarSesionLayout = new javax.swing.GroupLayout(iniciarSesion);
        iniciarSesion.setLayout(iniciarSesionLayout);
        iniciarSesionLayout.setHorizontalGroup(
            iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iniciarSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbliniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        iniciarSesionLayout.setVerticalGroup(
            iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iniciarSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbliniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(iniciarSesion);
        iniciarSesion.setBounds(240, 200, 250, 50);

        registrarse.setBackground(new java.awt.Color(0, 204, 204));

        lblregistrarse.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        lblregistrarse.setForeground(new java.awt.Color(255, 255, 255));
        lblregistrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblregistrarse.setText("REGISTRARSE");
        lblregistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblregistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblregistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblregistrarseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblregistrarseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout registrarseLayout = new javax.swing.GroupLayout(registrarse);
        registrarse.setLayout(registrarseLayout);
        registrarseLayout.setHorizontalGroup(
            registrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblregistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        registrarseLayout.setVerticalGroup(
            registrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblregistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelFondo.add(registrarse);
        registrarse.setBounds(240, 270, 250, 50);

        imagen1.setText("imagen1");
        imagen1.setRuta("/resources/lapiz.png");
        panelFondo.add(imagen1);
        imagen1.setBounds(50, 180, 170, 150);

        imagen2.setText("imagen1");
        imagen2.setRuta("/resources/lapiz.png");
        panelFondo.add(imagen2);
        imagen2.setBounds(540, 190, 170, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lbliniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliniciarMouseEntered
     Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       lbliniciar.setBorder(borde);
    }//GEN-LAST:event_lbliniciarMouseEntered

    private void lbliniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliniciarMouseExited
     lbliniciar.setBorder(null);
    }//GEN-LAST:event_lbliniciarMouseExited

    private void lbliniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliniciarMousePressed
     this.dispose();
     
     Sesion sesion=new Sesion();
     sesion.setVisible(true);
    }//GEN-LAST:event_lbliniciarMousePressed

    private void lblregistrarseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblregistrarseMousePressed
     this.dispose();
     
     Registro registro=new Registro();
     registro.setVisible(true);
    }//GEN-LAST:event_lblregistrarseMousePressed

    private void lblregistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblregistrarseMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       lblregistrarse.setBorder(borde);
    }//GEN-LAST:event_lblregistrarseMouseEntered

    private void lblregistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblregistrarseMouseExited
       lblregistrarse.setBorder(null);
    }//GEN-LAST:event_lblregistrarseMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private javax.swing.JPanel iniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lbliniciar;
    private javax.swing.JLabel lblregistrarse;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel registrarse;
    // End of variables declaration//GEN-END:variables
}
