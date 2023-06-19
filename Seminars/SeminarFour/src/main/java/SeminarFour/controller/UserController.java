package SeminarFour.controller;

import SeminarFour.model.User;

import java.util.List;

public interface UserController<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    void removeUser(String fullNAme);
    List<T> getAllSortUsersByFamilyAge();
    List<T> getAll();
    void edit(String fullName, Integer age, String phoneNumber);
}
