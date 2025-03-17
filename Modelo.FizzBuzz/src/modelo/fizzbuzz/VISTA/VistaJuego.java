
package modelo.fizzbuzz.vista;


public class VistaJuego {

    public void mostrarMenu() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Jugar FizzBuzz");
        System.out.println("2. Resolver otro ejercicio");
        System.out.println("3. Salir");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Mostrar los resultados de FizzBuzz almacenados en un array
    public void mostrarResultados(String[] resultados) {
        System.out.println("\nResultados de FizzBuzz:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
