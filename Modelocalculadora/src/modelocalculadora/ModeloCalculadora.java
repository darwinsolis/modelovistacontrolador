
package modelocalculadora;

import java.util.ArrayList;
import java.util.List;

public class ModeloCalculadora {

    private List<String> resultados; 

    public ModeloCalculadora() {
        this.resultados = new ArrayList<>();
    }

    public double sumar(double num1, double num2) {
        double resultado = num1 + num2;
        resultados.add("Suma: " + num1 + " + " + num2 + " = " + resultado);
        return resultado;
    }

    public double restar(double num1, double num2) {
        double resultado = num1 - num2;
        resultados.add("Resta: " + num1 + " - " + num2 + " = " + resultado);
        return resultado;
    }

    public double multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        resultados.add("Multiplicacion: " + num1 + " * " + num2 + " = " + resultado);
        return resultado;
    }

    
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            resultados.add("Error: No se puede dividir entre 0.");
            return Double.NaN;
        }
        double resultado = num1 / num2;
        resultados.add("Division: " + num1 + " / " + num2 + " = " + resultado);
        return resultado;
    }

    public String[] obtenerResultados() {
        return resultados.toArray(new String[0]);
    }
}
