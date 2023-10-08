
package Interfaz;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    private String nombre;
    private String contrasena;
    private String rol;

    public Usuario(String nombre, String contrasena, String rol) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


}

public class logica {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static final String RUTA_ARCHIVO = "C:\\Users\\rodri\\Documents\\NetBeansProjects\\Login Historias Clinicas\\src\\Interfaz\\archivo.txt";
    
    public static void main(String[] args) {
        // Cargar usuarios desde el archivo
        cargarUsuarios();

        // Resto del código...
    }

    // ... (resto del código)

    public static void cargarUsuarios() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO));
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
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO));
            writer.write("");
            for (Usuario usuario : usuarios) {
                writer.write(usuario.getNombre() + "," + usuario.getContrasena() + "," + usuario.getRol() + "\n");
            }
            writer.close();
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

}