package SeminarFour.service;

import SeminarFour.model.User;

import java.util.List;

public interface UserService<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAll();
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAllSortUsersByFamilyAge();
    void removeUser(String s);
    void edit(String fullName, Integer age, String phoneNumber);
}
