package HomeWork4;

import HomeWork4.controllers.StudentController;
import HomeWork4.controllers.StudyGroupController;
import HomeWork4.controllers.TeacherController;
import HomeWork4.model.Student;
import HomeWork4.model.StudyGroup;
import HomeWork4.model.Teacher;
import HomeWork4.repository.StudentsRepository;
import HomeWork4.repository.TeacherRepository;
import HomeWork4.service.StudentService;
import HomeWork4.service.StudyGroupService;
import HomeWork4.service.TeacherServise;
import HomeWork4.view.SortType;
import HomeWork4.view.StudentGroupView;
import HomeWork4.view.StudentView;
import HomeWork4.view.TeacherView;

public class main {
    public static void main(String[] args) {


        TeacherRepository repository = new TeacherRepository();
        TeacherServise service = new TeacherServise(repository);
        TeacherController controller = new TeacherController(service);
        TeacherView view = new TeacherView(controller);
//----------------------------------------------------------------------

        view.create("Andrei Andrei", 55, "02", "5");
        view.create("Elena Elena", 45, "03", "5");
        view.create("Maria Maria", 20, "112", "2");
        view.sendOnConsole(SortType.NONE);

//        view.sendOnConsole(SortType.NONE);
//        view.sendOnConsole(SortType.NAME);
//        view.sendOnConsole(SortType.FAMILY);
//        view.sendOnConsole(SortType.AGE);
//        view.editTeacher(2L);
//        view.sendOnConsole(SortType.NONE);


        StudentsRepository studentsRepository = new StudentsRepository();
        StudentService studentService = new StudentService(studentsRepository);
        StudentController studentController = new StudentController(studentService);
        StudentView studentView = new StudentView(studentController);
//----------------------------------------------------------------------

        studentView.create("Ivan Morozov", 18, "02", "2");
        studentView.create("Petr Vorobev", 19, "03", "5");
        studentView.create("Sidor Sidorov", 20, "112","5");
        studentView.sendOnConsole(SortType.NONE);

//        view.sendOnConsole(SortType.NONE);
//        view.sendOnConsole(SortType.NAME);
//        view.sendOnConsole(SortType.FAMILY);
//        view.sendOnConsole(SortType.AGE);

        StudyGroup group = new StudyGroup("5");
        StudyGroupService groupService = new StudyGroupService(group, studentsRepository, repository);
        StudyGroupController groupController = new StudyGroupController(groupService);
        StudentGroupView groupView = new StudentGroupView(groupController);

        groupView.addUsers(studentsRepository, repository);
        groupView.sendOnConsole(SortType.NONE);
        groupView.sendOnConsole(SortType.STUDENT);
        groupView.sendOnConsole(SortType.TEASHER);


    }




}


