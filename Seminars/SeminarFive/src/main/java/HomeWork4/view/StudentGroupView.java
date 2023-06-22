package HomeWork4.view;

import HomeWork4.controllers.StudyGroupController;
import HomeWork4.model.Student;
import HomeWork4.model.User;
import HomeWork4.repository.StudentsRepository;
import HomeWork4.repository.TeacherRepository;

import java.util.List;

public class StudentGroupView {

    private final StudyGroupController groupController;

    public StudentGroupView(StudyGroupController groupController) {
        this.groupController = groupController;

    }
    public void sendOnConsole(String sortType) {
        List<User> groupList = switch (sortType) {
            case SortType.NONE -> groupController.getAll();
            case SortType.STUDENT -> groupController.getStudent();
            case SortType.TEASHER -> groupController.getTeacher();
            default -> null;
        };
        if (groupList == null)  {
            System.out.println("group is null");
            return;
        }
        System.out.println("=====================");
        for (User user : groupList) {
            System.out.println(user);
        }
        System.out.println("=====================");
    }
    public void addUsers(StudentsRepository students, TeacherRepository teachers){
        groupController.addUsers(students, teachers);
    }

//    public List<User> getAll(){
//        return groupController.getAll();
//    }
//
//    public void PrintAll(){
//        for (User user : groupController.getAll()) {
//            System.out.println(user);
//        };
//    }
//    public void PrintAllStudents(){
//        for (User user : groupController.getStudent()) {
//            System.out.println(user);
//        };
//    }
//    public List<User> getStudent(){
//        return groupController.getStudent();
//    }


}
