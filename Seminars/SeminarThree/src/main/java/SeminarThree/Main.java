package SeminarThree;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.addUser(new User("Иван", "Петров", 32))
             .addUser(new User("Семен", "Сергеев", 21))
             .addUser(new User("Владимир", "Богомолов", 99))
             .addUser(new User("Иван","Петров", 20))
                .addUser(new User("Антон","Сидоров", 18));
        Staff staffDown = new Staff();
        staffDown.addUser(new User("Валентин", "Сергеев", 25));

        User user = new User("Сергей", "Иванов", 32);
        user.setSubordinate(staff);
        staffDown.addUser(user);
        User BigBoss = new User("Владимир", "Путин", 999);
        BigBoss.setSubordinate(staffDown);
        Company company = new Company(BigBoss);

        for (User item:company) {
            System.out.println(item);
        }

/*
        for (User user:staff) {
            System.out.println(user);
        }
        List<User> users = staff.toList();
        Collections.sort(users);
        System.out.println("-".repeat(50));
        for (User user:users) {
            System.out.println(user);
        }
*/

    }
}
