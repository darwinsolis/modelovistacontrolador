
package modeloaire.controlador.Vista.Principal;

import java.util.Scanner;
import modeloaire.AireAcondicionado;
import modeloaire.Humedad;
import modeloaire.Sensor;
import modeloaire.Temperatura;
import modeloaire.controlador.Controlador;
import modeloaire.controlador.Vista.Vista;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear sensores
        Sensor[] sensoresTemperatura = {new Sensor(25), new Sensor(30)};
        Sensor[] sensoresHumedad = {new Sensor(50), new Sensor(55)};

        AireAcondicionado aireAcondicionado = new AireAcondicionado();
        Temperatura temperatura = new Temperatura(sensoresTemperatura);
        Humedad humedad = new Humedad(sensoresHumedad);

        
        Controlador controlador = new Controlador(temperatura, humedad, aireAcondicionado);
        Vista vista = new Vista();

        while (true) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    double temp = vista.solicitarTemperatura();
                    double hum = vista.solicitarHumedad();
               
                    sensoresTemperatura[0] = new Sensor(temp);
                    sensoresHumedad[0] = new Sensor(hum);
                    break;

                case 2:
                    controlador.verificarEstado();
                    controlador.mostrarEstado();
                    break;

                case 3:
                    vista.mostrarMensaje("Saliendo del programa...");
                    return;

                default:
                    vista.mostrarMensaje("Opcion no valida, intente de nuevo.");
            }
        }
    }
}
