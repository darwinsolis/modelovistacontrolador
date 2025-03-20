package modelotienda;

import java.time.LocalTime;

public class Cliente extends Persona {
    private boolean tieneMembresia;

    public Cliente(String nombre, boolean tieneMembresia) {
        super(nombre, false);  
        this.tieneMembresia = tieneMembresia;
    }

    public boolean tieneMembresia() {
        return tieneMembresia;
    }

    public boolean puedeAcceder() {
       
        if (!tieneMembresia) {
            return true;
        }

        
        LocalTime horaActual = LocalTime.now();
        LocalTime HORA_APERTURA = LocalTime.of(9, 0); 
        LocalTime HORA_CIERRE = LocalTime.of(18, 0);  

        return horaActual.isAfter(HORA_APERTURA) && horaActual.isBefore(HORA_CIERRE);
    }
}
