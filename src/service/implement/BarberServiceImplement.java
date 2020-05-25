package service.implement;

import domains.Barber;
import ennumerations.Specialization;
import service.BarberService;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BarberServiceImplement implements BarberService {
    HashMap<Long, Barber> barberHashMap = new HashMap<>();

    @Override
    public void createBarber(Barber barber) {
        System.out.println("//////////////////////////////////////");
        System.out.println("Creando Barbero...");
        barberHashMap.put(barber.getId(), barber);
        System.out.println(barberHashMap.get(barber.getId()));
    }


    @Override
    public void showListBarber() {
        System.out.println("//////////////////////////////////////");
        System.out.println("Mostrando Lista de Barberos...");
        barberHashMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));
    }

    @Override
    public void updateBarber(long id, String atributo, String update) {
        if (searchListBarber(id)) {
            Barber barber = barberHashMap.get(id); // se obtiene el valor segun la clave ingresada
            switch (atributo) {
                case "nombre":
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    barber.setName(update);
                    break;
                case "nickname":
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    barber.setNickname(update);
                    break;

                case "specialization":
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    if (atributo.equals("BARBA")) {
                        barber.setSpecialization(Specialization.BARBA);
                    } else if (atributo.equals("CORTE")) {
                        barber.setSpecialization(Specialization.CORTE);
                    } else if (atributo.equals("BARBA_CORTE")) {
                        barber.setSpecialization(Specialization.BARBA_CORTE);
                    } else {
                        System.out.println("No se ha podido Actualizar el atributo " +
                                "especialización debido a que no se encuentra en la lista");
                    }
                    break;
                default:
                    System.out.println("//////////////////////////////////////");
                    System.out.println("No se ha podido Actualizar el atributo " +
                            "debido a que no es un atributo del Object");
            }
        } else {
            System.out.println("//////////////////////////////////////");
            System.out.println("No se ha podido Actualizar el atributo");
        }


// de esta manera se obtienen los atributos de un objeto
//        Class clas = object.getClass();
//        List<String> atributeList = new ArrayList<String>();
//        for (Field field : clas.getDeclaredFields()) {
//            atributeList.add(field.getName());
//        }
//
//        atributeList.stream().filter(z -> z.equals(atribute)).forEach(System.out::println);
//        atributeList.stream().forEach(System.out::println);
//        return atribute;
    }

//    @Override
//    public void updateBarber(long id, String name, String nickname, Specialization specialization) {
//        System.out.println("//////////////////////////////////////");
//        System.out.println("Actualizando lista...");
//        Barber nodo = new Barber(id, name, nickname, specialization);
//        if (searchListBarber(id)) {
//            barberHashMap.put(nodo.getId(), nodo);
//            System.out.println("el id " + id + " fue actualizado");
//            barberHashMap.keySet();
//        } else {
//            System.out.println("el id ingresado " + id +
//                    " no es valido, no se puede realizar el update");
//
//
////            if (Trabajadores.containsKey(Rut)) {
////
////                System.out.println("Nuevo R U T de Trabajador: ");
////                String rutx = sc.next();
////                // Removemos del HashMap la antigua clave - valor
////                Trabajadores.remove(Rut);
////                System.out.println("Nuevo Nombre de Trabajador: ");
////                String name = sc.next();
////                System.out.println("Nuevo Cargo de Trabajador: ");
////                String cargo = sc.next();
////                //Agregamos Nuevo Elemento con clave rutx
////                Trabajadores.put(rutx, new worker(name,cargo) );
////            } else {
////                System.out.println("No hay trabajadores con este R U T");
////            }
//        }
//    }

    @Override
    public void deleteBarber(long id) {
        System.out.println("//////////////////////////////////////");
        System.out.println("Eliminando Barbero de la lista...");
        if (searchListBarber(id)) {
            barberHashMap.remove(id);
            showListBarber();
        } else {
            System.out.println("el id ingresado " + id +
                    " no es valido, no se puede eliminar de la lista");
        }
    }

    @Override
    public List<Barber> listBarber() {
        List<Barber> barberList = new ArrayList<Barber>(barberHashMap.values().stream().collect(Collectors.toList()));
        return barberList;
    }


    public Boolean searchListBarber(Long id) {
        if (barberHashMap.get(id) == null) {
            return false; // el id ingresado no es valido
        } else {
            return true; // el id ingresado es valido
        }
    }

}
