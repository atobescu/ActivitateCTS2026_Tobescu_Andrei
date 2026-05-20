package cts.tobescu.facade.model;

public class Facade {
    private Restaurant restaurant;

    public Facade(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void verificaMasa(){
        Boolean esteInRegula = Boolean.TRUE;
        for(Masa masa: restaurant.getListaMese()){
            if(masa.getEsteOcupata()){
                esteInRegula = Boolean.FALSE;
            }else{
                if(!masa.getAreServeteleNoi() || !masa.getEsteDebarasata()){
                    esteInRegula = Boolean.FALSE;
                }
            }
            if(esteInRegula){
                System.out.println("Masa " + masa.getNume() + " poate fi folosita.");
                return;
            }else{
                System.out.println("Masa " + masa.getNume() + " nu poate fi folosita.");
            }
            esteInRegula = Boolean.TRUE;
        }
    }
}
