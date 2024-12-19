
package modelo;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        // Formato actualizado para guardar el usuario
        return "Nombre: " + nombre + System.lineSeparator() +
               "Correo: " + correo + System.lineSeparator() +
               "Contraseña: " + contrasena;
    }

    public static Usuario fromString(String linea) {
        // Método para leer usuarios desde el formato actualizado
        String[] lineas = linea.split(System.lineSeparator());
        String nombre = lineas[0].substring(8); // Extrae después de "Nombre: "
        String correo = lineas[1].substring(8); // Extrae después de "Correo: "
        String contrasena = lineas[2].substring(12); // Extrae después de "Contraseña: "
        return new Usuario(nombre, correo, contrasena);
    }
}
