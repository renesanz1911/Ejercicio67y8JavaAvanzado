package EjerciciosTryCatch;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DividePorCero division = new DividePorCero();
        FueraDeRango fueraDeRango = new FueraDeRango();
        ArchivoNoEncontrado archivo = new ArchivoNoEncontrado();


        System.out.println(division.dividePorCero(5,0));
        fueraDeRango.recorreArray(8);
        archivo.leeFichero();





    }
}
