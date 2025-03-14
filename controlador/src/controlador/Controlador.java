package controlador;

import java.util.Scanner;

public class Controlador {

    private ModeloSala sala;
    private ModeloPersona persona1;
    private ModeloPersona persona2;
    private VistaCine cine;
    private Scanner scanner;

    public Controlador() {
        this.sala = new ModeloSala(6); 
        this.persona1 = new ModeloPersona("Juan Pablo");
        this.persona2 = new ModeloPersona("Anasofia");
        this.cine = new VistaCine();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Bienvenido a tus ejercicios.");
            System.out.println("Selecciona una opcion para resolver un ejercicio:");
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
                    System.out.println("Opcion no valida. Por favor, elige entre 1 y 3.");
                    break;
            }
        } while (opcion != 3);
    }

    public void resolverEjercicioReservas() {
        cine.mostrarEstado(sala);  

        while (sala.getReservasRealizadas() < sala.getCapacidad()) {
            System.out.print("Ingresa el numero de asiento para reservar (1-" + sala.getCapacidad() + "): ");
            int numeroAsiento = scanner.nextInt();

            if (numeroAsiento >= 1 && numeroAsiento <= sala.getCapacidad()) {
             
                if (sala.getReservasRealizadas() % 2 == 0) {
                    persona1.hacerReserva(sala, numeroAsiento);  
                } else {
                    persona2.hacerReserva(sala, numeroAsiento);  
                }
            } else {
                System.out.println("Número de asiento inválido. Por favor ingresa un número entre 1 y " + sala.getCapacidad());
            }

            cine.mostrarEstado(sala);  
        }

        System.out.println("\n¡La sala está llena! No se pueden realizar más reservas.");
    }

}
