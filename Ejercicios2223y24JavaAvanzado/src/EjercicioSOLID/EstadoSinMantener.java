package EjercicioSOLID;

public class EstadoSinMantener extends Estado{
    public EstadoSinMantener(Coche coche) {
        super(coche);
    }

    @Override
    public String realizarAlineacionYBalanceo() {
        if (coche.kilometraje>1000) {
            coche.cambiaEstado(new EstadoMtto1000Realizado(coche));
            return "Se realizo alineacion y balanceo \r\n";
        }
        else return "todavia no ha llegado al kilometraje indicado para realizar alineacion y balanceo \r\n";
    }

    @Override
    public String realizarMttoMotor() {
        return "no se puede realizar mantenimiento de motor sin antes realizar alineacion y balanceo";
    }

    @Override
    public String realizarMttoTransmision() {
        return "no se puede realizar mantenimiento de transmision sin antes realizar alineacion y balanceo";
    }
}
