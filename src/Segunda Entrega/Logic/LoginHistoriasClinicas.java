
package Logic;

import Interfaz.Login;

public class LoginHistoriasClinicas {

    public static void main(String[] args) {
        
        AdministrarCitas.cargarCitas();
        logica.cargarUsuarios();
        
        Login log = new Login();
        log.setVisible(true);
    }
    
}
