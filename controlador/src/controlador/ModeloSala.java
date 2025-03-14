package controlador;

public class ModeloSala {
    private int capacidad;
    private Asiento[] asientos;
    private int reservasRealizadas;

    public ModeloSala(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new Asiento[capacidad];
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new Asiento(i + 1);  
        }
        this.reservasRealizadas = 0;
    }

    public void mostrarAsientos() {
        for (Asiento asiento : asientos) {
            String estado = asiento.isDisponible() ? "Disponible" : "Ocupado";
            System.out.println("Asiento " + asiento.getNumero() + ": " + estado);
        }
    }

    public boolean reservarAsiento(int numeroAsiento, ModeloPersona persona) {
        if (numeroAsiento < 1 || numeroAsiento > capacidad) {
            System.out.println("Numero de asiento invalido.");
            return false;
        } else {
            Asiento asiento = asientos[numeroAsiento - 1];
            if (asiento.isDisponible()) {
                asiento.reservar();
                reservasRealizadas++;
                System.out.println(persona.getNombre() + " ha reservado el asiento " + numeroAsiento + ".");
                return true;
            } else {
                System.out.println("El asiento " + numeroAsiento + " ya esta ocupado.");
                return false;
            }
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getReservasRealizadas() {
        return reservasRealizadas;
    }
}
