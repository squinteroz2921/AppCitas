package service;

import domains.Barbershop;

public interface BarberShopService {
    // se definen las operaciones que se pueden hacer en los modelos del domain, siempre son publicos
    void createBarberShop(Barbershop barbershop);
    void showListBarberShop();
    void updateBarberShop(long id, String atributo, String update);
    void deleteBarberShop(long id);
}
