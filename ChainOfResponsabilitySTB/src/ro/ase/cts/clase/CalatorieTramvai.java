package ro.ase.cts.clase;

public class CalatorieTramvai extends CalatorieHandlerAbs{
    @Override
    public String  returnCuCeMergem(Double distanta) {
        if(distanta >= 5 && distanta < 10){
            return "Tramvai";
        }else{
            return super.returnCuCeMergem(distanta);
        }
    }
}
