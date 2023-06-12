package SeminarThree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Staff  implements Iterable<User>{
    List<User> users;

    public Staff() {
        this.users = new ArrayList<>();
    }
    public Staff addUser(User user){
        users.add(user);
        return this;

    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }
     public List<User> toList(){
        List<User> result = new ArrayList<>();
         for (User user:this) {
             result.add(user);
         }
         return result;
     }

    public int size() {
        return users.size();
    }
}
