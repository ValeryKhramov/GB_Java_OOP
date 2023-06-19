package SeminarFour.view;

import SeminarFour.controller.UserController;
import SeminarFour.model.Student;
import SeminarFour.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType){
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByFamilyAge();
            default -> null;
        };
        if(teachers == null){
            System.out.println("students is null");
            return;
        }
        System.out.println("-".repeat(50));
        for (Teacher teacher : teachers) {
            System.out.println(teacher);

        }
        System.out.println("-".repeat(50));
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        controller.edit(fullName, age, phoneNumber);
    }
}
