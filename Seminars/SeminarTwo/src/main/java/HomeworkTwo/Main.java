package HomeworkTwo;

import SeminarTwo.Human;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Иван", 37, "Москва");
        Human human2 = new Human("Петр", 23, "Ростов");
        Human human3 = new Human("Сергей", 21, "Самара");
        Human human4 = new Human("Валерий", 22, "Саранск");
        Human human5 = new Human("Владимир", 54, "Владивосток");

        Market shop = new Market();

        shop.acceptToMarket(human1);
        shop.acceptToMarket(human2);
        shop.acceptToMarket(human3);
        shop.acceptToMarket(human4);
        shop.acceptToMarket(human5);

        shop.update();

        shop.takeInQueue(human1);
        shop.takeInQueue(human2);
/*        shop.takeInQueue(human3);
        shop.takeInQueue(human4);
        shop.takeInQueue(human5);*/

        shop.update();

        shop.takeOrders();

        shop.update();

        shop.giveOrders();

        shop.releaseFromQueue();


        shop.update();
        shop.releaseFromMarket(shop.getAcceptInMarket());
        shop.update();








    }
}
