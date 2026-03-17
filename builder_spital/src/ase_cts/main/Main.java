package ase_cts.main;
//problema 1 din spitale

import ase_cts.builder.Internare;
import ase_cts.builder.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        //cum faci fara builder:
        Internare internareFaraBuilderOptiuni = new Internare(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "Marius");
        Internare internareFaraBuilderFaraOptiuni = new Internare(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, "Mihai");

        //cum faci cu builder:
        //bulderul fara optiuni
        InternareBuilder internareBuildeFaraOptiuni = new InternareBuilder("Marius");
        Internare internareFaraOptiuni =internareBuildeFaraOptiuni.build();

        //de facut bulderul cu optiuni
//        InternareBuilder internareBuilderCuOptiuni = new InternareBuilder("Mihai");
//        Internare internareCuOptiuni = internareBuilderCuOptiuni
        System.out.println(internareFaraOptiuni.toString());
//        System.out.println(internareCuOptiuni.toString());

        //de facut bulderul cu optiuni (varianta alternativa)


    }
}