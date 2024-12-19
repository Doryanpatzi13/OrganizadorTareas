
package vista;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import modelo.GestorPersistencia;
import modelo.Tarea;

public class CrearTarea extends javax.swing.JFrame{
    private ButtonGroup buttonGroupPrioridad;
    private ButtonGroup buttonGroupEstado;

    public CrearTarea() {
        setUndecorated(true);

        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        panelFondo.requestFocus();

        // Inicializar los grupos de botones
        buttonGroupPrioridad = new ButtonGroup();
        buttonGroupEstado = new ButtonGroup();

        // Agregar los botones al grupo de prioridades
        buttonGroupPrioridad.add(btnBaja);
        buttonGroupPrioridad.add(btnMedia);
        buttonGroupPrioridad.add(btnAlta);

        // Agregar los botones al grupo de estados
        buttonGroupEstado.add(btnCompletada);
        buttonGroupEstado.add(btnEnProgreso);
        buttonGroupEstado.add(btnPorHacer);

        // Cargar los usuarios desde el archivo
        cargarUsuarios();
    }

    // Método para cargar usuarios desde el archivo usuarios.txt
    private void cargarUsuarios() {
        DefaultComboBoxModel<String> modeloUsuarios = new DefaultComboBoxModel<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Nombre: ")) {
                    String nombreUsuario = linea.substring(8); // Extrae el nombre del usuario
                    modeloUsuarios.addElement(nombreUsuario);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los usuarios: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        cmbUsuarios.setModel(modeloUsuarios); // Asigna el modelo al JComboBox
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        prioridad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        imagen3 = new modelo.Imagen();
        crearTarea = new javax.swing.JLabel();
        btnCompletada = new javax.swing.JRadioButton();
        btnEnProgreso = new javax.swing.JRadioButton();
        btnPorHacer = new javax.swing.JRadioButton();
        btnBaja = new javax.swing.JRadioButton();
        btnMedia = new javax.swing.JRadioButton();
        btnAlta = new javax.swing.JRadioButton();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        prioridad2 = new javax.swing.JLabel();
        prioridad3 = new javax.swing.JLabel();
        prioridad4 = new javax.swing.JLabel();
        cmbUsuarios = new javax.swing.JComboBox<>();

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
        txtNombre.setBounds(40, 120, 260, 50);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Guardar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel3);
        jPanel3.setBounds(350, 410, 130, 30);

        prioridad.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        prioridad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioridad.setText("Estado");
        panelFondo.add(prioridad);
        prioridad.setBounds(430, 230, 210, 50);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDescripcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDescripcionMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        panelFondo.add(jScrollPane1);
        jScrollPane1.setBounds(40, 180, 260, 160);

        imagen3.setText("imagen3");
        imagen3.setRuta("/resources/crearTarea.png");
        panelFondo.add(imagen3);
        imagen3.setBounds(570, 40, 110, 100);

        crearTarea.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        crearTarea.setForeground(new java.awt.Color(0, 153, 153));
        crearTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearTarea.setText("CREAR  TAREA");
        panelFondo.add(crearTarea);
        crearTarea.setBounds(170, 40, 420, 50);

