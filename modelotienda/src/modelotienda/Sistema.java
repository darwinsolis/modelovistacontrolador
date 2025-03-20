
package modelotienda;
import  java.util.ArrayList;

public class Sistema {
    private ArrayList<Persona> personas;

    public Sistema() {
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
}
