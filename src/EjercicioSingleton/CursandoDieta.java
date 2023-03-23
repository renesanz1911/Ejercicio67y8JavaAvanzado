package EjercicioSingleton;

public class CursandoDieta {
    double pesoActual;
    double porcGrasaActual;
    double musculoActual;

    public CursandoDieta(double pesoActual, double porcGrasaActual, double musculoActual) {
        this.pesoActual = pesoActual;
        this.porcGrasaActual = porcGrasaActual;
        this.musculoActual = musculoActual;
    }
    public void avanceDieta (Inicial inicial){
        double perdidaPeso = inicial.peso1 - pesoActual ;
        double disminucionGrasa = inicial.porcGrasa1 - porcGrasaActual;
        double aumentoMasaMuscular = musculoActual - inicial.musculo1;
        System.out.println("Usted, desde el control inicial, perdio: "+perdidaPeso+"kgs, su porcentaje de grasa disminuyo: "
                +disminucionGrasa+"%, su masa muscular aumento: "+aumentoMasaMuscular+"%");
    }
}
