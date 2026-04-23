package ase.cts.clase;

public class Salon {
    private boolean[] paturiLibere = new boolean[10];

    public Salon() {
        this.paturiLibere[0] = true;
        this.paturiLibere[9] = true;
        this.paturiLibere[5] = true;
        this.paturiLibere[7] = true;
    }

    public int returneazaPatLiber(){
        for(int i=0;i<paturiLibere.length;i++){
            if(paturiLibere[i] == true){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int pozitie){
        this.paturiLibere[pozitie] = false;
    }
}
