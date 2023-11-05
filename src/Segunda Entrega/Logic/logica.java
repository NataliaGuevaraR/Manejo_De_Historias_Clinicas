
package Logic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Logic.Usuario;
import java.util.HashMap;
import java.util.Map;


public class logica {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static final String RUTA = "C:\\Users\\rodri\\Documents\\NetBeansProjects\\Login Historias Clinicas\\src\\Txt";
     
    public void main(String[] args) {
        cargarUsuarios();
    }

    public static List<Usuario> cargarUsuarios() {
    cargarUsuariosFromTxt(usuarios, "Administrador.txt");
    cargarUsuariosFromTxt(usuarios, "Doctor.txt");
    cargarUsuariosFromTxt(usuarios, "Paciente.txt");
    return usuarios;
}
    private static void cargarUsuariosFromTxt(List<Usuario> usuarios, String nombreArchivo) {
  
    try {
        BufferedReader reader = new BufferedReader(new FileReader(RUTA + "\\" + nombreArchivo));
        String linea;

        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(",");
            String nombre = partes[0];
            String contrasena = partes[1];
            String rol = partes[2];
            usuarios.add(new Usuario(nombre, contrasena, rol));
        }

        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
   public static void guardarUsuariosEnArchivo() {
        // Crear un mapa para organizar usuarios por rol
        Map<String, List<Usuario>> usuariosPorRol = new HashMap<>();

        // Iterar a través de la lista de usuarios y organizarlos por rol
        for (Usuario usuario : usuarios) {
            String rol = usuario.getRol();
            List<Usuario> usuariosDeRol = usuariosPorRol.get(rol);

            // Si la lista de usuarios de este rol no existe, créala
            if (usuariosDeRol == null) {
                usuariosDeRol = new ArrayList<>();
                usuariosPorRol.put(rol, usuariosDeRol);
            }

            // Agregar el usuario a la lista correspondiente
            usuariosDeRol.add(usuario);
        }

        // Iterar a través del mapa y guardar usuarios en archivos separados
        for (Map.Entry<String, List<Usuario>> entry : usuariosPorRol.entrySet()) {
            String rol = entry.getKey();
            String nombreArchivo = rol + ".txt";
            List<Usuario> usuariosDeRol = entry.getValue();

            // Guardar los usuarios de este rol en el archivo correspondiente
            guardarUsuariosEnArchivoE(nombreArchivo, usuariosDeRol);
        }
    }

    private static void guardarUsuariosEnArchivoE(String nombreArchivo, List<Usuario> usuarios) {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA + "\\" + nombreArchivo))) {
            for (Usuario usuario : usuarios) {
                writer.write(usuario.getNombre() + "," + usuario.getContrasena() + "," + usuario.getRol() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void crearUsuario(String nombre, String contrasena, String rol) {
        
        usuarios.add(new Usuario(nombre, contrasena, rol));

        guardarUsuariosEnArchivo();
    }
    
    public static Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                return usuario; 
            }
        }
        return null; 
    }
    
    public static Usuario buscarContraseña(String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getContrasena().equals(contraseña)) {
                return usuario; 
            }
        }
        return null; 
    }
    
    public static void eliminarUsuario(Usuario usuarioEncontrado) {
            usuarios.remove(usuarioEncontrado);
            guardarUsuariosEnArchivo();
    }
    
    public static List<Usuario> getUsuarios() {
    return usuarios;
    }

}