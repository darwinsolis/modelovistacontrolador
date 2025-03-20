
package modelotienda.vista;
package modelotienda.vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelotienda.Persona;

public class Vista {
    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- Menú de Control de Acceso ---");
        System.out.println("1. Ingresar Cliente");
        System.out.println("2. Ingresar Empleado");
        System.out.println("3. Mostrar todas las personas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public String obtenerNombre() {
        scanner.nextLine(); 
        System.out.print("Ingrese nombre: ");
        return scanner.nextLine();
    }

    public boolean obtenerMembresia() {
        System.out.print("¿Tiene membresía? (sí/no): ");
        String tieneMembresiaStr = scanner.nextLine().trim().toLowerCase();
        return tieneMembresiaStr.equals("sí");
    }

    public void mostrarAcceso(String nombre, boolean accesoPermitido) {
        if (accesoPermitido) {
            System.out.println("Acceso permitido a " + nombre);
        } else {
            System.out.println("Acceso denegado a " + nombre);
        }
    }

    public void mostrarPersonas(ArrayList<Persona> personas) {
        System.out.println("\n--- Lista de Personas Registradas ---");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + (persona.esEmpleado() ? "Empleado" : "Cliente"));
        }
    }

    public void cerrarScanner() {
        scanner.close();
    }
}

