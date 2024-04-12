package Cocherav1;

abstract class Vehiculo extends Thread {
    protected Cochera cochera;

    public Vehiculo(Cochera cochera) {
        this.cochera = cochera;
    }

    abstract int getEspaciosOcupados();


    @Override
    public void run() {
        try {
            cochera.ingresar(this);
            Thread.sleep(1000);
            cochera.sacar(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
