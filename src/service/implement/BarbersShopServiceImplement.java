package service.implement;

import domains.Barber;
import domains.Barbershop;
import ennumerations.Specialization;
import service.BarberShopService;

import java.util.HashMap;
// se debe de llamar la interfaz con el comando implements, para sobreesscribir loe metodos de la interfaz

public class BarbersShopServiceImplement implements BarberShopService {
    HashMap<Long, Barbershop> barbershopHashMap = new HashMap<>();

    @Override
    public void createBarberShop(Barbershop barbershop) {
        System.out.println("Creando Barberias...");
        barbershopHashMap.put(barbershop.getId(), barbershop);
        System.out.println(barbershopHashMap.get(barbershop.getId()));
    }

    @Override
    public void showListBarberShop() {
        System.out.println("//////////////////////////////////////");
        System.out.println("Mostrando Lista de Barberias...");
        barbershopHashMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));
    }

    @Override
    public void updateBarberShop(long id, String atributo, String update) {
        if (searchListBarber(id)) {
            Barbershop barbershop = barbershopHashMap.get(id); // se obtiene el valor segun la clave ingresada
            switch (atributo) {
                case "name":
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    barbershop.setName(update);
                    break;
                case "address":
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    barbershop.setAddress(update);
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
    public void deleteBarberShop(long id) {
        System.out.println("//////////////////////////////////////");
        System.out.println("Eliminando Barbero de la lista...");
        if (searchListBarber(id)) {
            barbershopHashMap.remove(id);
            showListBarberShop();
        } else {
            System.out.println("el id ingresado " + id +
                    " no es valido, no se puede eliminar de la lista");
        }

    }
    public Boolean searchListBarber(Long id) {
        if (barbershopHashMap.get(id) == null) {
            return false; // el id ingresado no es valido
        } else {
            return true; // el id ingresado es valido
        }
    }
}
