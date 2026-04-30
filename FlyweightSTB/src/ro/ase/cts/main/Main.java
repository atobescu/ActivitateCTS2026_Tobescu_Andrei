package ro.ase.cts.main;

public class Main {
    public static void main(String[] args) {
        AutobuzFactory factory = new AutobuzFactory();
        DetaliiLinie linia312 = new DetaliiLinie("312", "Romana", "Universitate");
        DetaliiLinie linia316 = new DetaliiLinie("316", "Universitate", "Baneasa");
        DetaliiLinie linia350 = new DetaliiLinie("350", "Baneasa", "Piata sudului");

        AutobuzLinie autobuzLinie1 = (AutobuzLinie) factory.getMijlocTransport(1);
        autobuzLinie1.afiseaza(linia312);
        AutobuzLinie autobuzLinie2 = (AutobuzLinie) factory.getMijlocTransport(2);
        autobuzLinie2.afiseaza(linia350);

    }
}