package EjercicioSOLID;

public class CocheHibrido extends Coche{
    String impulsadoPor = "gasolina";


    public CocheHibrido(String marca, String modelo, long kilometraje, int velocidadFinal) {
        super(marca, modelo, kilometraje, velocidadFinal);
        estado = new EstadoSinMantener(this);
    }

    public void cambiaMetodoImpulsor(){
        if (impulsadoPor == "gasolina"){
            impulsadoPor = "electrico";
            velocidadFinal -= 25;
        } else if (impulsadoPor == "electrico") {
            impulsadoPor = "gasolina";
            velocidadFinal += 25;
        }
    }
    public String getImpulsadoPor(){
        return impulsadoPor;
    }


}
