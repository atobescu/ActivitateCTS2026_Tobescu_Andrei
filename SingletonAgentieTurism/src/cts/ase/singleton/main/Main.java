package cts.ase.singleton.main;

import cts.ase.singleton.agentie.turism.AgentieThreadSafe;
import cts.ase.singleton.agentie.turism.AgentieTreadSafeSerializare;
import cts.ase.singleton.agentie.turism.registry.AgentieTurism;
import cts.ase.singleton.agentie.turism.registry.RegistruAgentii;

import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        //singleton simplu:
        AgentieThreadSafe agentia1 = AgentieThreadSafe.getInstanta("Agentia 1", new Date(12345));
        AgentieThreadSafe agentia2 = AgentieThreadSafe.getInstanta("Agentia 2", new Date(12345));

        System.out.println(agentia1);
        System.out.println(agentia2);


        //singleton cu serializare:
        AgentieTreadSafeSerializare agentia3 = AgentieTreadSafeSerializare.getInstanta("Agentia 3", new Date(12345));
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("fisierSerializareSingleton.txt"));
        out.writeObject(agentia3);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("fisierSerializareSingleton.txt"));
        AgentieTreadSafeSerializare agentia4 = (AgentieTreadSafeSerializare) in.readObject();

        agentia4.setNumeAgentie("Agentia 4");

        System.out.println(agentia3);
        System.out.println(agentia4);

        //registre de singleton (agentii):
        AgentieTurism agentieTurism1 = new AgentieTurism();
        AgentieTurism agentieTurism2 = new AgentieTurism();

        RegistruAgentii.inregistreaza("Agentia 1 de turism", agentieTurism1);
        RegistruAgentii.inregistreaza("Agentia 1 de turism", agentieTurism2);


    }
}