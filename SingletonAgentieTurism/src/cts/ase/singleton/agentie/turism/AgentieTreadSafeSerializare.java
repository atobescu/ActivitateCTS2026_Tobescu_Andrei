package cts.ase.singleton.agentie.turism;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class AgentieTreadSafeSerializare implements Serializable {
    private String numeAgentie;
    private Date dataInfintarii;

    private static AgentieTreadSafeSerializare instanta = null;

    public static AgentieTreadSafeSerializare getInstanta(String numeAgentie, Date dataInfintarii){
        if(instanta == null){
            instanta = new AgentieTreadSafeSerializare(numeAgentie, dataInfintarii);
        }
        return instanta;
    }

    private AgentieTreadSafeSerializare(String numeAgentie, Date dataInfintarii) {
        this.numeAgentie = numeAgentie;
        this.dataInfintarii = dataInfintarii;
    }

    @Serial
    protected Object readResolve(){
        return getInstanta("Lalala", new Date(0));
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieTreadSafeSerializare{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", dataInfintarii=").append(dataInfintarii);
        sb.append('}');
        return sb.toString();
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }
}
