package EjercicioSOLID;

public class EstadoMtto20000Realizado extends Estado{
    public EstadoMtto20000Realizado(Coche coche) {
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
        return "ya se realizo mantenimiento de transmision, no conviene realizarlo tan pronto";
    }
}
