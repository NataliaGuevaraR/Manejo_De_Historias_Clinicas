
package Logic;

public class Enfermedad {
    String nombre;
    String[] sintomas;

    public Enfermedad(String nombre, String[] sintomas) {
        this.nombre = nombre;
        this.sintomas = sintomas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }   
}
