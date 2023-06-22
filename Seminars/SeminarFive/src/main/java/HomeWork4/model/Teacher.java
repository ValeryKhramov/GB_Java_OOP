package HomeWork4.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString

public class Teacher extends User{

    private String subject; // предмет
    public Teacher(Long id, String fullName, Integer age, String phoneNumber, String groupId) {
        super(id, fullName, age, phoneNumber, groupId);
    }


    public int compareTo(Teacher o) {
        return getFullName().compareTo(o.getFullName());
    }

    @Override
    public String toString() {

        return String.format("%s, %s, %s, %s", getId(), getFullName(), getAge(), getPhoneNumber());

    }
}
