package ro.ase.cts.clase;

public class CalatorieTroleibuz extends CalatorieHandlerAbs{
    @Override
    public String  returnCuCeMergem(Double distanta) {
        if(distanta < 3){
            return "Troleibuz";
        }else{
            return super.returnCuCeMergem(distanta);
        }
    }
}
