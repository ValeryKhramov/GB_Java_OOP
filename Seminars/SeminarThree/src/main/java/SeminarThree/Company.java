package SeminarThree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
    private User user;

    public Company(User user) {
        this.user = user;
    }
    private List<User> deepTree(User user){ // Мы берем пользователя, создаем список и отправляем туда пользователя,
        // проверяем есть ли у него подчинениые, идем в цикл и для каждого item проверяем, есть ли у него подчиненные,
        // используем рекурсию для глубинного погружения в дерево подчинения.
        List<User> subordinates = new ArrayList<>();
        subordinates.add(user);
        if(user.getSubordinate() == null || user.getSubordinate().size() == 0){
            return subordinates;
        }
        for (User item:user.getSubordinate()) {
            subordinates.addAll(deepTree(item));
        }
        return subordinates;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            List<User> iterUser = deepTree(user);
            Iterator<User> iterator = iterUser.iterator();
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public User next() {
                return iterator.next();
            }
        };
    }
}
