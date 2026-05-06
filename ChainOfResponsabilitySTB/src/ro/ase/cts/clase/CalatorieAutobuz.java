package ro.ase.cts.clase;

public class CalatorieAutobuz extends CalatorieHandlerAbs{
    @Override
    public String  returnCuCeMergem(Double distanta) {
        if(distanta >= 3 && distanta < 5){
            return "Autobuz";
        }else{
            return super.returnCuCeMergem(distanta);
        }
    }
}
