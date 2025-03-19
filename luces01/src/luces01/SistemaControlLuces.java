    package luces01;

public class SistemaControlLuces {

    private SensorMovimiento sensorMovimiento;
    private ControlLuces controlLuces;
    private boolean esDeNoche;

    public SistemaControlLuces() {
        sensorMovimiento = new SensorMovimiento();
        controlLuces = new ControlLuces();
        esDeNoche = true;
    }

    public void establecerHorario(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public void verificarLuces() {
        boolean hayMovimiento = sensorMovimiento.detectarMovimiento();

        if (esDeNoche && hayMovimiento) {
            controlLuces.encenderLuces();
        } else {
            controlLuces.apagarLuces();
        }

        System.out.println("Es de noche: " + (esDeNoche ? "Sí" : "No"));
        System.out.println("Movimiento detectado: " + (hayMovimiento ? "Sí" : "No"));
        System.out.println("Estado de las luces: " + (controlLuces.obtenerEstadoLuces() ? "ENCENDIDAS" : "APAGADAS"));
    }
}
