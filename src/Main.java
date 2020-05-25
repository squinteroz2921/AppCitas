import domains.Barber;
import ennumerations.Specialization;
//import service.BarberService;
//import service.implement.BarberServiceImplement;
//import service.implement.BarbersShopServiceImplement;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Implementacion de los metodos de la Barberia//////
//        BarberService barberServiceImplement=new BarberServiceImplement();
//        barberServiceImplement.createBarber(1l,"Sebastiao","lol",Specialization.BARBA_CORTE);
//        barberServiceImplement.createBarber(2l,"Danielao","lolazo",Specialization.BARBA_CORTE);
//        barberServiceImplement.showListBarber();
//        barberServiceImplement.updateBarber(1l,"Carolao","Lopez",Specialization.BARBA);
//        barberServiceImplement.showListBarber();
//        barberServiceImplement.deleteBarber(1l);
        Barber barber1=new Barber(1l,"A","A",Specialization.BARBA);
        Barber barber2=new Barber(2l,"B","B",Specialization.BARBA);
        Barber barber3=new Barber(3l,"C","C",Specialization.BARBA);


        HashMap<Long, Barber> mapTest=new HashMap<>();
        mapTest.put(1l,barber1);
        mapTest.put(2l,barber2);
        mapTest.put(3l,barber3);
        System.out.println(mapTest.keySet());


    }
}
