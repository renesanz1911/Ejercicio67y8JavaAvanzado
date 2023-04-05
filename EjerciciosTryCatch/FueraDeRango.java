package EjerciciosTryCatch;

public class FueraDeRango {
    int[] numeros = new int[6];

    public void recorreArray (int dimensionArray){
        try {
            for (int i = 0; i < dimensionArray; i++) {
                System.out.println(numeros[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ha sobrepasado la dimension del array " + e.getClass());
        }
    }
}
