package modelo;

public class ModeloSala {
    private Asiento[] asientos;
    private int capacidad;
    private int reservasRealizadas;

    public ModeloSala(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new Asiento[capacidad];
        for (int i = 0; i < capacidad; i++) {
            this.asientos[i] = new Asiento(i + 1); 
        }
        this.reservasRealizadas = 0; 
    }

    public void mostrarAsientos() {
        for (Asiento asiento : asientos) {
            String estado = asiento.isDisponible() ? "Disponible" : "Ocupado";
            System.out.println("Asiento " + asiento.getNumero() + ": " + estado);
        }
    }

    public boolean reservarAsiento(int numeroAsiento) {
        if (numeroAsiento >= 1 && numeroAsiento <= capacidad) {
            Asiento asiento = asientos[numeroAsiento - 1];
            if (asiento.isDisponible()) {
                asiento.reservar();
                reservasRealizadas++;
                System.out.println("Asiento " + numeroAsiento + " reservado.");
                return true;
            } else {
                System.out.println("Asiento " + numeroAsiento + " ya esta ocupado.");
                return false;
            }
        } else {
            System.out.println("Numero de asiento invalido.");
            return false;
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getReservasRealizadas() {
        return reservasRealizadas;
    }
}
