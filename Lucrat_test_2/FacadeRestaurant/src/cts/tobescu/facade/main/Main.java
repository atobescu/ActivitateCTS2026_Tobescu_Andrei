package cts.tobescu.facade.main;

import cts.tobescu.facade.model.Facade;
import cts.tobescu.facade.model.Masa;
import cts.tobescu.facade.model.Receptionist;
import cts.tobescu.facade.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa("masa1");
        Masa masa2 = new Masa("masa2");
        Masa masa3 = new Masa("masa3");
        Masa masa4 = new Masa("masa4");
        Masa masa5 = new Masa("masa5");
        masa1.setEsteDebarasata(Boolean.FALSE);
        masa2.setEsteOcupata(Boolean.FALSE);
        masa3.setAreServeteleNoi(Boolean.FALSE);

        List<Masa> listaMese = new ArrayList<>();
        listaMese.add(masa1);
        listaMese.add(masa2);
        listaMese.add(masa3);
        listaMese.add(masa4);
        listaMese.add(masa5);

        Restaurant restaurant = new Restaurant(listaMese);

//        Boolean esteInRegula = Boolean.TRUE;
//        for(Masa masa: restaurant.getListaMese()){
//            if(masa.getEsteOcupata()){
//                esteInRegula = Boolean.FALSE;
//            }else{
//                if(!masa.getAreServeteleNoi() || !masa.getEsteDebarasata()){
//                    esteInRegula = Boolean.FALSE;
//                }
//            }
//            if(esteInRegula){
//                System.out.println("Masa " + masa.getNume() + " poate fi folosita.");
//            }else{
//                System.out.println("Masa " + masa.getNume() + " nu poate fi folosita.");
//            }
//            esteInRegula = Boolean.TRUE;
//        }
        //sau:
        Receptionist receptionist = new Receptionist("Marcel");
        receptionist.verificaMasa(new Facade(restaurant));


    }
}