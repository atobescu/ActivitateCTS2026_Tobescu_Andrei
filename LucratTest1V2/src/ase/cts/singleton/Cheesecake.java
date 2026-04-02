package ase.cts.singleton;

public class Cheesecake extends Preparat{
    public Cheesecake(Integer timp, Integer temperatura) {
        super(timp, temperatura);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cheesecake{");
        sb.append("timp=").append(timp);
        sb.append(", temperatura=").append(temperatura);
        sb.append('}');
        return sb.toString();
    }
}
