package EjercicioSOLID;

public class EstadoMtto5000Realizado extends Estado{
    public EstadoMtto5000Realizado(Coche coche) {
        super(coche);
    }

    @Override
    public String realizarAlineacionYBalanceo() {
        return "ya se realizo alineacion y balanceo, no conviene realizarlo tan pronto";
    }

    @Override
    public String realizarMttoMotor() {
        return "ya se realizo mantenimiento de motor, no conviene realizarlo tan pronto";
    }

    @Override
    public String realizarMttoTransmision() {
        if(coche.kilometraje>20000){
        coche.cambiaEstado(new EstadoMtto20000Realizado(coche));
        coche.velocidadFinal+=25;
        return "Se realizo mantenimiento de transmision, aumenta la velocidad final por mejora de rendimiento \r\n";
        }
        else return "no ha llegado al kilometraje indicado para realizar el mtto de transmision \r\n";
    }
}
