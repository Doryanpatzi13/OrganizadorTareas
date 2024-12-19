
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class Menu extends javax.swing.JFrame {

    public Menu() {
       setUndecorated(true);
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        imagen1 = new modelo.Imagen();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        imagen2 = new modelo.Imagen();
        jPanel3 = new javax.swing.JPanel();
        imagen3 = new modelo.Imagen();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        imagen4 = new modelo.Imagen();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        imagen5 = new modelo.Imagen();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        imagen6 = new modelo.Imagen();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        imagen7 = new modelo.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenu.setBackground(new java.awt.Color(255, 236, 209));
        panelMenu.setPreferredSize(new java.awt.Dimension(500, 330));
        panelMenu.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(255, 0, 0));
        lblCierre.setText("O");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
        });
        panelMenu.add(lblCierre);
        lblCierre.setBounds(700, 20, 20, 20);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("O");
        panelMenu.add(jLabel2);
        jLabel2.setBounds(680, 20, 20, 20);

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("O");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMenu.add(jLabel5);
        jLabel5.setBounds(660, 20, 20, 20);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU PRINCIPAL");
        panelMenu.add(jLabel1);
        jLabel1.setBounds(190, 70, 360, 39);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        imagen1.setText("imagen1");
        imagen1.setRuta("/resources/prioridades.png");
        imagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagen1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagen1MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cambiar Prioridad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMenu.add(jPanel1);
        jPanel1.setBounds(440, 300, 110, 110);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Crear Usuario");

        imagen2.setText("imagen1");
        imagen2.setRuta("/resources/usuario.png");
        imagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagen2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagen2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(jPanel2);
        jPanel2.setBounds(580, 230, 110, 110);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        imagen3.setText("imagen1");
        imagen3.setRuta("/resources/listar.png");
        imagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagen3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagen3MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Listar Tareas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(jPanel3);
        jPanel3.setBounds(260, 160, 110, 110);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        imagen4.setText("imagen1");
        imagen4.setRuta("/resources/asignacion.png");
        imagen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagen4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagen4MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Asignacion de Tarea");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(jPanel4);
        jPanel4.setBounds(440, 160, 110, 110);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        imagen5.setText("imagen1");
        imagen5.setRuta("/resources/eliminar.png");
        imagen5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagen5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagen5MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Eliminar Tarea");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(jPanel5);
        jPanel5.setBounds(90, 300, 110, 110);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        imagen6.setText("imagen1");
        imagen6.setRuta("/resources/actulizar.png");
        imagen6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagen6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagen6MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Actualizar Estado");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen6, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMenu.add(jPanel6);
        jPanel6.setBounds(260, 300, 110, 110);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Crear Tarea");

        imagen7.setText("imagen1");
        imagen7.setRuta("/resources/crearTarea.png");
        imagen7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagen7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagen7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagen7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imagen7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(jPanel7);
        jPanel7.setBounds(90, 160, 110, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void imagen2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MousePressed
        Registro registro = new Registro();
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_imagen2MousePressed

    private void imagen3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen3MousePressed
        ListaTareas listarDeTare=new ListaTareas();
        listarDeTare.setVisible(true);
        dispose();
    }//GEN-LAST:event_imagen3MousePressed

    private void imagen4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen4MousePressed
        AsignarUsuario asignarTarea=new AsignarUsuario();
        asignarTarea.setVisible(true);
        dispose();
    }//GEN-LAST:event_imagen4MousePressed

    private void imagen5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen5MousePressed
        EliminarTarea eliminarTarea=new EliminarTarea();
        eliminarTarea.setVisible(true);
        dispose();
    }//GEN-LAST:event_imagen5MousePressed

    private void imagen6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen6MousePressed
       ActualizarEstado actualizarEstado=new ActualizarEstado();
       actualizarEstado.setVisible(true);
        dispose();
    }//GEN-LAST:event_imagen6MousePressed

    private void imagen1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MousePressed
      Prioridad prioridad=new Prioridad();
      prioridad.setVisible(true);
      dispose();
    }//GEN-LAST:event_imagen1MousePressed

    private void imagen7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen7MousePressed
     CrearTarea crearTarea=new CrearTarea();
     crearTarea.setVisible(true);
     dispose();
    }//GEN-LAST:event_imagen7MousePressed

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jPanel7.setBorder(borde);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
    jPanel7.setBorder(null);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jPanel3.setBorder(borde);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
    jPanel3.setBorder(null);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jPanel4.setBorder(borde);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
    jPanel4.setBorder(null);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jPanel5.setBorder(borde);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
    jPanel5.setBorder(null);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jPanel6.setBorder(borde);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
    jPanel6.setBorder(null);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jPanel1.setBorder(borde);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
    jPanel1.setBorder(null);
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jPanel2.setBorder(borde);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
    jPanel2.setBorder(null);
    }//GEN-LAST:event_jPanel2MouseExited

    private void imagen7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen7MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    imagen7.setBorder(borde);
    }//GEN-LAST:event_imagen7MouseEntered

    private void imagen7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen7MouseExited
    imagen7.setBorder(null);
    }//GEN-LAST:event_imagen7MouseExited

    private void imagen3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen3MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    imagen3.setBorder(borde);
    }//GEN-LAST:event_imagen3MouseEntered

    private void imagen3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen3MouseExited
    imagen3.setBorder(null);
    }//GEN-LAST:event_imagen3MouseExited

    private void imagen4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen4MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    imagen4.setBorder(borde);
    }//GEN-LAST:event_imagen4MouseEntered

    private void imagen4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen4MouseExited
    imagen4.setBorder(null);
    }//GEN-LAST:event_imagen4MouseExited

    private void imagen5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen5MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    imagen5.setBorder(borde);
    }//GEN-LAST:event_imagen5MouseEntered

    private void imagen5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen5MouseExited
    imagen5.setBorder(null);
    }//GEN-LAST:event_imagen5MouseExited

    private void imagen6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen6MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    imagen6.setBorder(borde);
    }//GEN-LAST:event_imagen6MouseEntered

    private void imagen6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen6MouseExited
    imagen6.setBorder(null);
    }//GEN-LAST:event_imagen6MouseExited

    private void imagen1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    imagen1.setBorder(borde);
    }//GEN-LAST:event_imagen1MouseEntered

    private void imagen1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseExited
    imagen1.setBorder(null);
    }//GEN-LAST:event_imagen1MouseExited

    private void imagen2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    imagen2.setBorder(borde);
    }//GEN-LAST:event_imagen2MouseEntered

    private void imagen2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MouseExited
    imagen2.setBorder(null);
    }//GEN-LAST:event_imagen2MouseExited

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private modelo.Imagen imagen3;
    private modelo.Imagen imagen4;
    private modelo.Imagen imagen5;
    private modelo.Imagen imagen6;
    private modelo.Imagen imagen7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
