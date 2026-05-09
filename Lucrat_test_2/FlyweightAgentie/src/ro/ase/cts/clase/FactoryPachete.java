package ro.ase.cts.clase;

import java.util.HashMap;

public class FactoryPachete {
    private HashMap<Integer, PachetComun> listaPachete;

    public FactoryPachete() {
        listaPachete = new HashMap<Integer, PachetComun>();
    }

    public IPachet getPachetTuristic(Integer cod){
        IPachet pachetComun = listaPachete.get(cod);
        if(pachetComun == null){
            //punem in hashmap:
            pachetComun = new PachetComun(cod, "Raddison", "bahamas", Boolean.TRUE);
            listaPachete.put(cod, (PachetComun) pachetComun);
        }
        return pachetComun;
    }
}
