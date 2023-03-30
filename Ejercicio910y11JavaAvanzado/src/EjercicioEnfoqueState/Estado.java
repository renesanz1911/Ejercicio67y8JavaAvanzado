package EjercicioEnfoqueState;

abstract public class Estado {
    public Paciente paciente;
    public Estado(Paciente paciente){
        this.paciente = paciente;
    }
    abstract String regimenCompleto();
    abstract String dietaYPesas();
    abstract String pesas();
}
