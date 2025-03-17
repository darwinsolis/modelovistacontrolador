package modelo.fizzbuzz.vista.CONTROLADOR;

import modelo.fizzbuzz.ModeloFizzBuzz;
import java.util.Scanner;
import modelo.fizzbuzz.vista.VistaJuego;

public class ControladorJuego {

    private ModeloFizzBuzz modeloFizzBuzz;  
    private VistaJuego vista;
    private Scanner scanner;

    public ControladorJuego() {
        this.modeloFizzBuzz = new ModeloFizzBuzz();
        this.vista = new VistaJuego();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        do {
            vista.mostrarMenu();
            System.out.print("Introduce una opcion (1-3): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                
                    String[] resultados = modeloFizzBuzz.jugarFizzBuzz();
                    vista.mostrarResultados(resultados); 
                    break;
                case 2:
                    vista.mostrarMensaje("Vamos a resolver otro ejercicio...");
                    break;
                case 3:
                    vista.mostrarMensaje("Gracias por usar el solucionador.... !!!!Hasta pronto!!!!");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, elige entre 1 y 3.");
                    break;
            }
        } while (opcion != 3);
    }
}
