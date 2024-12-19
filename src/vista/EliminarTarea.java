
package vista;

import java.awt.Color;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.Border;


public class EliminarTarea extends javax.swing.JFrame {

   private List<String> tareas; // Lista de tareas cargadas desde el archivo
   
    public EliminarTarea() {
       setUndecorated(true);
        
        initComponents();
        cargarTareas();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void cargarTareas() {
        tareas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("tareas.txt"))) {
            String linea;
            StringBuilder tareaCompleta = new StringBuilder();
            while ((linea = reader.readLine()) != null) {
                if (linea.equals("---------------------------")) {
                    tareas.add(tareaCompleta.toString());
                    tareaCompleta.setLength(0); // Reinicia para la siguiente tarea
                } else {
                    tareaCompleta.append(linea).append("\n");
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "No se pudieron cargar las tareas: " + e.getMessage());
        }
        actualizarLista();
    }
  private void actualizarLista() {
    panelTareas.removeAll(); // Limpia el panel

    // Ajusta el tamaño del botón y la etiqueta
    int alturaComponente = 30; // Altura del botón y la etiqueta
    int espacioVertical = 10; // Espacio entre tareas
    int posicionVerticalInicial = 10; // Posición inicial desde arriba del panel

    for (int i = 0; i < tareas.size(); i++) {
        String tarea = tareas.get(i);
        
        // Supongamos que el nombre de la tarea está en la primera línea
        String nombreTarea = tarea.split("\n")[0]; // Divide el contenido por líneas y toma la primera línea

        // Crear botón y etiqueta con tamaños reducidos
        JButton btnEliminar = new JButton("Eliminar");
        JLabel lblTarea = new JLabel(nombreTarea); // Usa el nombre de la tarea

        // Calcula la posición vertical de cada elemento
        int posicionVertical = posicionVerticalInicial + i * (alturaComponente + espacioVertical);

        // Establece tamaño y posición
        lblTarea.setBounds(20, posicionVertical, 150, alturaComponente); // Más compacto
        btnEliminar.setBounds(200, posicionVertical, 80, alturaComponente); // Botón más pequeño

        int index = i; // Índice de la tarea a eliminar
        btnEliminar.addActionListener(evt -> eliminarTarea(index));

        // Añade los componentes al panel
        panelTareas.add(lblTarea);
        panelTareas.add(btnEliminar);
    }

    // Refresca el panel para mostrar los cambios
    panelTareas.revalidate();
    panelTareas.repaint();
}
     private void eliminarTarea(int index) {
        tareas.remove(index); // Elimina la tarea de la lista
        guardarTareas(); // Guarda la lista actualizada en el archivo
        actualizarLista(); // Actualiza la interfaz
        JOptionPane.showMessageDialog(this, "Tarea eliminada correctamente.");
    }
      private void guardarTareas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tareas.txt"))) {
            for (String tarea : tareas) {
                writer.write(tarea);
                writer.write("---------------------------");
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "No se pudo guardar las tareas: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        crearTarea = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        imagen3 = new modelo.Imagen();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCierre = new javax.swing.JLabel();
        panelTareas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 236, 209));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(739, 472));
        jPanel1.setLayout(null);

        crearTarea.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        crearTarea.setForeground(new java.awt.Color(0, 153, 153));
        crearTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearTarea.setText("ELIMINAR TAREA");
        jPanel1.add(crearTarea);
        crearTarea.setBounds(170, 40, 420, 50);

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Guardar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(570, 410, 130, 30);

        imagen3.setText("imagen1");
        imagen3.setRuta("/resources/eliminar.png");
        jPanel1.add(imagen3);
        imagen3.setBounds(580, 110, 110, 120);

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 0));
        jLabel9.setText("O");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 20, 20, 20);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("O");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(680, 20, 20, 20);

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(255, 0, 0));
        lblCierre.setText("O");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
        });
        jPanel1.add(lblCierre);
        lblCierre.setBounds(700, 20, 20, 20);

        panelTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTareasMouseExited(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jLabel5.setText("jLabel5");

        jButton4.setText("jButton4");

        jLabel6.setText("jLabel6");

        jButton5.setText("jButton5");

        jLabel7.setText("jLabel7");

        jButton6.setText("jButton6");

        jLabel10.setText("jLabel10");

        jButton7.setText("jButton7");

        jLabel11.setText("jLabel11");

        jButton8.setText("jButton8");

        javax.swing.GroupLayout panelTareasLayout = new javax.swing.GroupLayout(panelTareas);
        panelTareas.setLayout(panelTareasLayout);
        panelTareasLayout.setHorizontalGroup(
            panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTareasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTareasLayout.createSequentialGroup()
                        .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelTareasLayout.createSequentialGroup()
                        .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(25, 25, 25))
        );
        panelTareasLayout.setVerticalGroup(
            panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTareasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelTareas);
        panelTareas.setBounds(20, 120, 450, 330);

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

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        Menu menu=new Menu();
      menu.setVisible(true);
      dispose();
    }//GEN-LAST:event_lblCierreMouseClicked

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // Guardar las tareas en el archivo
    guardarTareas();
    
    // Actualizar la lista visual
    actualizarLista();
    
    // Confirmación al usuario
    JOptionPane.showMessageDialog(this, "Tareas guardadas y lista actualizada correctamente.");
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jLabel8.setBorder(borde);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
    jLabel8.setBorder(null);
    }//GEN-LAST:event_jLabel8MouseExited

    private void panelTareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTareasMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    panelTareas.setBorder(borde);
    }//GEN-LAST:event_panelTareasMouseEntered

    private void panelTareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTareasMouseExited
    panelTareas.setBorder(null);
    }//GEN-LAST:event_panelTareasMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel crearTarea;
    private modelo.Imagen imagen3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JPanel panelTareas;
    // End of variables declaration//GEN-END:variables
}
