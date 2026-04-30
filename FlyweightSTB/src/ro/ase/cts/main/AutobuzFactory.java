package ro.ase.cts.main;

import java.util.HashMap;

public class AutobuzFactory {
    private HashMap<Integer,ILinieTransport> mijloaceleDeTransport;

    public AutobuzFactory() {
        mijloaceleDeTransport = new HashMap<Integer,ILinieTransport>();
    }

    public void setMijloacDeTransport(ILinieTransport linieTransport){
        mijloaceleDeTransport.put(mijloaceleDeTransport.size(), linieTransport);
    }

    public ILinieTransport getMijlocTransport(Integer nrMijloc){
        ILinieTransport mijlocTransport = mijloaceleDeTransport.get(nrMijloc);
        if(mijlocTransport == null){
            mijlocTransport = new AutobuzLinie("Otokar", 2020, 52);
            mijloaceleDeTransport.put(nrMijloc, mijlocTransport);
        }
        return mijlocTransport;
    }
}
