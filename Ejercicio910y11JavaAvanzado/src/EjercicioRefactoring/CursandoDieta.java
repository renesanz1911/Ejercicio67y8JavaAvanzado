package EjercicioRefactoring;

public class CursandoDieta {
    public double pesoActual;
    public double porcGrasaActual;
    public double musculoActual;
    public String tipoDieta;

    public void avanceDieta (Inicial inicial){
        double perdidaPeso = inicial.peso1 - pesoActual ;
        double disminucionGrasa = inicial.porcGrasa1 - porcGrasaActual;
        double aumentoMasaMuscular = musculoActual - inicial.musculo1;
        System.out.println("Usted, desde el control inicial, perdio: "+perdidaPeso+"kgs, su porcentaje de grasa disminuyo: "
                +disminucionGrasa+"%, su masa muscular aumento: "+aumentoMasaMuscular+"%" +" llevando a cabo una dieta " +tipoDieta );
    }
}
