package SeminarFour.service;


import SeminarFour.model.Teacher;
import SeminarFour.repository.UserRepository;

import java.util.Collections;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final UserRepository<Teacher> teacherRepository;

    public TeacherService(UserRepository<Teacher> teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id =   teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age,phoneNumber);
        teacherRepository.add(teacher);

    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        List<Teacher> teachers = teacherRepository.getAll();
        Collections.sort(teachers);
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        List<Teacher>  teachers = teacherRepository.getAll();
        teachers.sort(new UserComparator<Teacher>());
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyAge() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        return teachers;
    }

    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        for (Teacher teacher : teacherRepository.getAll()) {
            if (teacher.getFullName().equals(fullName)) {
                System.out.println("(edit:)'"+fullName+ "' <- запись найдена");
                System.out.println("(edit:)*поля age и phoneNumber обновлены*");
                Long id = teacher.getId();
                teacherRepository.remove(fullName);
                Teacher editedTeacher = new Teacher(id, fullName, age, phoneNumber);
                teacherRepository.add(editedTeacher);
                return;
            }
        }
        System.out.println("(edit:)'"+fullName+ "' <- запись не найдена");
    }

}
