package SeminarFour.controller;

import SeminarFour.model.Teacher;
import SeminarFour.service.TeacherService;
import SeminarFour.service.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
    UserService<Teacher> teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherService.create(fullName,age,phoneNumber);
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return teacherService.getAllSortUsers();
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return teacherService.getAllSortUsersByFamilyName();
    }

    @Override
    public void removeUser(String fullNAme) {
        teacherService.removeUser(fullNAme);
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyAge() {
        return teacherService.getAllSortUsersByFamilyAge();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        teacherService.edit(fullName, age, phoneNumber);
    }
}
