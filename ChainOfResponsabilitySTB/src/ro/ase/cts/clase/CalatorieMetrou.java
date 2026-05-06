package ro.ase.cts.clase;

public class CalatorieMetrou extends CalatorieHandlerAbs{
    @Override
    public String  returnCuCeMergem(Double distanta) {
        if(distanta > 10){
            return "Metrou";
        }else{
            return super.returnCuCeMergem(distanta);
        }
    }
}
