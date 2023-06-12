package HomeworkThree;

import java.util.Collections;
import java.util.Iterator;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }

    public void printAll() {
        System.out.println("-".repeat(50));
        for (Student student : studentRepository.getStudentGroup()) {
            System.out.println(student);
        }
        System.out.println("-".repeat(50));
    }

    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }

    public void sortFirstName() {
        Collections.sort(studentRepository.getStudentGroup().getStudentsList());
    }

    public void sortLastName() {
        studentRepository.getStudentGroup().getStudentsList().sort(new StudentComparator());

    }
}
