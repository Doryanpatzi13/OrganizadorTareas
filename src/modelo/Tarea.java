
package modelo;

import java.time.LocalDate;

public class Tarea {
    private String nombre;
    private String descripcion;
    private String prioridad;
    private String estado;
    private String usuario; // Usuario asignado a la tarea
    private LocalDate fechaInicio; // Fecha de inicio de la tarea
    private LocalDate fechaFin;    // Fecha de finalización de la tarea

    // Constructor actualizado para aceptar solo un usuario
    public Tarea(String nombre, String descripcion, String prioridad, String estado, String usuario, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Método toString actualizado
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Descripción: " + descripcion + "\n" +
               "Usuario: " + usuario + "\n" +
               "Estado: " + estado + "\n" +
               "Prioridad: " + prioridad + "\n" +
               "Fecha Inicio: " + (fechaInicio != null ? fechaInicio.toString() : "Sin asignar") + "\n" +
               "Fecha Fin: " + (fechaFin != null ? fechaFin.toString() : "Sin asignar") + "\n" +
               "---------------------------";
    }
}