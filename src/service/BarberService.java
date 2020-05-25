package service;

import domains.Barber;
import ennumerations.Specialization;
public interface BarberService {
    void createBarber();
    void showListBarber();
    void updateBarber(long id, String atributo, String update);

    void updateBarber(long id, String name, String nickname, Specialization specialization);

    void deleteBarber(long id);
    Boolean searchListBarber(Long id);
}
