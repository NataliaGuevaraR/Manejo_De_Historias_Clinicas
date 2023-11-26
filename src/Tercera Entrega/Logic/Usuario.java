
package Logic;

public class Usuario implements Util {
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

    @Override
    public String ConvertibleATexto() {
        return "usuario.getNombre()" + "," + "usuario.getContrasena()" + "," + "usuario.getRol()";
    }

    @Override
    public String Atributos() {
        return "nombre, cedula, especialidad";
    }
}
