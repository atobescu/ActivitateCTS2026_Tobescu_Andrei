package cts.ase.singleton.agentie.turism.registry;

import java.util.HashMap;
import java.util.Map;

public class RegistruAgentii {

    private static Map<String, Agentie> registruAgentii = new HashMap<>();

    public static void inregistreaza(String nume, Agentie agentie) throws Exception {
        if(registruAgentii.containsKey(nume)){
            throw new Exception("Agentia a fost deja inregistrata");
        }else{
            registruAgentii.put(nume, agentie);
        }
    }
}
