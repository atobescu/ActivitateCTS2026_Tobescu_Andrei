package ase.cts.stb.builder;

import ase.cts.stb.simplefactory.clase.Autobuz;

public class AutobuzLinie extends Autobuz {
    private String model;
    private String sofer;
    private Boolean opresteInCapat;
    private Boolean deschideUsileSingur;
    private String textDerulator;

    public AutobuzLinie(String model, String sofer, Boolean opresteInCapat, Boolean deschideUsileSingur, String textDerulator) {
        this.model = model;
        this.sofer = sofer;
        this.opresteInCapat = opresteInCapat;
        this.deschideUsileSingur = deschideUsileSingur;
        this.textDerulator = textDerulator;
    }

    public AutobuzLinie() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSofer() {
        return sofer;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public Boolean getOpresteInCapat() {
        return opresteInCapat;
    }

    public void setOpresteInCapat(Boolean opresteInCapat) {
        this.opresteInCapat = opresteInCapat;
    }

    public Boolean getDeschideUsileSingur() {
        return deschideUsileSingur;
    }

    public void setDeschideUsileSingur(Boolean deschideUsileSingur) {
        this.deschideUsileSingur = deschideUsileSingur;
    }

    public String getTextDerulator() {
        return textDerulator;
    }

    public void setTextDerulator(String textDerulator) {
        this.textDerulator = textDerulator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", opresteInCapat=").append(opresteInCapat);
        sb.append(", deschideUsileSingur=").append(deschideUsileSingur);
        sb.append(", textDerulator='").append(textDerulator).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
