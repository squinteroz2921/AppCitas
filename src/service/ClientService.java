package service;

import domains.Client;

public interface ClientService {
    void createClient(Client client);
    void updateClient(long id, String atributo, String update);
    void deleteClient(long id);
    void showListClient();
}
