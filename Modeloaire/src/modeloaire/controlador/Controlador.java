package modeloaire.controlador;

import modeloaire.Temperatura;
import modeloaire.Humedad;
import modeloaire.AireAcondicionado;

public class Controlador {
    private Temperatura temperatura;
    private Humedad humedad;
    private AireAcondicionado aireAcondicionado;

    // Constructor de Controlador
    public Controlador(Temperatura temperatura, Humedad humedad, AireAcondicionado aireAcondicionado) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.aireAcondicionado = aireAcondicionado;
    }

    public void verificarEstado() {
        double temp = temperatura.obtenerTemperaturaPromedio();
        double hum = humedad.obtenerHumedadPromedio();

        if ((temp > 28 && hum > 60) || (temp > 30)) {
            aireAcondicionado.activar();
        } else {
            aireAcondicionado.desactivar();
        }
    }

    public void mostrarEstado() {
        System.out.println("Temperatura promedio: " + temperatura.obtenerTemperaturaPromedio() + "°C");
        System.out.println("Humedad promedio: " + humedad.obtenerHumedadPromedio() + "%");
        System.out.println("Aire Acondicionado: " + aireAcondicionado.obtenerEstado());
    }
}
