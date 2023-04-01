package EjercicioComentarios.EjercicioSingleton;

public class CursandoDieta {
    public double pesoActual;
    public double porcGrasaActual;
    public double musculoActual;
    public String tipoDieta;

    /*
    * Función que compara; los parametros de las instancias de CursandoDieta (etapas paciente), con los
    * mismos parametros de la unica instancia de la clase Inicial (primer estado del paciente) mediante
    * una simple resta; Por ultimo muestra por pantalla los resultados.
    * */
    public void avanceDieta (Inicial inicial){
        double perdidaPeso = inicial.peso1 - pesoActual ;
        double disminucionGrasa = inicial.porcGrasa1 - porcGrasaActual;
        double aumentoMasaMuscular = musculoActual - inicial.musculo1;
        System.out.println("Usted, desde el control inicial, perdio: "+perdidaPeso+"kgs, su porcentaje de grasa disminuyo: "
                +disminucionGrasa+"%, su masa muscular aumento: "+aumentoMasaMuscular+"%" +" llevando a cabo una dieta " +tipoDieta );
    }
}
