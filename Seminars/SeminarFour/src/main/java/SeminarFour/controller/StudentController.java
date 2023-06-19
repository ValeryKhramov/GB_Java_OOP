package SeminarFour.controller;

import SeminarFour.service.StudentService;
import SeminarFour.model.Student;
import SeminarFour.service.UserService;

import java.util.List;

public class StudentController implements UserController<Student>{

    public UserService<Student> studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentService.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Student> getAllSortUsers() {
        return studentService.getAllSortUsers();
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        return studentService.getAllSortUsersByFamilyName();
    }

    @Override
    public void removeUser(String fullName) {
        studentService.removeUser(fullName);
    }

    @Override
    public List<Student> getAllSortUsersByFamilyAge() {
        return studentService.getAllSortUsersByFamilyAge();
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        studentService.edit(fullName, age, phoneNumber);
    }


}
