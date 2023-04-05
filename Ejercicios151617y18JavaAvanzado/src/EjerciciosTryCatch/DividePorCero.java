package EjerciciosTryCatch;

public class DividePorCero {
    public double dividePorCero(int a, int b) {
        double resultado = 0;
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("no se puede dividir por cero " + e.getClass() );
        }
        return resultado;
    }
}
