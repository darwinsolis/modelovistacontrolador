
package modeloo.Vista.controlador;

import java.util.Scanner;
import modeloo.Invernadero;
import modeloo.SensorTemperatura;
import modeloo.Vista.Vista;

public class Controlador {

    private Invernadero invernadero;
    private SensorTemperatura sensor;
    private Vista vista;
    private Scanner scanner;

    public Controlador() {
        this.invernadero = new Invernadero();
        this.sensor = new SensorTemperatura();
        this.vista = new Vista();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        vista.mostrarMenu();
        opcion = scanner.nextInt();

        if (opcion == 1) {
            controlarTemperatura();
        } else if (opcion == 2) {
            vista.mostrarMensaje("Gracias por usar el sistema de control de temperatura.");
        } else {
            vista.mostrarMensaje("Opcion no valida.");
        }
    }

    
    public void controlarTemperatura() {
    double[] temperaturas = new double[5]; 
    for (int i = 0; i < 5; i++) {
        temperaturas[i] = sensor.leerTemperatura();
        vista.mostrarTemperatura(temperaturas[i]);

        if (temperaturas[i] < 10) {
            invernadero.activarCalefactor();
        } else if (temperaturas[i] > 25) {
            invernadero.activarVentilador();
        } else {
            invernadero.desactivar();
        }

        invernadero.mostrarEstado();
       }
   }
}

        
    

