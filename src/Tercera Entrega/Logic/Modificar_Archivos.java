
package Logic;
import static Logic.AdministrarCitas.guardarCitasEnArchivo;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import Logic.Doliente;
import java.util.Iterator;
import java.util.Map;

public class Modificar_Archivos<T extends Util> {
    private LinkedList<T> lista;
    private String RUTA_ARCHIVO;


    public Modificar_Archivos(String RUTA_ARCHIVO) {
        this.lista = new LinkedList();
        this.RUTA_ARCHIVO = RUTA_ARCHIVO;
    }

    public void cargarInformacion(String RUTA_ARCHIVO, String tipo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO));
            String linea;

            while ((linea = reader.readLine()) != null) {
                T objeto = parsearLinea(linea,tipo);
                lista.add(objeto);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private T parsearLinea(String linea,String tipo) {

        String[] partes = linea.split(",");
        switch (tipo) {
            case "Citas":
                String nombre = partes[0];
                String cedula = partes[1];
                String especialidad = partes[2];
                break;
            case "Administrador":
            case"Doctor":
            case "Paciente":
                String nombres = partes[0];
                String contrasena = partes[1];
                String rol = partes[2];
                break;
            default:
                break;
        }
        
        return null;
    }

    public void guardarEnArchivo(String RUTA_ARCHIVO) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            writer.write("");
            for (T objeto : lista) {
                String linea = ((Util) objeto).ConvertibleATexto();
                writer.write(linea + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearEntrada(String RUTA_ARCHIVO,T objeto) {
        lista.add(objeto);
        guardarEnArchivo(RUTA_ARCHIVO);
    }
    
    public T buscarRegistro(T entrada) {
        for (T valor : lista) {
            if (valor.equals(entrada)) {
                return valor; 
            }
        }
        return null; 
    }
    
    public void EliminarRegistro(T entrada) {
        for (T valor : lista) {
            if (valor.equals(entrada)) {
                lista.remove(valor); 
            }
        }
    }
     
    public LinkedList<T> getObjeto() {
        return lista;
    }
}