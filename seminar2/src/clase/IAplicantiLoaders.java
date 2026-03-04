package clase;

import java.io.FileNotFoundException;
import java.util.List;

public interface IAplicantiLoaders {

    //metoda abstracta, definita a general:
    //nu trebuie neaparat public (suntem in interfata)
    //nu trebuie acolade, nu are corp
    //trebuie pusi parametrii

    List<Aplicant> load(String file) throws FileNotFoundException;

}
