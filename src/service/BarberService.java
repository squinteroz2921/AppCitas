package service;

import domains.Barber;
import ennumerations.Specialization;

import java.util.List;

public interface BarberService {
    void createBarber(Barber baber);
    void showListBarber();
    void updateBarber(long id, String atributo, String update);
    void deleteBarber(long id);
    List <Barber> listBarber();
}
