package ase.cts.stb.builder;

public class AutobuzLinieBuilder implements Builder{

    private AutobuzLinie autobuzLinie;
    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }

    public AutobuzLinieBuilder() {
        autobuzLinie = new AutobuzLinie("-","Ion",Boolean.FALSE, Boolean.FALSE,"Buckle-up!");
    }

    public AutobuzLinieBuilder setModel(String model){
        autobuzLinie.setModel(model);
        return this;
    }

    public AutobuzLinieBuilder setSofer(String sofer){
        autobuzLinie.setSofer(sofer);
        return this;
    }

    public AutobuzLinieBuilder setOpresteInCapat(Boolean opresteInCapat){
        autobuzLinie.setOpresteInCapat(opresteInCapat);
        return this;
    }

    public AutobuzLinieBuilder setdeschideUsileSingur(Boolean deschideUsileSingur){
        autobuzLinie.setDeschideUsileSingur(deschideUsileSingur);
        return this;
    }

    public AutobuzLinieBuilder setTextDerulator(String textDerulator){
        autobuzLinie.setTextDerulator(textDerulator);
        return this;
    }

}
