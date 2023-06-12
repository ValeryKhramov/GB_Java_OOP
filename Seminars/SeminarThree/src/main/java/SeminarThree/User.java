package SeminarThree;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private Integer age;
    private Staff subordinate;

    public Staff getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(Staff subordinate) {
        this.subordinate = subordinate;
    }

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Фамилия: %s, Возраст: %d.",firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        int compareFirstName = this.firstName.compareTo(o.firstName);
        if (compareFirstName != 0) return compareFirstName;

        int compareLastName = this.lastName.compareTo(o.lastName);
        if(compareLastName != 0) return compareLastName;

/*        if(this.age < o.age){
            return -1;
        } else if (this.age > o.age) {
            return 1;
        } else return 0;*/
        // return this.age.compareTo(o.age);  (Можно сделать вот так, более компактно)
        return this.age - o.age; //(Вот такой есть ещё вариант)
    }

}
