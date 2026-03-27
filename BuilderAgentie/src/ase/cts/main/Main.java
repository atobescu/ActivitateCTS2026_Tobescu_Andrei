package ase.cts.main;

import ase.cts.agentie.Pachet;
import ase.cts.agentie.PachetBuilder;

public class Main {
    public static void main(String[] args) {
        PachetBuilder builder = new PachetBuilder();
        Pachet pachet1 = builder.build();
        pachet1.setAreAC(Boolean.TRUE);
        System.out.println(pachet1.toString());

        //sau:

        Pachet pachet2 = new PachetBuilder()
                .setArePet(Boolean.TRUE).build();
        System.out.println(pachet2.toString());
    }
}