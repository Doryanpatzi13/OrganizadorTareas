
package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.Border;

public class ListaTareas extends javax.swing.JFrame {

    private List<Object[]> todasLasTareas = new ArrayList<>(); // Lista para almacenar todas las tareas

    public ListaTareas() {
        setUndecorated(true);
        initComponents();
        cargarTareas();
        configurarFiltros();
        configurarColumnas();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void cargarTareas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Prioridad");
        modelo.addColumn("Estado");
        modelo.addColumn("Usuario");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Fin");

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        todasLasTareas.clear(); // Limpiar la lista de tareas antes de recargar

        try (BufferedReader reader = new BufferedReader(new FileReader("tareas.txt"))) {
            String linea;
            String nombre = "";
            String descripcion = "";
            String prioridad = "";
            String estado = "";
            String usuario = "Sin designar";
            String fechaInicio = "";
            String fechaFin = "";

            while ((linea = reader.readLine()) != null) {
                if (linea.equals("---------------------------")) {
                    Object[] tarea = {nombre, descripcion, prioridad, estado, usuario, fechaInicio, fechaFin};
                    todasLasTareas.add(tarea); // Guardar tarea en la lista
                    modelo.addRow(tarea); // Mostrar tarea en la tabla
                    nombre = "";
                    descripcion = "";
                    prioridad = "";
                    estado = "";
                    usuario = "Sin designar";
                    fechaInicio = "";
                    fechaFin = "";
                } else if (linea.startsWith("Nombre: ")) {
                    nombre = linea.substring(8);
                } else if (linea.startsWith("Descripción: ")) {
                    descripcion = linea.substring(13);
                } else if (linea.startsWith("Prioridad: ")) {
                    prioridad = linea.substring(11);
                } else if (linea.startsWith("Estado: ")) {
                    estado = linea.substring(8);
                } else if (linea.startsWith("Usuario: ")) {
                    usuario = linea.substring(9);
                } else if (linea.startsWith("Fecha Inicio: ")) {
                    fechaInicio = linea.substring(14);
                    try {
                        LocalDate dateInicio = LocalDate.parse(fechaInicio, inputFormatter);
                        fechaInicio = dateInicio.format(outputFormatter);
                    } catch (DateTimeParseException e) {
                        fechaInicio = "Fecha inválida";
                    }
                } else if (linea.startsWith("Fecha Fin: ")) {
                    fechaFin = linea.substring(11);
                    try {
                        LocalDate dateFin = LocalDate.parse(fechaFin, inputFormatter);
                        fechaFin = dateFin.format(outputFormatter);
                    } catch (DateTimeParseException e) {
                        fechaFin = "Fecha inválida";
                    }
                }
            }

            if (!nombre.isEmpty() || !descripcion.isEmpty() || !prioridad.isEmpty() || !estado.isEmpty()) {
                Object[] tarea = {nombre, descripcion, prioridad, estado, usuario, fechaInicio, fechaFin};
                todasLasTareas.add(tarea); // Guardar la última tarea
                modelo.addRow(tarea);
            }

        } catch (IOException e) {
            modelo.addRow(new Object[]{"Error", "No se pudieron cargar las tareas", "", "", "", "", e.getMessage()});
        }

        tablaTareas.setModel(modelo);
        tablaTareas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (column == 2) {
                    String prioridad = (String) value;
                    if ("Baja".equals(prioridad)) {
                        c.setBackground(Color.GREEN);
                        c.setForeground(Color.BLACK);
                    } else if ("Media".equals(prioridad)) {
                        c.setBackground(Color.YELLOW);
                        c.setForeground(Color.BLACK);
                    } else if ("Alta".equals(prioridad)) {
                        c.setBackground(Color.RED);
                        c.setForeground(Color.WHITE);
                    } else {
                        c.setBackground(Color.WHITE);
                        c.setForeground(Color.BLACK);
                    }
                } else if (column == 3) {
                    String estado = (String) value;
                    if ("Completada".equals(estado)) {
                        c.setBackground(Color.GREEN);
                        c.setForeground(Color.BLACK);
                    } else if ("En Progreso".equals(estado)) {
                        c.setBackground(Color.YELLOW);
                        c.setForeground(Color.BLACK);
                    } else if ("Por Hacer".equals(estado)) {
                        c.setBackground(Color.RED);
                        c.setForeground(Color.WHITE);
                    } else {
                        c.setBackground(Color.WHITE);
                        c.setForeground(Color.BLACK);
                    }
                } else {
                    c.setBackground(Color.WHITE);
                    c.setForeground(Color.BLACK);
                }

                if (isSelected) {
                    c.setBackground(table.getSelectionBackground());
                    c.setForeground(table.getSelectionForeground());
                }

                return c;
            }
        });
    }

    private void configurarFiltros() {
        // No volvemos a declarar prioridad ni estado, solo las configuramos
        prioridad.addActionListener(e -> aplicarFiltros());
        estado.addActionListener(e -> aplicarFiltros());
    }

    private void aplicarFiltros() {
        String estadoSeleccionado = (String) estado.getSelectedItem();
        String prioridadSeleccionada = (String) prioridad.getSelectedItem();

        DefaultTableModel modelo = (DefaultTableModel) tablaTareas.getModel();
        modelo.setRowCount(0); // Limpiar tabla

        for (Object[] tarea : todasLasTareas) {
            String estadoTarea = (String) tarea[3];
            String prioridadTarea = (String) tarea[2];

            if ((estadoSeleccionado.equals("Todos") || estadoTarea.equals(estadoSeleccionado)) &&
                (prioridadSeleccionada.equals("Todos") || prioridadTarea.equals(prioridadSeleccionada))) {
                modelo.addRow(tarea);
            }
        }
    }

    private void configurarColumnas() {
        // Ajustar el ancho de las columnas
        TableColumn nombreColumna = tablaTareas.getColumnModel().getColumn(0);
        nombreColumna.setPreferredWidth(200); // Hacer columna Nombre más ancha

        TableColumn descripcionColumna = tablaTareas.getColumnModel().getColumn(1);
        descripcionColumna.setPreferredWidth(300); // Ajustar ancho de la columna Descripción

        TableColumn prioridadColumna = tablaTareas.getColumnModel().getColumn(2);
        prioridadColumna.setPreferredWidth(150); // Hacer columna Prioridad más ancha

        TableColumn estadoColumna = tablaTareas.getColumnModel().getColumn(3);
        estadoColumna.setPreferredWidth(150); // Hacer columna Estado más ancha

        TableColumn usuarioColumna = tablaTareas.getColumnModel().getColumn(4);
        usuarioColumna.setPreferredWidth(150); // Hacer columna Usuario más ancha

        TableColumn fechaInicioColumna = tablaTareas.getColumnModel().getColumn(5);
        fechaInicioColumna.setPreferredWidth(120); // Hacer columna Fecha Inicio más ancha

        TableColumn fechaFinColumna = tablaTareas.getColumnModel().getColumn(6);
        fechaFinColumna.setPreferredWidth(120); // Hacer columna Fecha Fin más ancha

        // Ajustar alto de las filas
        tablaTareas.setRowHeight(40); // Establecer un alto mayor para las filas
    }




    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        crearTarea = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTareas = new javax.swing.JTable();
        prioridad = new javax.swing.JComboBox<>();
        estado = new javax.swing.JComboBox<>();
        crearTarea1 = new javax.swing.JLabel();
        crearTarea2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 236, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 330));
        jPanel1.setLayout(null);

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

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("O");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(680, 20, 20, 20);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("O");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(660, 20, 20, 20);

        crearTarea.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        crearTarea.setForeground(new java.awt.Color(0, 153, 153));
        crearTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearTarea.setText("Estado");
        jPanel1.add(crearTarea);
        crearTarea.setBounds(290, 430, 80, 20);

        imagen1.setText("imagen1");
        imagen1.setRuta("/resources/listar.png");
        jPanel1.add(imagen1);
        imagen1.setBounds(0, 0, 70, 70);

        tablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tablaTareas.setRowHeight(30);
        tablaTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaTareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tablaTareasMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(tablaTareas);
        if (tablaTareas.getColumnModel().getColumnCount() > 0) {
            tablaTareas.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tablaTareas.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaTareas.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tablaTareas.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tablaTareas.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            tablaTareas.getColumnModel().getColumn(4).setHeaderValue("Title 5");
            tablaTareas.getColumnModel().getColumn(5).setHeaderValue("Title 6");
            tablaTareas.getColumnModel().getColumn(6).setHeaderValue("Title 7");
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 80, 680, 330);

        prioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Alta", "Media", "Baja" }));
        prioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadActionPerformed(evt);
            }
        });
        jPanel1.add(prioridad);
        prioridad.setBounds(150, 430, 72, 22);

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Completada", "En Progreso", "Por Hacer", " ", " " }));
        jPanel1.add(estado);
        estado.setBounds(370, 430, 100, 22);

        crearTarea1.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        crearTarea1.setForeground(new java.awt.Color(0, 153, 153));
        crearTarea1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearTarea1.setText("LISTA DE TAREAS");
        jPanel1.add(crearTarea1);
        crearTarea1.setBounds(170, 20, 420, 50);

        crearTarea2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        crearTarea2.setForeground(new java.awt.Color(0, 153, 153));
        crearTarea2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearTarea2.setText("Prioridad");
        jPanel1.add(crearTarea2);
        crearTarea2.setBounds(60, 430, 80, 20);

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Crear Tarea");
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
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(570, 420, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
         Menu menu=new Menu();
      menu.setVisible(true);
      dispose();
    }//GEN-LAST:event_lblCierreMouseClicked

    private void tablaTareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTareasMouseEntered
    Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
    tablaTareas.setBorder(borde);
    }//GEN-LAST:event_tablaTareasMouseEntered

    private void tablaTareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTareasMouseExited
    tablaTareas.setBorder(null);
    }//GEN-LAST:event_tablaTareasMouseExited

    private void prioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioridadActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
        jLabel4.setBorder(borde);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setBorder(null);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        CrearTarea crearTarea=new CrearTarea();
       crearTarea.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabel4MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel crearTarea;
    private javax.swing.JLabel crearTarea1;
    private javax.swing.JLabel crearTarea2;
    private javax.swing.JComboBox<String> estado;
    private modelo.Imagen imagen1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JComboBox<String> prioridad;
    private javax.swing.JTable tablaTareas;
    // End of variables declaration//GEN-END:variables
}
