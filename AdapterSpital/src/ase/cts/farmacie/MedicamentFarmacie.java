package ase.cts.farmacie;

public class MedicamentFarmacie {
    private String numeMedicament;
    public void cumparaMedicament(){
        System.out.println("Medicamentul " + this.numeMedicament + " este cumparat de la farmacie");
    }

    public MedicamentFarmacie(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }
}
