
package modeloluces.Vista.controlador;

import java.util.Scanner;
import modeloluces.SistemaControlLuces;
import modeloluces.Vista.VistaControlLuces;

public class Controlador {
    private SistemaControlLuces modelo;
    private VistaControlLuces vista;

    public Controlador(SistemaControlLuces modelo, VistaControlLuces vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            vista.mostrarMenu();
            System.out.print("Elige una opcion (1-3): ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.print("Es de noche? (Si/No): ");
                    String entrada = scanner.nextLine();
                    boolean esDeNoche = entrada.equalsIgnoreCase("Si");
                    modelo.establecerHorario(esDeNoche);
                    break;
                case 2:
                    modelo.verificarLuces();
                    vista.mostrarEstadoLuces(modelo.esDeNoche(), modelo.hayMovimiento(), modelo.obtenerEstadoLuces());
                    break;
                case 3:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, elige entre 1 y 3.");
            }
        } while (opcion != 3);
    }
}

