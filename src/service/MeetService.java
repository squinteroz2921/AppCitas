package service;

import domains.Meet;

public interface MeetService {
    void createMeet(Meet meet);
    void updateMeet(long id, String atributo, String update);
    void deleteMeet(long id);
    void showListMeet();
}
