package EjercicioComentarios.EjercicioSingleton;

public class Inicial {
    private static Inicial inicial;
    static double peso1;
    static double porcGrasa1;
    static double musculo1;

    /**
     * Implementacion Patron Singleton.
     * @param peso
     * @param porcGrasa
     * @param musculo
     */
    private Inicial(double peso, double porcGrasa, double musculo){}
    public static Inicial getInstance(double peso, double porcGrasa, double musculo) {
        if (inicial == null) {
            inicial = new Inicial(peso, porcGrasa, musculo);
            peso1 = peso;
            porcGrasa1 = porcGrasa;
            musculo1 = musculo;
        }
        return inicial;
    }
}
