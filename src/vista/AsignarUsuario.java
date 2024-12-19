
package vista;

import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class AsignarUsuario extends javax.swing.JFrame {
   
    private DefaultListModel<String> modeloTareas; // Modelo para la lista de tareas
    private ArrayList<String> listaTareasCompleta; // Lista completa de líneas del archivo
    private DefaultComboBoxModel<String> modeloUsuarios; // Modelo para el combo de usuarios

  
    public AsignarUsuario() {
       setUndecorated(true);
        
        initComponents();
        cargarTareas();
        cargarUsuarios();
        setResizable(false);
        setLocationRelativeTo(null);
    }
   
    // Método para cargar tareas y sus usuarios asignados
    private void cargarTareas() {
        modeloTareas = new DefaultListModel<>();
        listaTareasCompleta = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("tareas.txt"))) {
            String linea;
            String nombreTarea = null;
            String usuarioAsignado = null;

            while ((linea = reader.readLine()) != null) {
                listaTareasCompleta.add(linea); // Guarda todas las líneas en la lista completa

                if (linea.startsWith("Nombre: ")) {
                    nombreTarea = linea.substring(8); // Extrae el nombre de la tarea
                } else if (linea.startsWith("Usuario: ")) {
                    usuarioAsignado = linea.substring(9); // Extrae el usuario asignado

                    // Si ambos (nombre y usuario) están disponibles, agrégalos al modelo
                    if (nombreTarea != null) {
                        modeloTareas.addElement(nombreTarea + " (Usuario: " + usuarioAsignado + ")");
                        nombreTarea = null; // Reinicia para la siguiente tarea
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar tareas.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        listaTareas.setModel(modeloTareas); // Asigna el modelo al JList
    }

    // Método para cargar usuarios registrados
    private void cargarUsuarios() {
        modeloUsuarios = new DefaultComboBoxModel<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Nombre: ")) {
                    String nombreUsuario = linea.substring(8); // Extrae el nombre del usuario
                    modeloUsuarios.addElement(nombreUsuario);
                }
            }
        } catch (IOException e) {
            modeloUsuarios.addElement("Error al cargar usuarios");
        }

        comboUsuarios.setModel(modeloUsuarios); // Asigna el modelo al JComboBox
    }

    // Método para asignar un usuario a una tarea seleccionada
  private void asignarUsuario() {
    int indiceSeleccionado = listaTareas.getSelectedIndex();
    String nuevoUsuario = comboUsuarios.getSelectedItem().toString();

    if (indiceSeleccionado == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una tarea.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Buscar y actualizar el usuario correspondiente en la lista completa
    String tareaSeleccionada = modeloTareas.getElementAt(indiceSeleccionado).split(" \\(Usuario: ")[0]; // Obtiene solo el nombre
    boolean usuarioActualizado = false;

    for (int i = 0; i < listaTareasCompleta.size(); i++) {
        String lineaActual = listaTareasCompleta.get(i);
        if (lineaActual.equals("Nombre: " + tareaSeleccionada)) {
            // Buscar la línea "Usuario: " para actualizar
            for (int j = i; j < listaTareasCompleta.size(); j++) {
                if (listaTareasCompleta.get(j).startsWith("Usuario: ")) {
                    listaTareasCompleta.set(j, "Usuario: " + nuevoUsuario); // Actualiza el usuario
                    usuarioActualizado = true;
                    break;
                }
            }
        }
        if (usuarioActualizado) break;
    }
     if (usuarioActualizado) {
        // Actualizar el modelo del JList
        modeloTareas.set(indiceSeleccionado, tareaSeleccionada + " (Usuario: " + nuevoUsuario + ")");
    }
    // Guardar los cambios en el archivo sin actualizar el JList inmediatamente
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("tareas.txt"))) {
        for (String linea : listaTareasCompleta) {
            writer.write(linea);
            writer.newLine();
        }
        JOptionPane.showMessageDialog(this, "Usuario asignado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar la asignación.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // No actualizamos el JList aquí. El modelo de tareas se mantendrá igual.
    // El JList se actualizará cuando sea necesario, como por ejemplo, al cargar las tareas en otra ventana.
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panelFondo = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        crearTarea = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAsignar = new javax.swing.JLabel();
        imagen3 = new modelo.Imagen();
        comboUsuarios = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTareas = new javax.swing.JList<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 236, 209));
        panelFondo.setPreferredSize(new java.awt.Dimension(739, 472));
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

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("O");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(jLabel5);
        jLabel5.setBounds(660, 20, 20, 20);

        crearTarea.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        crearTarea.setForeground(new java.awt.Color(0, 153, 153));
        crearTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearTarea.setText("ASIGNAR TAREA");
        panelFondo.add(crearTarea);
        crearTarea.setBounds(170, 40, 420, 50);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        btnAsignar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnAsignar.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAsignar.setText("Guardar");
        btnAsignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAsignarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAsignarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(jPanel3);
        jPanel3.setBounds(570, 410, 130, 30);

        imagen3.setText("imagen1");
        imagen3.setRuta("/resources/listar.png");
        panelFondo.add(imagen3);
        imagen3.setBounds(610, 80, 110, 120);

        comboUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboUsuariosMouseExited(evt);
            }
        });
        panelFondo.add(comboUsuarios);
        comboUsuarios.setBounds(370, 140, 180, 40);

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

        panelFondo.add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 290, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
      Menu menu=new Menu();
      menu.setVisible(true);
      dispose();
    }//GEN-LAST:event_lblCierreMouseClicked

    private void btnAsignarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMousePressed
      asignarUsuario();    
    }//GEN-LAST:event_btnAsignarMousePressed

    private void btnAsignarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    btnAsignar.setBorder(borde);
    }//GEN-LAST:event_btnAsignarMouseEntered

    private void btnAsignarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMouseExited
    btnAsignar.setBorder(null);
    }//GEN-LAST:event_btnAsignarMouseExited

    private void listaTareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTareasMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    listaTareas.setBorder(borde);
    }//GEN-LAST:event_listaTareasMouseEntered

    private void listaTareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTareasMouseExited
    listaTareas.setBorder(null);
    }//GEN-LAST:event_listaTareasMouseExited

    private void comboUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboUsuariosMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    comboUsuarios.setBorder(borde);
    }//GEN-LAST:event_comboUsuariosMouseEntered

    private void comboUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboUsuariosMouseExited
    comboUsuarios.setBorder(null);
    }//GEN-LAST:event_comboUsuariosMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAsignar;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JLabel crearTarea;
    private modelo.Imagen imagen3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JList<String> listaTareas;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
