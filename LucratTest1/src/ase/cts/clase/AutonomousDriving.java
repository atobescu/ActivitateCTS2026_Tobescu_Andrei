package ase.cts.clase;

public class AutonomousDriving implements IPrototypeModulAI{

    private String tipDrona;
    private String versiuneModul;

    public String getTipDrona() {
        return tipDrona;
    }

    public void setTipDrona(String tipDrona) {
        this.tipDrona = tipDrona;
    }

    public String getVersiuneModul() {
        return versiuneModul;
    }

    public void setVersiuneModul(String versiuneModul) {
        this.versiuneModul = versiuneModul;
    }

    public AutonomousDriving(String tipDrona, String versiuneModul) {
        this.tipDrona = tipDrona;
        this.versiuneModul = versiuneModul;
    }

    public AutonomousDriving() {
    }

    @Override
    public IPrototypeModulAI copiaza() {
        AutonomousDriving autonomousDriving = new AutonomousDriving();

        autonomousDriving.setTipDrona(this.tipDrona);
        autonomousDriving.setVersiuneModul(this.versiuneModul);

        return autonomousDriving;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutonomousDriving{");
        sb.append("tipDrona='").append(tipDrona).append('\'');
        sb.append(", versiuneModul='").append(versiuneModul).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
