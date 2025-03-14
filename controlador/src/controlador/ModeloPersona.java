package controlador;

public class ModeloPersona {

    private String nombre;

    public ModeloPersona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerReserva(ModeloSala sala, int numeroAsiento) {
        System.out.println(nombre + " intenta reservar el asiento " + numeroAsiento + ".");
        sala.reservarAsiento(numeroAsiento, this);  
    }

}
