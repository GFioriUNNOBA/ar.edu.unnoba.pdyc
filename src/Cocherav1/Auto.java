package Cocherav1;

public class Auto extends Vehiculo {
    public Auto(Cochera cochera) {
        super(cochera);
    }

    @Override
    int getEspaciosOcupados() {
        return 1;
    }
}
