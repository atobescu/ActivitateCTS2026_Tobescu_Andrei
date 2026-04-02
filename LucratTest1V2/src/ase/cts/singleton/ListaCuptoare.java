package ase.cts.singleton;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaCuptoare {
    private static Map<Integer, Cuptor> listaCuptoare = new HashMap<>();

    public static void adaugaCuptor(Integer nrCuptor, Cuptor cuptor) throws Exception {
        if(listaCuptoare.containsKey(nrCuptor) || listaCuptoare.size() > 4){
            throw new Exception("Nu se poate adauga acest cuptor");
        }else{
            listaCuptoare.put(nrCuptor, cuptor);
        }
    }

    public void asigneazaPreparatLaCuptor(Preparat preparat){

        for(Cuptor cuptor: listaCuptoare.values()){
            Integer timpMinimAsteptare = 0;
            if(cuptor.getTemperaturaMaxima() <= preparat.getTemperatura()){
                Integer timpAsteptare = 0;
                for(Preparat preparatInCuptor:cuptor.getListaAsteptare()){
                    timpAsteptare = timpAsteptare + preparatInCuptor.timp;
                }
                if(timpAsteptare < timpMinimAsteptare){
                    timpMinimAsteptare = timpAsteptare;
                    List<Preparat> listaAsteptare = cuptor.getListaAsteptare();
                    listaAsteptare.add(preparat);
                    cuptor.setListaAsteptare(listaAsteptare);
                    return;
                }
            }
        }

    }

    public void afiseazaToateComenzile(){
        for(Cuptor cuptor:listaCuptoare.values()){
            System.out.println("Cuptorul "+
                    cuptor.getNumarCuptor()+ " are in lista de asteptare " +
                    cuptor.getListaAsteptare().toString());
        }
    }
}
