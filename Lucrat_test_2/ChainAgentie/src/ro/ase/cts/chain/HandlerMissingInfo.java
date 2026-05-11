package ro.ase.cts.chain;

public class HandlerMissingInfo extends Handler{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail().isEmpty() && client.getNrTel().isEmpty()){
            System.out.println("Atentie, clientul " + client.getNume() + " nu si-a salvat email si nr tel");
        }else{
            super.handler.notifica(client,mesaj);
        }
    }
}
