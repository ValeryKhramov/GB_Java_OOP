package SeminarFour.view;

import SeminarFour.model.User;

public interface UserView<T extends User> {

    void sendOnConsole(String sortType); //GET
    void create(String fullName, Integer age, String phoneNumber); // POST
    void removeUser(String fullName); // DELETE
    void edit(String fullName, Integer age, String phoneNumber);
}
