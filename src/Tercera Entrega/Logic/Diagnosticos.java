
package Logic;

import java.util.HashMap;

public class Diagnosticos {
    private String codigo;
    private String nombre;
    private HashMap<String,String> diagnosticos;

    public Diagnosticos(String codigo, String nombre, HashMap<String, String> diagnosticos) {
        this.diagnosticos = new HashMap<>();
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    
    
}
