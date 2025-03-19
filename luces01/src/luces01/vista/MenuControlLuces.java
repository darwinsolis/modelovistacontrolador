package luces01.vista;

import java.util.Scanner;
import luces01.vista.controlador.Controlador;

public class MenuControlLuces {

    private Scanner scanner;
    private Controlador controlador;

    public MenuControlLuces() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nSistema de Control de Luces Automático");
            System.out.println("1. Establecer si es de noche (activar / desactivar)");
            System.out.println("2. Simular control de luces");
            System.out.println("3. Encender todas las luces");
            System.out.println("4. Apagar todas las luces");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Es de noche? (Sí/No): ");
                    String entrada = scanner.next();
                    boolean esDeNoche = entrada.equalsIgnoreCase("Sí");
                    controlador.establecerHorario(esDeNoche);
                    break;
                case 2:
                    controlador.verificarLuces();
                    break;
                case 3:
                    controlador.encenderTodasLasLuces();
                    break;
                case 4:
                    controlador.apagarTodasLasLuces();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige entre 1 y 5.");
            }
        } while (opcion != 5);
        scanner.close();
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
}
