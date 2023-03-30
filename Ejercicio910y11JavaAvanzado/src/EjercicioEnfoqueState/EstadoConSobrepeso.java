package EjercicioEnfoqueState;

public class EstadoConSobrepeso extends Estado {
    public EstadoConSobrepeso(Paciente paciente) {
        super(paciente);
    }

    @Override
    String regimenCompleto() {
        return "ya no es necesario hacer un regimen completo, usted puede prescindir del aerobico";
    }

    @Override
    String dietaYPesas() {
        paciente.CambiaEstado(new EstadoSinSobrepeso(paciente));
        return "hacer dieta y pesas es lo ideal, bajara de peso y mantendra la masa muscular";
    }

    @Override
    String pesas() {
        return "es necesario continuar con la dieta mientas usted mantenga el sobrepeso";
    }
}


