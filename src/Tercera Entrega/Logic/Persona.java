
package Logic;

public class Persona {
    private String Nombre;
    private int Cedula;
    private int telefono;
    private String correo;
    private String dirección;
    private int Edad;
    private int altura;
    private int peso;

    public Persona(String Nombre, int Cedula, int telefono, String correo, String dirección, int Edad, int altura, int peso) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.dirección = dirección;
        this.Edad = Edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
