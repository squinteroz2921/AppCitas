import domains.Barber;
import domains.Client;
import ennumerations.Specialization;
import service.BarberService;
import service.BarberShopService;
import service.ClientService;
import service.MeetService;
import service.implement.BarberServiceImplement;
import service.implement.BarbersShopServiceImplement;
import service.implement.ClientServiceImplement;
import service.implement.MeetServiceImplement;
//import service.BarberService;
//import service.implement.BarberServiceImplement;
//import service.implement.BarbersShopServiceImplement;

import java.lang.reflect.Field;
import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Main {
    BarberService barberServiceImplement = new BarberServiceImplement();
    BarberShopService barberShopServiceImplement = new BarbersShopServiceImplement();
    ClientService clientServiceImplement = new ClientServiceImplement();
    MeetService meetServiceImplement= new MeetServiceImplement();

    public static void main(String[] args) {
        //Implementacion de los metodos de la Barberia//////
        Scanner userInput = new Scanner(System.in);
//        BarberService barberServiceImplement=new BarberServiceImplement();
//        barberServiceImplement.createBarber(1l,"Sebastiao","lol",Specialization.BARBA_CORTE);
//        barberServiceImplement.createBarber(2l,"Danielao","lolazo",Specialization.BARBA_CORTE);
//        barberServiceImplement.showListBarber();
//        barberServiceImplement.updateBarber(1l,"Carolao","Lopez",Specialization.BARBA);
//        barberServiceImplement.showListBarber();
//        barberServiceImplement.deleteBarber(1l);
        Barber barber1 = new Barber(1l, "A", "A", Specialization.BARBA);
        Barber barber2 = new Barber(2l, "B", "B", Specialization.BARBA);
        Barber barber3 = new Barber(3l, "C", "C", Specialization.BARBA);

        Client client1 = new Client(1L, "SebaSeba", "3001234567");
        Client client2 = new Client(2L, "DaniDani", "3009876543");



        HashMap<Long, Barber> mapTest = new HashMap<>();
        mapTest.put(1l, barber1);
        mapTest.put(2l, barber2);
        mapTest.put(3l, barber3);
        System.out.println(mapTest.keySet());
        System.out.println("///////////////");
        System.out.println(mapTest.entrySet());
        for (Map.Entry<Long, Barber> entry : mapTest.entrySet()) {
            System.out.println(entry.getKey() + ";" + entry.getValue());
        }



    }


}

