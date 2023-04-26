package EjercicioSOLID;

abstract  public class Estado {
    Coche coche;
    public Estado(Coche coche){
        this.coche = coche;
    }
    abstract public String realizarAlineacionYBalanceo();
    abstract public String realizarMttoMotor();
    abstract public String realizarMttoTransmision();
}
