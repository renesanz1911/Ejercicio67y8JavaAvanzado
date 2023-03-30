package EjercicioEnfoqueState;

public class EstadoObeso extends Estado{
    public EstadoObeso(Paciente paciente) {
        super(paciente);
    }

    @Override
    String regimenCompleto() {
        paciente.CambiaEstado(new EstadoConSobrepeso(paciente));
        return "El regimen completo consta de dieta, ejercicio aerobico y entrenamiento con pesas";
    }

    @Override
    String dietaYPesas() {
        return "si usted tiene obesidad necesita hacer aerobicos tambien, dado que su salud " +
                "corre peligro de mantenerse esta condicion";
    }

    @Override
    String pesas() {
        return "si usted tiene obesidad necesita hacer aerobicos y dieta para bajar de peso mas rapido," +
                " ya que su salud puede deteriorarse de mantener este peso y hacer pesas mantendra la masa muscular";
    }
}
