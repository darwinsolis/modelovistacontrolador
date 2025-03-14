package controlador;

public class Asiento {
    private int numero;
    private boolean disponible;

    public Asiento(int numero) {
        this.numero = numero;
        this.disponible = true;  
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void reservar() {
        this.disponible = false;  
    }
}
