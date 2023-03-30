package EjercicioEnfoqueState;

public class Paciente {

    public Estado estado;
    double porcGrasa;

    public Paciente (double porcGrasa){
        this.porcGrasa = porcGrasa;
        if (porcGrasa>25){
            estado = new EstadoObeso(this);
        }
        if (porcGrasa<25 && porcGrasa>16){
            estado = new EstadoConSobrepeso(this);
        }
        else if (porcGrasa>8 && porcGrasa<16) {
            estado = new EstadoSinSobrepeso(this);
        }
    }
    public void CambiaEstado(Estado estado){
        System.out.println("Estado inicial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado final: " + this.estado.getClass().getName());
    }
    public double getPorcGrasa() {
        return porcGrasa;
    }
}

