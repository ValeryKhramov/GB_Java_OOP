package SeminarFour.service;


import SeminarFour.model.User;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        String familyOneName = o1.getFullName().split("\\s")[1];
        String familySecondName = o2.getFullName().split("\\s")[1];
        return familyOneName.compareTo(familySecondName);

    }
}


