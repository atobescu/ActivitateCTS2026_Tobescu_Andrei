package ro.ase.cts.clase;

public class Student {
    private String nume;
    private IModSustinereExamen modSustinereExamen;

    public void setModSustinereExamen(IModSustinereExamen modSustinereExamen) {
        this.modSustinereExamen = modSustinereExamen;
    }

    public Student(String nume) {
        this.modSustinereExamen = new ProbaGrila();
        this.nume = nume;
    }

    public Student(IModSustinereExamen modSustinereExamen) {
        this.modSustinereExamen = modSustinereExamen;
    }

    public void examineaza(){
        System.out.println();
    }

}
