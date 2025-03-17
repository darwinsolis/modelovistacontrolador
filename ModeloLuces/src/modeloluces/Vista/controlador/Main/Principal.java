
package modeloluces.Vista.controlador.Main;

import modeloluces.SistemaControlLuces;
import modeloluces.Vista.VistaControlLuces;
import modeloluces.Vista.controlador.Controlador;

public class Principal {
    public static void main(String[] args) {
        int cantidadLuces = 5;  
        SistemaControlLuces modelo = new SistemaControlLuces(cantidadLuces);
        VistaControlLuces vista = new VistaControlLuces();
        Controlador controlador = new Controlador(modelo, vista);

        controlador.iniciar();
    }
}

