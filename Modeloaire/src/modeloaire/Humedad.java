
package modeloaire;


public class Humedad {
    private Sensor[] sensores;

    public Humedad(Sensor[] sensores) {
        this.sensores = sensores;
    }

    public double obtenerHumedadPromedio() {
        double suma = 0;
        for (Sensor sensor : sensores) {
            suma += sensor.leer();
        }
        return suma / sensores.length;
    }
}
