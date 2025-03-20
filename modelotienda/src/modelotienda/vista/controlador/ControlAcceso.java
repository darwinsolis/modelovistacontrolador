
package modelotienda.vista.controlador;

package modelotienda.vista.controlador;

import modelotienda.Persona;

public class ControlAcceso {
    public boolean verificarAcceso(Persona persona) {
        return persona.puedeAcceder(); 
    }
}
