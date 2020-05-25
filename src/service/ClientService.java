package service;

import domains.Barber;
import domains.Client;

import java.util.List;

public interface ClientService {
    void createClient(Client client);
    void updateClient(long id, String atributo, String update);
    void deleteClient(long id);
    void showListClient();
    List<Client> listClient();
}
