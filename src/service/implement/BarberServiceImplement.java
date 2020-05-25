package service.implement;

import domains.Barber;
import ennumerations.Specialization;
import service.BarberService;

import java.util.HashMap;

public class BarberServiceImplement implements BarberService {
    HashMap<Long, Barber> barberHashMap = new HashMap<>();

    @Override
    public void createBarber() {
//        System.out.println("//////////////////////////////////////");
//        System.out.println("Creando Barbero...");
//        Barber nodo = new Barber(id, name, nickname, specialization);
//        barberHashMap.put(nodo.getId(), nodo);
//        System.out.println(barberHashMap.get(nodo.getId()));
    }

    @Override
    public void createBarber() {

    }

    @Override
    public void showListBarber() {
        System.out.println("//////////////////////////////////////");
        System.out.println("Mostrando Lista de Barberos...");
        barberHashMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));
    }

    @Override
    public void updateBarber(long id, String atributo, String update) {

    }

    @Override
    public void updateBarber(long id, String name, String nickname, Specialization specialization) {
        System.out.println("//////////////////////////////////////");
        System.out.println("Actualizando lista...");
        Barber nodo = new Barber(id, name, nickname, specialization);
        if (searchListBarber(id)) {
            barberHashMap.put(nodo.getId(), nodo);
            System.out.println("el id "+id+ " fue actualizado");
            barberHashMap.keySet();
        }else{
            System.out.println("el id ingresado " + id +
                    " no es valido, no se puede realizar el update");


//            if (Trabajadores.containsKey(Rut)) {
//
//                System.out.println("Nuevo R U T de Trabajador: ");
//                String rutx = sc.next();
//                // Removemos del HashMap la antigua clave - valor
//                Trabajadores.remove(Rut);
//                System.out.println("Nuevo Nombre de Trabajador: ");
//                String name = sc.next();
//                System.out.println("Nuevo Cargo de Trabajador: ");
//                String cargo = sc.next();
//                //Agregamos Nuevo Elemento con clave rutx
//                Trabajadores.put(rutx, new worker(name,cargo) );
//            } else {
//                System.out.println("No hay trabajadores con este R U T");
//            }
        }
    }

    @Override
    public void deleteBarber(long id) {
        System.out.println("//////////////////////////////////////");
        System.out.println("Eliminando Barbero de la lista...");
        if (searchListBarber(id)) {
            barberHashMap.remove(id);
            showListBarber();
        }else{
            System.out.println("el id ingresado " + id +
                    " no es valido, no se puede eliminar de la lista");
        }
    }

    @Override
    public Boolean searchListBarber(Long id) {
        if (barberHashMap.get(id) == null) {
            return false; // el id ingresado no es valido
        } else {
            return true; // el id ingresado es valido
        }
    }

}
