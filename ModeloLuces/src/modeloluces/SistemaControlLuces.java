package modeloluces;

import java.util.Random;

public class SistemaControlLuces {
    private SensorMovimiento sensorMovimiento;
    private ControlLuces[] luces;
    private boolean esDeNoche;

    public SistemaControlLuces(int cantidadLuces) {
        sensorMovimiento = new SensorMovimiento();
        luces = new ControlLuces[cantidadLuces];
        for (int i = 0; i < cantidadLuces; i++) {
            luces[i] = new ControlLuces();  
        }
        esDeNoche = true; 
    }

    public void establecerHorario(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public void verificarLuces() {
        boolean hayMovimiento = sensorMovimiento.detectarMovimiento();

        for (ControlLuces luz : luces) {
            if (esDeNoche && hayMovimiento) {
                luz.encenderLuces();
            } else {
                luz.apagarLuces();
            }
        }
    }

    public boolean esDeNoche() {
        return esDeNoche;
    }

    public boolean hayMovimiento() {
        return sensorMovimiento.detectarMovimiento();
    }

    public boolean[] obtenerEstadoLuces() {
        boolean[] estados = new boolean[luces.length];
        for (int i = 0; i < luces.length; i++) {
            estados[i] = luces[i].obtenerEstadoLuces();
        }
        return estados;
    }
}

class ControlLuces {
    private boolean lucesEncendidas;

    public ControlLuces() {
        lucesEncendidas = false; 
    }

    public void encenderLuces() {
        lucesEncendidas = true;
    }

    public void apagarLuces() {
        lucesEncendidas = false;
    }

    public boolean obtenerEstadoLuces() {
        return lucesEncendidas;
    }
}

class SensorMovimiento {
    public boolean detectarMovimiento() {
        return Math.random() > 0.5; 
    }
}
