package ase.cts.agentie;

public class Pachet {
    private Boolean areWiFi;
    private Boolean arePet;
    private Boolean areAC;

    public Pachet(Boolean areWiFi, Boolean arePet, Boolean areAC) {
        this.areWiFi = areWiFi;
        this.arePet = arePet;
        this.areAC = areAC;
    }

    public Boolean getAreWiFi() {
        return areWiFi;
    }

    public void setAreWiFi(Boolean areWiFi) {
        this.areWiFi = areWiFi;
    }

    public Boolean getArePet() {
        return arePet;
    }

    public void setArePet(Boolean arePet) {
        this.arePet = arePet;
    }

    public Boolean getAreAC() {
        return areAC;
    }

    public void setAreAC(Boolean areAC) {
        this.areAC = areAC;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("areWiFi=").append(areWiFi);
        sb.append(", arePet=").append(arePet);
        sb.append(", areAC=").append(areAC);
        sb.append('}');
        return sb.toString();
    }


}
