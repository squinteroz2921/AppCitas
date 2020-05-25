import domains.Barber;
import domains.Barbershop;
import domains.Client;
import domains.Meet;
import ennumerations.DateType;
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Main {
    private static final BarberService barberServiceImplement = new BarberServiceImplement();
    private static final BarberShopService barberShopServiceImplement = new BarbersShopServiceImplement();
    private static final ClientService clientServiceImplement = new ClientServiceImplement();
    private static final MeetService meetServiceImplement = new MeetServiceImplement();

    public static void main(String[] args) {
//        barberServiceImplement.createBarber(getDatosBarber());
        System.out.println("Creando Barberos...");
        barberServiceImplement.createBarber(new Barber(1l, "Sebastiao", "lol",
                Specialization.BARBA_CORTE));
        barberServiceImplement.createBarber(new Barber(2l, "Daniel", "Gaviria",
                Specialization.BARBA));
        barberServiceImplement.createBarber(new Barber(3l, "Javier", "Lorenzo",
                Specialization.CORTE));
        barberServiceImplement.showListBarber();
        System.out.println("////////////////////////////");
        System.out.println("Creando Barberias..");
        barberShopServiceImplement.createBarberShop(new Barbershop(1l, "TresPaBarber",
                "Carrera 77 # 60-45", barberServiceImplement.listBarber()));
        barberShopServiceImplement.showListBarberShop();
        clientServiceImplement.createClient(new Client(1l, "PedroAntonio", "319 254 0028"));
        clientServiceImplement.createClient(new Client(2l, "Ismael", "340 254 0031"));
        clientServiceImplement.showListClient();
        System.out.println("////////////////////////////");
        System.out.println("Creando Cita..");
        meetServiceImplement.createMeet(new Meet(1l, new Date(120, 4, 25, 10, 30),
                (barberServiceImplement.listBarber().get(1)), (clientServiceImplement.listClient().get(1)),
                DateType.MAÑANA));
        meetServiceImplement.showListMeet();

//        for (Map.Entry<Long, Barber> entry : mapTest.entrySet()) {
//            System.out.println(entry.getKey() + ";" + entry.getValue());
//        }

    }

    public static Barber getDatosBarber() {
        Object specializationObjectbarber1 = new Object();
        Scanner userInput = new Scanner(System.in);
        boolean eleccion = true;
        System.out.println(" por favor ingrese el id del barbero");
        Long idbarber1 = userInput.nextLong();
        userInput.nextLine();
        System.out.println(" por favor ingrese el nombre del barbero");
        String nombrebarber1 = userInput.nextLine();

        System.out.println(" por favor ingrese el nickname del barbero");
        String nicknamebarber1 = userInput.nextLine();
        System.out.println(" por favor ingrese la especializacion del barbero");

        do {
            String specializationbarber1 = userInput.nextLine();

            specializationbarber1 = specializationbarber1.toUpperCase();


            switch (specializationbarber1) {
                case "BARBA" -> {
                    specializationObjectbarber1 = Specialization.BARBA;
                    eleccion = false;
                }
                case "CORTE" -> {
                    specializationObjectbarber1 = Specialization.CORTE;
                    eleccion = false;
                }
                case "BARBA_CORTE" -> {
                    specializationObjectbarber1 = Specialization.BARBA_CORTE;
                    eleccion = false;
                }
                default -> System.out.println("Ingresaste una especializacion errada!\n" +
                        "Las opciones son BARBA, CORTE, BARBA CORTE\n");
            }

        } while (eleccion);
        return new Barber(idbarber1, nombrebarber1, nicknamebarber1, (Specialization) specializationObjectbarber1);
    }

    public static Barbershop getBarbershop() {
        Scanner userInput = new Scanner(System.in);
        System.out.println(" por favor ingrese el id de la barberia");
        Long idBarbershop = userInput.nextLong();
        userInput.nextLine();
        System.out.println(" por favor ingrese el nombre de la barberia");
        String nameBarbershop = userInput.nextLine();
        System.out.println(" por favor ingrese la direccion de la barberia");
        String addressBarbershop = userInput.nextLine();
        System.out.println(" por favor ingrese la especializacion del barbero");
        return new Barbershop(idBarbershop, nameBarbershop, addressBarbershop, barberServiceImplement.listBarber());
    }

}

