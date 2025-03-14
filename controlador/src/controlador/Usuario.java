
package controlador;


public abstract class Usuario {
    protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void hacerReserva(ModeloSala sala, int numeroAsiento);
}
