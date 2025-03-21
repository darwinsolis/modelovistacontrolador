
package modeloaire;


public class Temperatura {
    private Sensor[] sensores;

    public Temperatura(Sensor[] sensores) {
        this.sensores = sensores;
    }

    public double obtenerTemperaturaPromedio() {
        double suma = 0;
        for (Sensor sensor : sensores) {
            suma += sensor.leer();
        }
        return suma / sensores.length;
    }
}
