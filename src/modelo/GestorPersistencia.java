
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GestorPersistencia {

    private String rutaArchivo;

    // Constructor que recibe la ruta del archivo
    public GestorPersistencia(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    // Método para guardar una tarea en el archivo
    public void guardarTarea(Tarea tarea) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            writer.write(tarea.toString());
            writer.newLine();
        }
    }
}