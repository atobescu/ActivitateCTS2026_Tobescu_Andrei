package ase.cts.clase;

import java.util.List;

public class DroneConnection implements IDroneConnection{
    private List<String> listaUtilizatori = null;

    private static DroneConnection instanta = null;

    private DroneConnection(List<String> listaUtilizatori) {
        this.listaUtilizatori = listaUtilizatori;
    }

    public static synchronized DroneConnection getInstanta(List<String> listaUtilizatori){
        if(instanta == null){
            instanta = new DroneConnection(listaUtilizatori);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DroneConnection{");
        sb.append("listaUtilizatori=").append(listaUtilizatori);
        sb.append('}');
        return sb.toString();
    }
}
