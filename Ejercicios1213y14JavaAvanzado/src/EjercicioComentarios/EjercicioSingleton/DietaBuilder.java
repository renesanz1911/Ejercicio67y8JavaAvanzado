package EjercicioComentarios.EjercicioSingleton;

public class DietaBuilder {
    CursandoDieta paciente;

    public DietaBuilder (double peso){
        paciente = new CursandoDieta();
        paciente.pesoActual = peso;
    }

    public DietaBuilder conPorcGrasa (double porcGrasa){
        paciente.porcGrasaActual = porcGrasa;
        return this;
    }
    public DietaBuilder conPorcMusculo (double porcMusculo){
        paciente.musculoActual = porcMusculo;
        return this;
    }
    public DietaBuilder conTipoDieta(String tipoDieta){
        paciente.tipoDieta = tipoDieta;
        return this;
    }
    public CursandoDieta build (){
        return this.paciente;
    }
}