        btnCompletada.setBackground(new java.awt.Color(51, 204, 0));
        btnCompletada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCompletada.setText("Completada");
        btnCompletada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCompletada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCompletadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCompletadaMouseExited(evt);
            }
        });
        panelFondo.add(btnCompletada);
        btnCompletada.setBounds(350, 280, 120, 40);

        btnEnProgreso.setBackground(new java.awt.Color(255, 204, 0));
        btnEnProgreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnProgreso.setText("En Progreso");
        btnEnProgreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnProgreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnProgresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnProgresoMouseExited(evt);
            }
        });
        panelFondo.add(btnEnProgreso);
        btnEnProgreso.setBounds(470, 280, 120, 40);

        btnPorHacer.setBackground(new java.awt.Color(255, 0, 51));
        btnPorHacer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPorHacer.setText("Por Hacer");
        btnPorHacer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPorHacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPorHacerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPorHacerMouseExited(evt);
            }
        });
        panelFondo.add(btnPorHacer);
        btnPorHacer.setBounds(590, 280, 120, 40);

        btnBaja.setBackground(new java.awt.Color(51, 204, 0));
        btnBaja.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBaja.setText("Baja");
        btnBaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBajaMouseExited(evt);
            }
        });
        panelFondo.add(btnBaja);
        btnBaja.setBounds(350, 190, 120, 40);

        btnMedia.setBackground(new java.awt.Color(255, 204, 0));
        btnMedia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMedia.setText("Media");
        btnMedia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMediaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMediaMouseExited(evt);
            }
        });
        panelFondo.add(btnMedia);
        btnMedia.setBounds(470, 190, 120, 40);

        btnAlta.setBackground(new java.awt.Color(255, 0, 51));
        btnAlta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlta.setText("Alta");
        btnAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAltaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAltaMouseExited(evt);
            }
        });
        panelFondo.add(btnAlta);
        btnAlta.setBounds(590, 190, 120, 40);

        txtFechaInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFechaInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaInicio.setText("dd/MM/yyyy");
        txtFechaInicio.setActionCommand("<Not Set>");
        txtFechaInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaInicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaInicioFocusLost(evt);
            }
        });
        panelFondo.add(txtFechaInicio);
        txtFechaInicio.setBounds(30, 400, 110, 30);

        txtFechaFin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFechaFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaFin.setText("dd/MM/yyyy");
        txtFechaFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaFinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFinFocusLost(evt);
            }
        });
        panelFondo.add(txtFechaFin);
        txtFechaFin.setBounds(190, 400, 110, 30);

        prioridad2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        prioridad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioridad2.setText("Prioridad");
        panelFondo.add(prioridad2);
        prioridad2.setBounds(420, 140, 210, 50);

        prioridad3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        prioridad3.setForeground(new java.awt.Color(0, 153, 204));
        prioridad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioridad3.setText("Fecha Fin");
        panelFondo.add(prioridad3);
        prioridad3.setBounds(190, 380, 110, 20);

        prioridad4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        prioridad4.setForeground(new java.awt.Color(0, 153, 204));
        prioridad4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioridad4.setText("Fecha Inicio");
        panelFondo.add(prioridad4);
        prioridad4.setBounds(30, 380, 110, 20);

        cmbUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuariosActionPerformed(evt);
            }
        });
        panelFondo.add(cmbUsuarios);
        cmbUsuarios.setBounds(520, 360, 170, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
      Menu menu=new Menu();
      menu.setVisible(true);
      dispose();
    }//GEN-LAST:event_lblCierreMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
     // Obtener los valores ingresados por el usuario
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        String prioridad = "";
        String estado = "";
        String fechaInicioTexto = txtFechaInicio.getText();
        String fechaFinTexto = txtFechaFin.getText();
        String usuarioSeleccionado = (String) cmbUsuarios.getSelectedItem(); // Obtener el usuario seleccionado

        // Verificar la prioridad seleccionada
        if (btnBaja.isSelected()) {
            prioridad = "Baja";
        } else if (btnMedia.isSelected()) {
            prioridad = "Media";
        } else if (btnAlta.isSelected()) {
            prioridad = "Alta";
        }

        // Verificar el estado seleccionado
        if (btnCompletada.isSelected()) {
            estado = "Completada";
        } else if (btnEnProgreso.isSelected()) {
            estado = "En Progreso";
        } else if (btnPorHacer.isSelected()) {
            estado = "Por Hacer";
        }

        // Validar que todos los campos estén completos
        if (nombre.isEmpty() || descripcion.isEmpty() || prioridad.isEmpty() || estado.isEmpty() || fechaInicioTexto.isEmpty() || fechaFinTexto.isEmpty() || usuarioSeleccionado == null || usuarioSeleccionado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos y seleccione un usuario.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar el formato de las fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicio;
        LocalDate fechaFin;

        try {
            fechaInicio = LocalDate.parse(fechaInicioTexto, formatter);
            fechaFin = LocalDate.parse(fechaFinTexto, formatter);

            // Validar que la fecha de fin sea posterior a la fecha de inicio
            if (fechaFin.isBefore(fechaInicio)) {
                JOptionPane.showMessageDialog(this, "La fecha de fin debe ser posterior a la fecha de inicio.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese las fechas en el formato dd/MM/yyyy.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear el objeto Tarea
        Tarea nuevaTarea = new Tarea(nombre, descripcion, prioridad, estado, usuarioSeleccionado, fechaInicio, fechaFin);

        // Guardar la tarea en el archivo
        try {
            GestorPersistencia gestor = new GestorPersistencia("tareas.txt");
            gestor.guardarTarea(nuevaTarea);
            JOptionPane.showMessageDialog(this, "Tarea guardada exitosamente.");

            // Limpiar los campos de entrada después de guardar
            txtNombre.setText("Nombre");
            txtDescripcion.setText("");
            txtFechaInicio.setText("");
            txtFechaFin.setText("");
            buttonGroupPrioridad.clearSelection();
            buttonGroupEstado.clearSelection();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la tarea: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jLabel3MousePressed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
         if(txtNombre.getText().equals("Nombre"))
           txtNombre.setText("");
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if(txtNombre.getText().equals(""))
           txtNombre.setText("Nombre");
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseEntered
       Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
       txtNombre.setBorder(borde);
    }//GEN-LAST:event_txtNombreMouseEntered

    private void txtNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseExited
       txtNombre.setBorder(null);
    }//GEN-LAST:event_txtNombreMouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    jLabel3.setBorder(borde);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
    jLabel3.setBorder(null);
    }//GEN-LAST:event_jLabel3MouseExited

    private void txtDescripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    txtDescripcion.setBorder(borde);
    }//GEN-LAST:event_txtDescripcionMouseEntered

    private void txtDescripcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMouseExited
    txtDescripcion.setBorder(null);
    }//GEN-LAST:event_txtDescripcionMouseExited

    private void btnBajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajaMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    btnBaja.setBorder(borde);
    }//GEN-LAST:event_btnBajaMouseEntered

    private void btnBajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajaMouseExited
    btnBaja.setBorder(null);
    }//GEN-LAST:event_btnBajaMouseExited

    private void btnMediaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMediaMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    btnMedia.setBorder(borde);
    }//GEN-LAST:event_btnMediaMouseEntered

    private void btnMediaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMediaMouseExited
    btnMedia.setBorder(null);
    }//GEN-LAST:event_btnMediaMouseExited

    private void btnAltaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    btnAlta.setBorder(borde);
    }//GEN-LAST:event_btnAltaMouseEntered

    private void btnAltaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaMouseExited
    btnAlta.setBorder(null);
    }//GEN-LAST:event_btnAltaMouseExited

    private void btnCompletadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompletadaMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    btnCompletada.setBorder(borde);
    }//GEN-LAST:event_btnCompletadaMouseEntered

    private void btnCompletadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompletadaMouseExited
    btnCompletada.setBorder(null);
    }//GEN-LAST:event_btnCompletadaMouseExited

    private void btnEnProgresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnProgresoMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    btnEnProgreso.setBorder(borde);
    }//GEN-LAST:event_btnEnProgresoMouseEntered

    private void btnEnProgresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnProgresoMouseExited
    btnEnProgreso.setBorder(null);
    }//GEN-LAST:event_btnEnProgresoMouseExited

    private void btnPorHacerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPorHacerMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    btnPorHacer.setBorder(borde);
    }//GEN-LAST:event_btnPorHacerMouseEntered

    private void btnPorHacerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPorHacerMouseExited
    btnPorHacer.setBorder(null);
    }//GEN-LAST:event_btnPorHacerMouseExited

    private void txtFechaInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaInicioFocusGained
     if(txtFechaInicio.getText().equals("dd/MM/yyyy"))
           txtFechaInicio.setText("");
    }//GEN-LAST:event_txtFechaInicioFocusGained

    private void txtFechaInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaInicioFocusLost
      if(txtFechaInicio.getText().equals(""))
           txtFechaInicio.setText("dd/MM/yyyy");
    }//GEN-LAST:event_txtFechaInicioFocusLost

    private void txtFechaFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFinFocusGained
      if(txtFechaFin.getText().equals("dd/MM/yyyy"))
           txtFechaFin.setText("");
    }//GEN-LAST:event_txtFechaFinFocusGained

    private void txtFechaFinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFinFocusLost
       if(txtFechaFin.getText().equals(""))
           txtFechaFin.setText("dd/MM/yyyy");
    }//GEN-LAST:event_txtFechaFinFocusLost

    private void cmbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsuariosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAlta;
    private javax.swing.JRadioButton btnBaja;
    private javax.swing.JRadioButton btnCompletada;
    private javax.swing.JRadioButton btnEnProgreso;
    private javax.swing.JRadioButton btnMedia;
    private javax.swing.JRadioButton btnPorHacer;
    private javax.swing.JComboBox<String> cmbUsuarios;
    private javax.swing.JLabel crearTarea;
    private modelo.Imagen imagen3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel prioridad;
    private javax.swing.JLabel prioridad2;
    private javax.swing.JLabel prioridad3;
    private javax.swing.JLabel prioridad4;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}