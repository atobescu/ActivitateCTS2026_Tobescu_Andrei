package ro.ase.cts.pachet_turistic;

public class PachetVacanta implements Pachet{
    @Override
    public void descriere() {
        System.out.println("Sunt un pachet doar cu vacanta");
    }

    @Override
    public void pret(Double pret) {
        System.out.println("Pretul acestui pachet este de " + pret);
    }
}
