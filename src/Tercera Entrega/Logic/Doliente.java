
package Logic;

public class Doliente implements Util{
    private String nombre;
    private String cedula;
    private String especialidad;

    public Doliente(String nombre, String cedula, String especialidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String ConvertibleATexto() {
        return "doliente.getNombre()" + "," + "doliente.getCedula()" + "," + "doliente.getEspecialidad()";
    }

    @Override
    public String Atributos() {
        return "Nombre";
    }
}
