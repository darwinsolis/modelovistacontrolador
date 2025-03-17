package modeloluces.Vista;

public class VistaControlLuces {

    public void mostrarMenu() {
        System.out.println("\nSistema de Control de Luces Automatico");
        System.out.println("1. Establecer si es de noche (activar / desactivar)");
        System.out.println("2. Simular control de luces");
        System.out.println("3. Salir");
    }

    public void mostrarEstadoLuces(boolean esDeNoche, boolean hayMovimiento, boolean[] lucesEncendidas) {
        System.out.println("Es de noche: " + (esDeNoche ? "SI" : "No"));
        System.out.println("Movimiento detectado: " + (hayMovimiento ? "Sí" : "No"));
        
        
        for (int i = 0; i < lucesEncendidas.length; i++) {
            System.out.println("Estado de la luz " + (i + 1) + ": " + (lucesEncendidas[i] ? "ENCENDIDAAA" : "APAGADAAA"));
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerEntrada() {
        return System.console().readLine(); 
    }
}
