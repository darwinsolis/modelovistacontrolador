
package modelotienda.vista.controlador;

package modelotienda.vista.controlador;

import modelotienda.Cliente;
import modelotienda.Empleado;
import modelotienda.Persona;
import modelotienda.Sistema;
import modelotienda.vista.Vista;

public class Controlador {
    private final Vista vista; 
    private Sistema sistema;
    private ControlAcceso controlAcceso;

    public Controlador() {
        vista = new Vista(); 
        sistema = new Sistema();  
        controlAcceso = new ControlAcceso();  
    }

    public void iniciar() {
        while (true) {
            int opcion = vista.mostrarMenu();  
            switch (opcion) {
                case 1:
                    ingresarCliente();  
                    break;
                case 2:
                    ingresarEmpleado(); 
                    break;
                case 3:
                    mostrarPersonas();  
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    vista.cerrarScanner();  
                    return; 
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
    }

    private void ingresarCliente() {
        String nombreCliente = vista.obtenerNombre();  
        boolean tieneMembresia = vista.obtenerMembresia();  

        Cliente cliente = new Cliente(nombreCliente, tieneMembresia);  
        sistema.agregarPersona(cliente);  
        verificarAcceso(cliente); 
    }

    private void ingresarEmpleado() {
        String nombreEmpleado = vista.obtenerNombre();  

        Empleado empleado = new Empleado(nombreEmpleado); 
        sistema.agregarPersona(empleado); 
        verificarAcceso(empleado);  
    }

    private void mostrarPersonas() {
        vista.mostrarPersonas(sistema.getPersonas());  
    }

    private void verificarAcceso(Persona persona) {
        boolean accesoPermitido = controlAcceso.verificarAcceso(persona);  
        vista.mostrarAcceso(persona.getNombre(), accesoPermitido);  
    }
}
