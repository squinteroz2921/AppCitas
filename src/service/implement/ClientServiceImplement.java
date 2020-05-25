package service.implement;

import domains.Barber;
import domains.Barbershop;
import domains.Client;
import service.ClientService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ClientServiceImplement implements ClientService {

    HashMap<Long, Client> ClientHashMap = new HashMap<>();

    @Override
    public void createClient(Client client) {
        System.out.println("//////////////////////////////////////");
        System.out.println("Creando Cliente...");
        ClientHashMap.put(client.getId(), client);
        System.out.println(ClientHashMap.get(client.getId()));
    }

    @Override
    public void updateClient(long id, String atributo, String update) {
        if (searchListBarber(id)) {
            Client client = ClientHashMap.get(id); // se obtiene el valor segun la clave ingresada
            switch (atributo) {
                case "name":
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    client.setName(update);
                    break;
                case "cellphone":
                    System.out.println("//////////////////////////////////////");
                    System.out.println("Actualizando lista...");
                    client.setCellphone(update);
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
    public void deleteClient(long id) {
        System.out.println("//////////////////////////////////////");
        System.out.println("Eliminando Cliente de la lista...");
        if (searchListBarber(id)) {
            ClientHashMap.remove(id);
            showListClient();
        } else {
            System.out.println("el id ingresado " + id +
                    " no es valido, no se puede eliminar de la lista");
        }
    }

    @Override
    public void showListClient() {
        System.out.println("//////////////////////////////////////");
        System.out.println("Mostrando Lista de Clientes...");
        ClientHashMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));
    }

    @Override
    public List<Client> listClient() {
        List<Client> clientList = new ArrayList<Client>(ClientHashMap.values().stream().collect(Collectors.toList()));
        return clientList;
    }

    public Boolean searchListBarber(Long id) {
        if (ClientHashMap.get(id) == null) {
            return false; // el id ingresado no es valido
        } else {
            return true; // el id ingresado es valido
        }
    }
}
