
package Logic;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import Logic.Doliente;
import java.util.Iterator;

public class AdministrarCitas {
    private static LinkedList<Doliente> lista = new LinkedList();
    private static final String RUTA_ARCHIVO = "C:\\Users\\rodri\\Documents\\NetBeansProjects\\Login Historias Clinicas\\src\\Txt\\Citas.txt";
    
    public static void main(String[] args) {
        cargarCitas();
    }

    public static void cargarCitas() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO));
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombre = partes[0];
                String cedula = partes[1];
                String especialidad = partes[2];
                lista.add(new Doliente(nombre, cedula, especialidad));
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarCitasEnArchivo() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO));
            writer.write("");
            for(Doliente doliente:lista) {
                writer.write(doliente.getNombre() + "," + doliente.getCedula() + "," + doliente.getEspecialidad() + "\n");
            }
        
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void crearCita(String nombre, String cedula, String especialidad) {
        
        lista.add(new Doliente(nombre, cedula, especialidad));
        guardarCitasEnArchivo();
        
    }
    
    public static void eliminarCita(String nombreUsuario) {
        Iterator<Doliente> iterador = lista.iterator();
    while (iterador.hasNext()) {
        Doliente objeto = iterador.next();
        if (objeto.getNombre().equals(nombreUsuario)) {
            iterador.remove();
            guardarCitasEnArchivo();
        }
    }
    }
    
    public static LinkedList<Doliente> getCitas() {
        return lista;
    }
}