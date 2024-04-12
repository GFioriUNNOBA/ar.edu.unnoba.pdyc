package ConcheraV2;

public class Camion extends Vehiculo {
    public Camion(Cochera cochera) {
        super(cochera);


    }

    @Override
    int getEspaciosOcupados() {
        return 2;
    }
}
