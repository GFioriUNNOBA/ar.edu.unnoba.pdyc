package ConcheraV2;

public class Auto extends Vehiculo {
    public Auto(Cochera cochera) {
        super(cochera);
        setPriority(MAX_PRIORITY);
    }

    @Override
    int getEspaciosOcupados() {
        return 1;
    }
}
