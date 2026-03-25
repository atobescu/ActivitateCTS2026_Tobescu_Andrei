package cts.ase.singleton.agentie.turism;

import java.util.Date;

public class AgentieThreadSafe {
    private String numeAgentie;
    private Date dataInfintarii;

    private static AgentieThreadSafe instanta = null;

    public static synchronized AgentieThreadSafe getInstanta(String numeAgentie, Date dataInfintarii){
        if(instanta == null){
            instanta = new AgentieThreadSafe(dataInfintarii, numeAgentie);
        }
        return instanta;
    }

    private AgentieThreadSafe(Date dataInfintarii, String numeAgentie) {
        this.dataInfintarii = dataInfintarii;
        this.numeAgentie = numeAgentie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieThreadSafe{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", dataInfintarii=").append(dataInfintarii);
        sb.append('}');
        return sb.toString();
    }
}
