package ase.cts.singleton;

public class Supa extends Preparat{
    public Supa(Integer timp, Integer temperatura) {
        super(timp, temperatura);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("timp=").append(timp);
        sb.append(", temperatura=").append(temperatura);
        sb.append('}');
        return sb.toString();
    }

}
