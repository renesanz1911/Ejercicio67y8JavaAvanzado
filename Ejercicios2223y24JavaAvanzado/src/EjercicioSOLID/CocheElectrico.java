package EjercicioSOLID;
/*Se crean clases para añadir funcionalidad a la clase padre en vez de crear funciones en ella,
* respetando el principio de abierto/cerrado. */
public class CocheElectrico extends Coche{
    boolean pilotoAutomatico;

    public CocheElectrico(String marca, String modelo, long kilometraje, int velocidadFinal) {
        super(marca, modelo, kilometraje, velocidadFinal);
        estado = new EstadoSinMantener(this);
    }

    public CocheElectrico() {
        estado = new EstadoSinMantener(this);
    }

    public void activaDesactivaPilotoAutomatico(){
        if (pilotoAutomatico){
            pilotoAutomatico=false;
        }
        else pilotoAutomatico=true;
    }
}


