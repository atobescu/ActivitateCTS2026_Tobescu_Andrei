package ase.cts.agentie;

public class ListaOferte implements IListaOferte{

    private String numeOferta;
    private TipPachetTuristic tipPachetTuristic;

    public ListaOferte(String numeOferta, TipPachetTuristic tipPachetTuristic) {
        this.numeOferta = numeOferta;
        this.tipPachetTuristic = tipPachetTuristic;
    }

    public ListaOferte() {
    }

    @Override
    public ListaOferte copiaza() {
        ListaOferte listaOferte = new ListaOferte();

        listaOferte.numeOferta = this.numeOferta;
        listaOferte.tipPachetTuristic = this.tipPachetTuristic;

        return listaOferte;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaOferte{");
        sb.append("numeOferta='").append(numeOferta).append('\'');
        sb.append(", tipPachetTuristic=").append(tipPachetTuristic);
        sb.append('}');
        return sb.toString();
    }
}
