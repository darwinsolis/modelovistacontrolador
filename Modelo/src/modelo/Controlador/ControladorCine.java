package modelo.Controlador;

import modelo.ModeloSala;
import modelo.Vista.VistaCine;
import java.util.Scanner;

public class ControladorCine {
    
    private ModeloSala sala;
    private VistaCine vista;
    private Scanner scanner;

    public ControladorCine() {
        this.sala = new ModeloSala(6); 
        this.vista = new VistaCine();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        do {
            System.out.println("Bienvenido al cine.");
            System.out.println("Selecciona una opción para resolver un ejercicio:");
            System.out.println("1. Resolver ejercicio de reservas de asientos");
            System.out.println("2. Volver a hacer otro ejercicio");
            System.out.println("3. Salir");
            System.out.print("Introduce una opcion (1-3): ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    resolverEjercicioReservas();
                    break;
                case 2:
                    System.out.println("Vamos a resolver otro ejercicio...");
                    break;
                case 3:
                    System.out.println("Gracias por usar el solucionador.... !!!!Hasta pronto!!!!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige entre 1 y 6.");
                    break;
            }
        } while (opcion != 3);
    }

    public void resolverEjercicioReservas() {
        vista.mostrarEstado(sala);  
        
        while (sala.getReservasRealizadas() < sala.getCapacidad()) {
            System.out.print("Ingresa el numero de asiento para reservar (1-" + sala.getCapacidad() + "): ");
            int numeroAsiento = scanner.nextInt();

            if (numeroAsiento >= 1 && numeroAsiento <= sala.getCapacidad()) {
                if (sala.reservarAsiento(numeroAsiento)) {
                    vista.mostrarEstado(sala); 
                }
            } else {
                System.out.println("Número de asiento inválido. Por favor, ingrese un número entre 1 y 6 " + sala.getCapacidad());
            }
        }

        System.out.println("\nLa sala esta llena! No se pueden realizar mas reservas.");
    }
}
