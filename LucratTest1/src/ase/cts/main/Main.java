package ase.cts.main;

import ase.cts.clase.AutonomousDriving;
import ase.cts.clase.DroneConnection;
import ase.cts.clase.IPrototypeModulAI;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AutonomousDriving modul1 = new AutonomousDriving("lala", "v1");
        AutonomousDriving modul2 = new AutonomousDriving("vava", "v2");
        AutonomousDriving modul3 = new AutonomousDriving("iaia", "v3");

        IPrototypeModulAI modul1_v2 = modul1.copiaza();
        System.out.println(modul1.toString());
        System.out.println(modul1_v2.toString());
        IPrototypeModulAI modul2_v2 = modul2.copiaza();
        System.out.println(modul2.toString());
        System.out.println(modul2_v2.toString());

        List<String> listaUseri = new ArrayList<>();
        listaUseri.add("Eu");
        DroneConnection connection = DroneConnection.getInstanta(listaUseri);
        System.out.println(connection.toString());
        listaUseri.add("Tu");

        List<String> listaUseri2 = new ArrayList<>();
        listaUseri2.add("Doar tu");
        DroneConnection connection2 = DroneConnection.getInstanta(listaUseri2);
        System.out.println(connection2.toString());

        System.out.println("Threadsafe:");
        //threadsafe:
        Thread t1 = new Thread(()->{
            DroneConnection connection3 = DroneConnection.getInstanta(listaUseri);
            System.out.println(connection3.toString());
        });
        Thread t2 = new Thread(()->{
            DroneConnection connection5 = DroneConnection.getInstanta(listaUseri2);
            System.out.println(connection5.toString());
        });
        t1.start();
        t2.start();
    }
}