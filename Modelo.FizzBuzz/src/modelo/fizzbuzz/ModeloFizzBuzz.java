package modelo.fizzbuzz;

public class ModeloFizzBuzz {
    

    public String[] jugarFizzBuzz() {
        String[] resultados = new String[100]; 
        
        for (int i = 0; i < 100; i++) {
            int numero = i + 1;
            if (numero % 3 == 0 && numero % 5 == 0) {
                resultados[i] = "FizzBuzz";
            } else if (numero % 3 == 0) {
                resultados[i] = "Fizz";
            } else if (numero % 5 == 0) {
                resultados[i] = "Buzz";
            } else {
                resultados[i] = String.valueOf(numero);
            }
        }
        return resultados;
    }
}
