package HomeWork4.view;

import HomeWork4.controllers.TeacherController;
import HomeWork4.controllers.UserController;
import HomeWork4.model.Student;
import HomeWork4.model.Teacher;
import lombok.Data;

import java.util.List;
@Data
public class TeacherView implements UserView<Teacher> {
    TeacherController controller;

    public TeacherView(TeacherController controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge ();
            default -> null;
        };
        if (teachers == null)  {
            System.out.println("teachers is null");
            return;
        }
        System.out.println("=====================");
        for (Teacher teacher: teachers) {
            System.out.println(teacher);
        }
        System.out.println("=====================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupId) {
        controller.create(fullName, age, phoneNumber, groupId);
    }

    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }

    public boolean editTeacher(Long id){
        controller.editTeacher(id);
        return true;
    }
}

