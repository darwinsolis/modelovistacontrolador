
package modelocalculadora.Vista.Controlador;

import java.util.Scanner;
import modelocalculadora.ModeloCalculadora;
import modelocalculadora.Vista.VistaCalculadora;

public class ControladorCalculadora {

    private ModeloCalculadora modelo;
    private VistaCalculadora vista;
    private Scanner scanner;

    public ControladorCalculadora() {
        this.modelo = new ModeloCalculadora();
        this.vista = new VistaCalculadora();
        this.scanner = new Scanner(System.in);
    }

    
    public void iniciar() {
        int opcion;

        do {
            vista.mostrarMenu();
            System.out.print("Introduce una opcion (1-6): ");
            opcion = scanner.nextInt();

            if (opcion == 6) {
                vista.mostrarMensaje("Gracias por usar la calculadora. ¡Hasta pronto!");
                break;
            }

            // Solicitar los números para las operaciones
            double num1 = 0, num2 = 0;
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = scanner.nextDouble();
            }

            // Variable para almacenar el resultado
            double resultado = 0;

            // Ejecutar la operación elegida
            switch (opcion) {
                case 1:
                    resultado = modelo.sumar(num1, num2);
                    vista.mostrarMensaje("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = modelo.restar(num1, num2);
                    vista.mostrarMensaje("Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado = modelo.multiplicar(num1, num2);
                    vista.mostrarMensaje("Resultado de la multiplicación: " + resultado);
                    break;
                case 4:
                    resultado = modelo.dividir(num1, num2);
                    if (!Double.isNaN(resultado)) {
                        vista.mostrarMensaje("Resultado de la división: " + resultado);
                    }
                    break;
                case 5:
                    String[] resultados = modelo.obtenerResultados();
                    vista.mostrarResultados(resultados);
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Por favor, elige entre 1 y 6.");
            }
        } while (opcion != 6);
    }
}
