package luces01;

public class ControlLuces {

    private boolean lucesEncendidas;

    public ControlLuces() {
        lucesEncendidas = false;
    }

    public void encenderLuces() {
        lucesEncendidas = true;
        System.out.println("Las luces están ENCENDIDAS.");
    }

    public void apagarLuces() {
        lucesEncendidas = false;
        System.out.println("Las luces están APAGADAS.");
    }

    public boolean obtenerEstadoLuces() {
        return lucesEncendidas;
    }

    // Métodos adicionales para manejar un array de luces
    public static void encenderTodasLasLuces(ControlLuces[] luces) {
        for (ControlLuces luz : luces) {
            luz.encenderLuces();
        }
    }

    public static void apagarTodasLasLuces(ControlLuces[] luces) {
        for (ControlLuces luz : luces) {
            luz.apagarLuces();
        }
    }
}
