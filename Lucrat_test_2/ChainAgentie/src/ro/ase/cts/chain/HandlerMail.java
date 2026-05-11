package ro.ase.cts.chain;

public class HandlerMail extends Handler{
    @Override
    public void notifica(Client client, String mesaj) {
        if(!client.getEmail().isEmpty()){
            System.out.println(client.getNume() + " primeste email");
        }else{
            super.handler.notifica(client, mesaj);
        }
    }
}
