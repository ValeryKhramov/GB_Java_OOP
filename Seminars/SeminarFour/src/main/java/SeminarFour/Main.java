package SeminarFour;

import SeminarFour.controller.StudentController;
import SeminarFour.controller.TeacherController;
import SeminarFour.model.Teacher;
import SeminarFour.repository.StudentRepository;
import SeminarFour.repository.TeacherRepository;
import SeminarFour.repository.UserRepository;
import SeminarFour.service.StudentService;
import SeminarFour.service.TeacherService;
import SeminarFour.service.UserService;
import SeminarFour.view.SortType;
import SeminarFour.view.StudentView;
import SeminarFour.view.TeacherView;


public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
        TeacherView teacherView = getTeacherView();

//----------------------------------------------------------------------
        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        view.sendOnConsole(SortType.NONE);
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");
        view.sendOnConsole(SortType.NONE);
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.FAMILY);
        view.sendOnConsole(SortType.AGE);

        teacherView.create("Everett Ford", 31, "110");
        teacherView.create("Derick Leonard", 45, "111");
        teacherView.create("Camron Quinn", 54, "113");
        teacherView.sendOnConsole(SortType.NONE);
        teacherView.create("Jordan Booker", 27,"115");
        teacherView.create("Dale Mcdonald", 24,"118");
        teacherView.edit("Everett Ford", 22, "333");
        teacherView.sendOnConsole(SortType.NONE);
        teacherView.sendOnConsole(SortType.NAME);
        teacherView.sendOnConsole(SortType.FAMILY);
        teacherView.sendOnConsole(SortType.AGE);


    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }
}
