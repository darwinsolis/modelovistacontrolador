package luces01.vista.controlador;

import luces01.SistemaControlLuces;
import luces01.ControlLuces;

public class Controlador {

    private SistemaControlLuces sistemaControlLuces;
    private ControlLuces[] luces;

    public Controlador() {
        sistemaControlLuces = new SistemaControlLuces();
        luces = new ControlLuces[5]; 
        for (int i = 0; i < luces.length; i++) {
            luces[i] = new ControlLuces();
        }
    }

    public void establecerHorario(boolean esDeNoche) {
        sistemaControlLuces.establecerHorario(esDeNoche);
    }

    public void verificarLuces() {
        sistemaControlLuces.verificarLuces();
    }

    public void encenderTodasLasLuces() {
        ControlLuces.encenderTodasLasLuces(luces);
    }

    public void apagarTodasLasLuces() {
        ControlLuces.apagarTodasLasLuces(luces);
    }
}
