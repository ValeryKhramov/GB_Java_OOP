package SeminarTwo;

public class Human extends Actor {
    private int age;
    private String address;

    public String orderStatus() {
        if (isTakeOrder) {
            return "Заказ получен!";
        }
        if (isMakeOrder) {
            return "Заказ сделан, ожидает получения!";
        }
        return "Заказ еще не сделан!";
    }

    @Override
    public String toString() {
        return String.format("\nКлиент : %s , возраст %d, адрес: %s - %s"
                , name, age, address, orderStatus());
    }

    public Human(String name, int age, String address) {
        super(name);
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
