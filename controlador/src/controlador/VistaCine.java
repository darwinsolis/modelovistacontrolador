package controlador;

public class VistaCine {

    public void mostrarEstado(ModeloSala sala) {
        sala.mostrarAsientos();  
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje); 
    }
}
