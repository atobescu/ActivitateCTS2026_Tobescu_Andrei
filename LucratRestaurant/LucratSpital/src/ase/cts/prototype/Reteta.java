package ase.cts.prototype;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.HashMap;
import java.util.Map;

public class Reteta implements PrototypeReteta{

    private Double ibuprofen;
    private Double paracetamol;
    private Double decongestionant;
    private Map<Double, String> proportii = new HashMap<>();

    public Reteta(Double ibuprofen, Double paracetamol, Double decongestionant, Map<Double, String> proportii) {
        this.ibuprofen = ibuprofen;
        this.paracetamol = paracetamol;
        this.decongestionant = decongestionant;
        this.proportii = proportii;
    }

    public Reteta() {
    }

    public void setIbuprofen(Double ibuprofen) {
        this.ibuprofen = ibuprofen;
    }

    public void setParacetamol(Double paracetamol) {
        this.paracetamol = paracetamol;
    }

    public void setDecongestionant(Double decongestionant) {
        this.decongestionant = decongestionant;
    }

    public void setProportii(Map<Double, String> proportii) {
        this.proportii = proportii;
    }

    @Override
    public PrototypeReteta cloneaza() {
        Reteta reteta = new Reteta();

        reteta.setDecongestionant(this.decongestionant);
        reteta.setIbuprofen(this.ibuprofen);
        reteta.setParacetamol(this.paracetamol);

        Map<Double, String> proportiiTemporare = new HashMap<>();
        for(Double key: this.proportii.keySet()){
            proportiiTemporare.put(key, this.proportii.get(key));
        }
        reteta.setProportii(proportiiTemporare);

        return (PrototypeReteta) reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("ibuprofen=").append(ibuprofen);
        sb.append(", paracetamol=").append(paracetamol);
        sb.append(", decongestionant=").append(decongestionant);
        sb.append(", proportii=").append(proportii);
        sb.append('}');
        return sb.toString();
    }
}