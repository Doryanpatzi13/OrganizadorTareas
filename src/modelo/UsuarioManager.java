
package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioManager {
    private static final String ARCHIVO_USUARIOS = "usuarios.txt";

    // Guardar un nuevo usuario
    public void guardarUsuario(Usuario usuario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_USUARIOS, true))) {
            writer.write("Nombre: " + usuario.getNombre());
            writer.newLine();
            writer.write("Correo: " + usuario.getCorreo());
            writer.newLine();
            writer.write("Contraseña: " + usuario.getContrasena());
            writer.newLine(); // Añadimos un salto de línea entre usuarios
            writer.newLine(); // Separa los usuarios
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer todos los usuarios del archivo
    public static List<Usuario> leerUsuarios() throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        File archivo = new File(ARCHIVO_USUARIOS);

        if (archivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                StringBuilder usuarioData = new StringBuilder();

                while ((linea = reader.readLine()) != null) {
                    if (!linea.isEmpty()) {
                        usuarioData.append(linea).append(System.lineSeparator());
                    } else {
                        // Si encontramos una línea vacía, significa que un usuario ha terminado
                        if (usuarioData.length() > 0) {
                            usuarios.add(Usuario.fromString(usuarioData.toString().trim()));
                            usuarioData.setLength(0); // Reinicia el StringBuilder para el siguiente usuario
                        }
                    }
                }

                // Añadir el último usuario si no termina con línea vacía
                if (usuarioData.length() > 0) {
                    usuarios.add(Usuario.fromString(usuarioData.toString().trim()));
                }
            }
        }
        return usuarios;
    }

    // Buscar usuario por correo
    public static Usuario buscarUsuarioPorCorreo(String correo) throws IOException {
        List<Usuario> usuarios = leerUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equalsIgnoreCase(correo)) {
                return usuario;
            }
        }
        return null;
    }
}
