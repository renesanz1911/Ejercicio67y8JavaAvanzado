package EjercicioSOLID;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setKilometraje(48000);
        coche.setVelocidadFinal(190);
        System.out.println(coche.estado.realizarAlineacionYBalanceo());
        System.out.println(coche.estado.realizarMttoMotor());
        System.out.println(coche.estado.realizarMttoTransmision());
        System.out.println("la velocidad final ahora es de: " + coche.velocidadFinal);

        /*Abajo creamos una instancia de CocheElectrico, una subclase de la superClase Coche
        * y se le aplicaron los mismos metodos para corroborar que se cumple el principio de
        * sustitucion de Liskov */

        CocheElectrico coche1 = new CocheElectrico();
        coche1.setKilometraje(48000);
        coche1.setVelocidadFinal(190);
        System.out.println(coche1.estado.realizarAlineacionYBalanceo());
        System.out.println(coche1.estado.realizarMttoMotor());
        System.out.println(coche1.estado.realizarMttoTransmision());
        System.out.println("la velocidad final ahora es de: " + coche.velocidadFinal);
    }
}
