package HomeWork4.controllers;

import HomeWork4.model.Student;
import HomeWork4.model.Teacher;
import HomeWork4.model.User;
import HomeWork4.repository.StudentsRepository;
import HomeWork4.repository.TeacherRepository;
import HomeWork4.service.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupController {

    private final StudyGroupService groupService;

    public StudyGroupController(StudyGroupService groupService) {
        this.groupService = groupService;
    }

    public void addUsers(StudentsRepository students, TeacherRepository teachers) {
        groupService.addUsers(students, teachers);
    }

    public List<User> getAll() {
        return groupService.getAll();
    }

    public List<User> getStudent() {
        List<User> students = new ArrayList<>();
        for (User user : groupService.getAll()) {
            if (user.getClass().equals(Student.class)) {
                students.add(user);
            }

        }
        return students;


    }

    public List<User> getTeacher() {
        List<User> teachers = new ArrayList<>();
        for (User user : groupService.getAll()) {
            if (user.getClass().equals(Teacher.class)) {
                teachers.add(user);
            }

        }
        return teachers;
    }
}
