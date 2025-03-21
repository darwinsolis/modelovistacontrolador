
package modeloaire.controlador.Vista;

package aireacondicionado;

import java.util.Scanner;

public class Vista {

    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Menú ===");
        System.out.println("1. Ingresar valores manualmente (temperatura y humedad)");
        System.out.println("2. Verificar estado del aire acondicionado");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public double solicitarTemperatura() {
        System.out.print("Ingrese la temperatura (°C): ");
        return scanner.nextDouble();
    }

    public double solicitarHumedad() {
        System.out.print("Ingrese la humedad (%): ");
        return scanner.nextDouble();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
