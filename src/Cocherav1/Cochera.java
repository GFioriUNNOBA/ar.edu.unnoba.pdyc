package Cocherav1;

import java.util.ArrayList;
import java.util.List;

// Esta clase es la Seccion critica
class Cochera {
    private List<Vehiculo> lugares;
    private int capacidadMaxima;

    public Cochera(int capacidadMaxima) {
        this.lugares = new ArrayList<>(capacidadMaxima);
        this.capacidadMaxima = capacidadMaxima;
    }


    public synchronized void ingresar(Vehiculo vehiculo) throws InterruptedException {

        while (numEspaciosOcupados() + vehiculo.getEspaciosOcupados() > capacidadMaxima) {
            wait();
        }
        lugares.add(vehiculo);
        System.out.println(vehiculo.getClass().getSimpleName() + " ingresado a la cochera.");
        notifyAll();
    }

    public synchronized void sacar(Vehiculo vehiculo) {
        lugares.remove(vehiculo);
        System.out.println(vehiculo.getClass().getSimpleName() + " sacado de la cochera.");
        notifyAll();
    }

    private synchronized int numEspaciosOcupados() {
        int total = 0;
        for (Vehiculo vehiculo : lugares) {
            total += vehiculo.getEspaciosOcupados();
        }
        return total;
    }
}
