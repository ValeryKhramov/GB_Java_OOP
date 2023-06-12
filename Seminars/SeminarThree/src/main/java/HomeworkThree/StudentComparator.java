package HomeworkThree;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String familyOneName = o1.getFullName().split("\\s")[1];
        String familySecondName = o2.getFullName().split("\\s")[1];
        return familyOneName.compareTo(familySecondName);

    }
}


