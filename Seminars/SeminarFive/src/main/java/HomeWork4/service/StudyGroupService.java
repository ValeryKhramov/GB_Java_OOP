package HomeWork4.service;

import HomeWork4.model.Student;
import HomeWork4.model.StudyGroup;
import HomeWork4.model.Teacher;
import HomeWork4.model.User;
import HomeWork4.repository.StudentsRepository;
import HomeWork4.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
//    private final List<User> userList;

//    private List<Student> students;

    private StudentsRepository students;

    private TeacherRepository teachers;

    private StudyGroup group;

    List<User> StudyList;


    public StudyGroupService(StudyGroup group, StudentsRepository students, TeacherRepository teachers) {
        this.students = students;
        this.teachers = teachers;
        this.group = group;
        StudyList = new ArrayList<>();
    }

    public void addUsers(StudentsRepository students, TeacherRepository teachers){
        for (Student student : students.getAll()) {
            if (student.getGroupId().equals(group.getGroupId())){
                StudyList.add(student);
            }

        }
        for (Teacher teacher: teachers.getAll()) {
            if (teacher.getGroupId().equals(group.getGroupId())){
                StudyList.add(teacher);
                break;
            }

        }



    }


    public List<User> getAll(){
        return StudyList;
    }
//
//    public List<User> create(Teacher teacher){
//        userList.add(teacher);
//        userList.addAll(students);
//        return userList;
//    }
//    public void print(){
//        for (User user : userList) {
//            System.out.println(user);
//
//        }
//    }

}
