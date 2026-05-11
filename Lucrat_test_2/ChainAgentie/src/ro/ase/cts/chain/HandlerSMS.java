package ro.ase.cts.chain;

public class HandlerSMS extends Handler{
    @Override
    public void notifica(Client client, String mesaj) {
        if(!client.getNrTel().isEmpty()){
            System.out.println(client.getNume() + " primeste SMS");
        }else{
            super.handler.notifica(client,mesaj);
        }
    }
}
