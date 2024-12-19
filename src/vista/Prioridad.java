
package vista;

import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Prioridad extends javax.swing.JFrame {

    private DefaultListModel<String> modeloTareas; // Modelo para las tareas
    private ArrayList<String> listaTareasCompleta; // Lista completa de tareas (incluyendo estados originales)
    
    public Prioridad() {
        setUndecorated(true);
        
        initComponents();
         cargarTareas();
        setResizable(false);
        setLocationRelativeTo(null);
    }
 // Método para cargar tareas y sus estados
    private void cargarTareas() {
    modeloTareas = new DefaultListModel<>();
    listaTareasCompleta = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("tareas.txt"))) {
        String linea;
        String nombreTarea = null;
        String prioridadTarea = null;

        while ((linea = reader.readLine()) != null) {
            listaTareasCompleta.add(linea); // Guarda todas las líneas en la lista completa

            if (linea.startsWith("Nombre: ")) {
                nombreTarea = linea.substring(8); // Extrae el nombre
            } else if (linea.startsWith("Prioridad: ")) {
                prioridadTarea = linea.substring(10); // Extrae la prioridad

                // Si ambos (nombre y prioridad) están disponibles, agrégalos al modelo
                if (nombreTarea != null) {
                    modeloTareas.addElement("Nombre: "+nombreTarea+ " (Prioridad: " + prioridadTarea+")" );
                    nombreTarea = null; // Reinicia para la siguiente tarea
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar tareas.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    listaTareas.setModel(modeloTareas); // Asigna el modelo al JList
}

   private void guardarPrioridad() {
    int indiceSeleccionado = listaTareas.getSelectedIndex();
    String nuevaPrioridad = comboPrioridad.getSelectedItem().toString(); // Obtén la nueva prioridad del JComboBox

    if (indiceSeleccionado == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una tarea.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Extraer solo el nombre de la tarea sin el formato adicional
    String tareaSeleccionada = modeloTareas.getElementAt(indiceSeleccionado).split(": ")[1].split(" \\(")[0]; // Obtiene solo el nombre después de "Nombre: "
    boolean prioridadActualizada = false;

    // Buscar y actualizar la prioridad correspondiente en la lista completa
    for (int i = 0; i < listaTareasCompleta.size(); i++) {
        String lineaActual = listaTareasCompleta.get(i);

        // Si la línea coincide con el nombre de la tarea seleccionada
        if (lineaActual.equals("Nombre: " + tareaSeleccionada)) {
            // Buscar la línea de "Prioridad: " para actualizar
            for (int j = i + 1; j < listaTareasCompleta.size(); j++) {
                if (listaTareasCompleta.get(j).startsWith("Prioridad: ")) {
                    listaTareasCompleta.set(j, "Prioridad: " + nuevaPrioridad); // Actualiza la prioridad
                    prioridadActualizada = true;
                    break;
                }
            }
        }
        if (prioridadActualizada) break;
    }

    if (prioridadActualizada) {
        // Actualizar el modelo del JList
        modeloTareas.set(indiceSeleccionado, "Nombre: " + tareaSeleccionada + " (Prioridad: " + nuevaPrioridad + ")");
    }

    // Guardar cambios en el archivo
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("tareas.txt"))) {
        for (String linea : listaTareasCompleta) {
            writer.write(linea);
            writer.newLine();
        }
        JOptionPane.showMessageDialog(this, "Prioridad actualizada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar la prioridad.", "Error", JOptionPane.ERROR_MESSAGE);
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
        lblCierre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTareas = new javax.swing.JList<>();
        comboPrioridad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 236, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(739, 472));
        jPanel1.setLayout(null);

        crearTarea.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        crearTarea.setForeground(new java.awt.Color(0, 153, 153));
        crearTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearTarea.setText("Cambiar Prioridad");
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
        imagen3.setRuta("/resources/prioridades.png");
        jPanel1.add(imagen3);
        imagen3.setBounds(600, 100, 100, 110);

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(255, 0, 0));
        lblCierre.setText("O");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        jPanel1.add(lblCierre);
        lblCierre.setBounds(700, 20, 20, 20);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("O");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(680, 20, 20, 20);

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("O");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(660, 20, 20, 20);

        listaTareas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaTareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaTareasMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(listaTareas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 300, 230);

        comboPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Baja", "Media" }));
        comboPrioridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboPrioridadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboPrioridadMouseExited(evt);
            }
        });
        comboPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPrioridadActionPerformed(evt);
            }
        });
        jPanel1.add(comboPrioridad);
        comboPrioridad.setBounds(360, 120, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
       Menu menu=new Menu();
      menu.setVisible(true);
      dispose();
    }//GEN-LAST:event_lblCierreMouseClicked

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        guardarPrioridad();
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jLabel8.setBorder(borde);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
    jLabel8.setBorder(null);
    }//GEN-LAST:event_jLabel8MouseExited

    private void listaTareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTareasMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    listaTareas.setBorder(borde);
    }//GEN-LAST:event_listaTareasMouseEntered

    private void listaTareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTareasMouseExited
    listaTareas.setBorder(null);
    }//GEN-LAST:event_listaTareasMouseExited

    private void comboPrioridadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboPrioridadMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    comboPrioridad.setBorder(borde);
    }//GEN-LAST:event_comboPrioridadMouseEntered

    private void comboPrioridadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboPrioridadMouseExited
    comboPrioridad.setBorder(null);
    }//GEN-LAST:event_comboPrioridadMouseExited

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
    
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
    
    }//GEN-LAST:event_lblCierreMouseExited

    private void comboPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPrioridadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboPrioridad;
    private javax.swing.JLabel crearTarea;
    private modelo.Imagen imagen3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JList<String> listaTareas;
    // End of variables declaration//GEN-END:variables
}
