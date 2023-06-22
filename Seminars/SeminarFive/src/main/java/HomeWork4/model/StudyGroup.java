package HomeWork4.model;

import HomeWork4.repository.TeacherRepository;
import HomeWork4.service.StudentGroupIterator;
import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Data
public class StudyGroup {

    private final String groupId;

    public StudyGroup(String groupId) {
        this.groupId = groupId;
    }
}
//
//    public void addStudent(Student student){
//        studentList.add(student);
//    }
//
//
//    public Iterator<Student> iterator() {
//        return new StudentGroupIterator(studentList);
//    }
//
//}


//    @Override
//    public Iterator<Student> iterator() {
//        return new StudentGroupIterator(studentList);
//    }
//
//    public void remove(String fullName) {
//        for (Student student : studentList) {
//            if (student.getFullName().equals(fullName)) {
//                studentList.remove(student);
//                return;
//            }
//        }
//    }
//}
