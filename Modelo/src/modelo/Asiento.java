package modelo;

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
        if (disponible) {
            disponible = false; 
        } else {
            throw new UnsupportedOperationException("Este asiento ya esta ocupado.");
        }
    }
}
