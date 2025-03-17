
package modeloo.Vista;

public class Vista {

    public void mostrarMenu() {
        System.out.println("Bienvenido al sistema de control de temperatura del Invernadero.");
        System.out.println("Presiona 1 para comenzar a controlar la temperatura.");
        System.out.println("Presiona 2 para salir.");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarTemperatura(double temperatura) {
        System.out.println("Temperatura actual: " + temperatura + "C");
    }

    public void preguntarRepetir() {
        System.out.println("¿Quieres ingresar otra temperatura? (si/no): ");
    }
}
