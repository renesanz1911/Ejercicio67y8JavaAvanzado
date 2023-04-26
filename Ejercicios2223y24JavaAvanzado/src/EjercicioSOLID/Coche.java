package EjercicioSOLID;

public class Coche {
    String marca;
    String modelo;
    long kilometraje;
    int velocidadFinal;
    public Estado estado;


    public Coche() {
        this.estado = new EstadoSinMantener(this);
    }

    public Coche(String marca, String modelo, long kilometraje, int velocidadFinal) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.velocidadFinal = velocidadFinal;
        this.estado = new EstadoSinMantener(this);
    }

    public void cambiaEstado (Estado estado) {
        System.out.println("Estado inicial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado final: " + this.estado.getClass().getName());
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public long getKilometraje() {
        return kilometraje;
    }

    public Estado getEstado(){
        return estado;
    }

    public int getVelocidadFinal() {
        return velocidadFinal;
    }

    public void setVelocidadFinal(int velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }

    public void setKilometraje(long kilometraje) {
        this.kilometraje = kilometraje;
    }
}
