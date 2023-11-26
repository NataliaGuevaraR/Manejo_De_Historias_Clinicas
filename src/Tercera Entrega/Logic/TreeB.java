
package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TreeB {
    private TreeNode raiz;
    private static final String RUTA = "C:\\Users\\rodri\\Documents\\NetBeansProjects\\Login Historias Clinicas\\src\\Txt";
    
    public TreeB() {
        this.raiz = null;
    }

    public void insertarEnfermedad(Enfermedad enfermedad) {
        raiz = insertarRecursivo(raiz, enfermedad);
    }

    private TreeNode insertarRecursivo(TreeNode nodo, Enfermedad enfermedad) {
        if (nodo == null) {
            return new TreeNode(enfermedad);
        }

        // Insertar en el subárbol izquierdo si el nombre es menor
        if (enfermedad.nombre.compareTo(nodo.enfermedad.nombre) < 0) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, enfermedad);
        }
        // Insertar en el subárbol derecho si el nombre es mayor
        else if (enfermedad.nombre.compareTo(nodo.enfermedad.nombre) > 0) {
            nodo.derecha = insertarRecursivo(nodo.derecha, enfermedad);
        }

        return nodo;
    }

    public Enfermedad buscarEnfermedadPorSintomas(String[] sintomas) {
        return buscarPorSintomasRecursivo(raiz, sintomas);
    }   

    private boolean tieneSintomas(Enfermedad enfermedad, String[] sintomas) {
 // Verifica si la enfermedad contiene todos los síntomas proporcionados
    for (String sintoma : sintomas) {
        boolean encontrado = false;
        for (String sintomaEnfermedad : enfermedad.sintomas) {
            if (sintomaEnfermedad.equalsIgnoreCase(sintoma)) {
                encontrado = true;
                break;
            }
        }
        // Si no se encuentra un síntoma, la enfermedad no coincide
        if (!encontrado) {
            return false;
        }
    }
    return true;
    }

    private Enfermedad buscarPorSintomasRecursivo(TreeNode nodo, String[] sintomas) {
        if (nodo == null) {
            return null;
        }

        if (tieneSintomas(nodo.enfermedad, sintomas)) {
            // Si los síntomas coinciden, devuelve la enfermedad
            return nodo.enfermedad; 
        } else {
            // Si no hay coincidencia, busca en los subárboles
            Enfermedad izquierda = buscarPorSintomasRecursivo(nodo.izquierda, sintomas);
            Enfermedad derecha = buscarPorSintomasRecursivo(nodo.derecha, sintomas);

            // Devuelve la enfermedad si se encuentra en alguno de los subárboles
            return (izquierda != null) ? izquierda : derecha;
        }
    }
    
    public void balancearArbol() {
        if (raiz != null) {
            raiz = balancearArbolRecursivo(raiz);
        }
    }

    // Método recursivo para balancear el árbol
    private TreeNode balancearArbolRecursivo(TreeNode nodo) {
        // Realiza un recorrido en postorden para balancear desde las hojas hacia la raíz
        if (nodo != null) {
            nodo.izquierda = balancearArbolRecursivo(nodo.izquierda);
            nodo.derecha = balancearArbolRecursivo(nodo.derecha);
            int factorEquilibrio = obtenerFactorEquilibrio(nodo);

            // Verifica y realiza las rotaciones necesarias para balancear el nodo
            if (factorEquilibrio > 1) {
                if (obtenerFactorEquilibrio(nodo.izquierda) >= 0) {
                    nodo = rotacionDerecha(nodo);
                } else {
                    nodo = rotacionDobleIzquierdaDerecha(nodo);
                }
            } else if (factorEquilibrio < -1) {
                if (obtenerFactorEquilibrio(nodo.derecha) <= 0) {
                    nodo = rotacionIzquierda(nodo);
                } else {
                    nodo = rotacionDobleDerechaIzquierda(nodo);
                }
            }
        }
        return nodo;
    }

    private TreeNode rotacionIzquierda(TreeNode nodo) {
    TreeNode nuevoNodo = nodo.derecha;
    nodo.derecha = nuevoNodo.izquierda;
    nuevoNodo.izquierda = nodo;
    return nuevoNodo;
}

    private TreeNode rotacionDerecha(TreeNode nodo) {
    TreeNode nuevoNodo = nodo.izquierda;
    nodo.izquierda = nuevoNodo.derecha;
    nuevoNodo.derecha = nodo;
    return nuevoNodo;
}
    private TreeNode rotacionDobleIzquierdaDerecha(TreeNode nodo) {
    nodo.izquierda = rotacionIzquierda(nodo.izquierda);
    return rotacionDerecha(nodo);
}

    private TreeNode rotacionDobleDerechaIzquierda(TreeNode nodo) {
    nodo.derecha = rotacionDerecha(nodo.derecha);
    return rotacionIzquierda(nodo);
}


    // Método para obtener el factor de equilibrio de un nodo
    private int obtenerFactorEquilibrio(TreeNode nodo) {
        if (nodo == null) {
            return 0;
        }
        return altura(nodo.izquierda) - altura(nodo.derecha);
    }

    // Método para obtener la altura de un nodo
    private int altura(TreeNode nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + Math.max(altura(nodo.izquierda), altura(nodo.derecha));
    }

    public Enfermedad buscarEnfermedadPorNombre(String nombre) {
        return buscarPorNombreRecursivo(raiz, nombre);
    }

    private Enfermedad buscarPorNombreRecursivo(TreeNode nodo, String nombre) {
        if (nodo == null) {
            return null;
        }

        // Comparar el nombre de la enfermedad en el nodo actual con el nombre buscado
        int comparacion = nombre.compareToIgnoreCase(nodo.enfermedad.getNombre());

        if (comparacion == 0) {
            return nodo.enfermedad; // Encontrado
        } else if (comparacion < 0) {
            return buscarPorNombreRecursivo(nodo.izquierda, nombre); // Buscar en el subárbol izquierdo
        } else {
            return buscarPorNombreRecursivo(nodo.derecha, nombre); // Buscar en el subárbol derecho
        }
    }
    
    public void guardarArbolEnArchivo(String nombreArchivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(RUTA + "\\Enfermedades.txt"))) {
            guardarPreorden(writer, raiz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

// Método auxiliar para guardar en preorden
    private void guardarPreorden(PrintWriter writer, TreeNode nodo) {
        if (nodo == null) {
            writer.println("NULL"); // Escribir NULL si el nodo es nulo
            return;
        }

        // Escribir la información del nodo (enfermedad) al archivo
        writer.println(nodo.enfermedad.nombre);
        // Aquí puedes escribir más información sobre la enfermedad si lo necesitas

        // Llamar recursivamente a los subárboles izquierdo y derecho
        guardarPreorden(writer, nodo.izquierda);
        guardarPreorden(writer, nodo.derecha);
    }
  /*  public void reconstruirArbolDesdeArchivo(String nombreArchivo) {
        try (Scanner scanner = new Scanner(new File(RUTA + "\\Enfermedades.txt"))) {
            raiz = reconstruirDesdePreorden(scanner);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Método auxiliar para reconstruir desde preorden
    private TreeNode reconstruirDesdePreorden(Scanner scanner) {
        if (!scanner.hasNextLine()) {
            return null;
        }

        String linea = scanner.nextLine().trim();
        if (linea.equals("NULL")) {
            return null;
        }

        Enfermedad enfermedad = new Enfermedad(linea);

        TreeNode nodo = new TreeNode(enfermedad);
        nodo.izquierda = reconstruirDesdePreorden(scanner);
        nodo.derecha = reconstruirDesdePreorden(scanner);

        return nodo;
    }*/
}
