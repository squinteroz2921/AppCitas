package service.implement;

import domains.Barber;
import domains.Client;
import domains.Meet;
import ennumerations.DateType;
import service.MeetService;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class MeetServiceImplement implements MeetService {
    HashMap<Long, Meet> MeetHashMap = new HashMap<>();

    @Override
    public void createMeet(Meet meet) {
        System.out.println("//////////////////////////////////////");
        System.out.println("Creando Cita...");
        MeetHashMap.put(meet.getId(), meet);
        System.out.println(MeetHashMap.get(meet.getId()));
    }

    @Override
    public void updateMeet(long id, String atributo, String update) {
        if (searchListMeet(id)) {
            Meet meet = MeetHashMap.get(id); // se obtiene el valor segun la clave ingresada
            switch (atributo) {
                case "scheduleDate":
                    SimpleDateFormat pattern =new SimpleDateFormat("dd MMMMM yyyy HH:mm");
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    try {
                        meet.setSchedulDate(pattern.parse(update));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "dateType":
                    if (atributo.equals("MAÑANA")) {
                        meet.setDateType(DateType.MAÑANA);
                    } else if (atributo.equals("TARDE")) {
                        meet.setDateType(DateType.TARDE);
                    } else {
                        System.out.println("No se ha podido Actualizar el atributo " +
                                "especialización debido a que no se encuentra en la lista");
                    }
                case "barber":
                    Barber barber= new Barber(MeetHashMap.get(id).getBarber());
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    barber.setName(update);
                    break;
                case "client":
                    Client client = new Client(MeetHashMap.get(id).getClient());
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    client.setName(update);
                    break;

                default:
                    System.out.println("//////////////////////////////////////");
                    System.out.println("No se ha podido Actualizar el atributo " +
                            "debido a que no es un atributo del Object");
                    }


            }else{
            System.out.println("//////////////////////////////////////");
            System.out.println("No se ha podido Actualizar el atributo");
        }
        }


    @Override
    public void deleteMeet(long id) {
        System.out.println("//////////////////////////////////////");
        System.out.println("Eliminando Cita de la lista...");
        if (searchListMeet(id)) {
            MeetHashMap.remove(id);
            showListMeet();
        } else {
            System.out.println("el id ingresado " + id +
                    " no es valido, no se puede eliminar de la lista");
        }
    }

    @Override
    public void showListMeet() {
        System.out.println("//////////////////////////////////////");
        System.out.println("Mostrando Lista de Citas...");
        MeetHashMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));
    }

    public Boolean searchListMeet(long id) {
        if (MeetHashMap.get(id) == null) {
            return false; // el id ingresado no es valido
        } else {
            return true; // el id ingresado es valido
        }
    }
}
