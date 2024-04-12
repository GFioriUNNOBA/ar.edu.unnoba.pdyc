package ConcheraV2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Cochera cochera = new Cochera(10);

        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            Vehiculo vehiculo;
            if (random.nextBoolean()) {
                vehiculo = new Auto(cochera);
            } else {
                vehiculo = new Camion(cochera);
            }
            vehiculo.start();
        }
    }
}