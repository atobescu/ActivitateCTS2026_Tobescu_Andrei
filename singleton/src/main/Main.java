package main;

import ro_ase_cts.lazy_hotel.Hotel;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = Hotel.getInstanta("Caro", 2,1);
        //asta este o alta referinta la hotel:
        Hotel hotel2 = Hotel.getInstanta("Ibis", 3,5);

        hotel.afiseazaInchiriereCamera();
        hotel.afiseazaInchiriereCamera();
        //avand doar o instanta, de aici nu se mai inchiriaza:
        hotel2.afiseazaInchiriereCamera();
        hotel2.afiseazaInchiriereCamera();

        //incearca sa faci asta mereu, ca sa te verifici, trebuie sa aiba o eroare:
        //Hotel hotel3 = new Hotel();
    }
}