package EjercicioEnfoqueState;

public class EstadoSinSobrepeso extends Estado {

    public EstadoSinSobrepeso(Paciente paciente) {
        super(paciente);
    }

    @Override
    String regimenCompleto() {
        return "si usted realiza un regimen completo puede llegar a un nivel de grasa muy bajo" +
                "y perder masa muscular por el deficit calorico pronunciado";
    }

    @Override
    String dietaYPesas() {
        return  "usted ya bajo de peso lo suficiente, no deberia continuar conb el deficit calorico" +
                "ya que esto puede hacerle erder masa muscular";
    }

    @Override
    String pesas() {
         return "mantengase haciendpo pesas para ir ganando lentamente masa muscular";
    }
}

