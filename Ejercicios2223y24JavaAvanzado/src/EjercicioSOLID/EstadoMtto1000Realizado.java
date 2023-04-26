package EjercicioSOLID;

public class EstadoMtto1000Realizado extends Estado{

    public EstadoMtto1000Realizado(Coche coche) {
        super(coche);
    }

    @Override
    public String realizarAlineacionYBalanceo() {
        return "ya se realizo alineacion y balanceo, no conviene realizarlo tan pronto";
    }

    @Override
    public String realizarMttoMotor() {
        if (coche.kilometraje>5000) {
            coche.cambiaEstado(new EstadoMtto5000Realizado(coche));
            return "Se realizo mantenimiento de motor \r\n";
        }
        else return "todavia no ha llegado al kilometraje indicado para el mtto de motor \r\n";
    }

    @Override
    public String realizarMttoTransmision() {
        return "no se puede realizar mantenimiento de transmision sin antes realizar mtto de motor";
    }
}
