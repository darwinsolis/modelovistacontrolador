
package modelocalculadora.Vista;


public class VistaCalculadora {

    
    public void mostrarMenu() {
        System.out.println("Bienvenido a la Calculadora Simple");
        System.out.println("Elige una operacion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Mostrar resultados anteriores");
        System.out.println("6. Salir");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarResultados(String[] resultados) {
        System.out.println("\nResultados anteriores:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
