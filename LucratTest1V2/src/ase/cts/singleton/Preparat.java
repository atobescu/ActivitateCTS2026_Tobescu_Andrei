package ase.cts.singleton;

public abstract class Preparat {
    protected Integer timp;
    protected Integer temperatura;

    public Preparat(Integer timp, Integer temperatura) {
        this.timp = timp;
        this.temperatura = temperatura;
    }

    public Integer getTimp() {
        return timp;
    }

    public void setTimp(Integer timp) {
        this.timp = timp;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }
}
