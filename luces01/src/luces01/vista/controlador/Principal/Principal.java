
package luces01.vista.controlador.Principal;

package luces01;

import luces01.vista.MenuControlLuces;
import luces01.vista.controlador.Controlador;

public class Principal {

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        MenuControlLuces menuControlLuces = new MenuControlLuces();
        menuControlLuces.setControlador(controlador);
        menuControlLuces.mostrarMenu();
    }
}
