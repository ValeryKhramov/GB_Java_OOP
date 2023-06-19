package SeminarFour.repository;

import SeminarFour.model.Student;
import SeminarFour.model.User;

import java.util.List;

public interface UserRepository<T extends User> {
    List<T> getAll();
    void add(T t);
    void remove(String s);
    Long getMaxId();
}
