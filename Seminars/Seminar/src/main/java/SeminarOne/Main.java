package SeminarOne;
// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
// содержащий в себе методы initProducts (List<Product>),
// сохраняющий в себе список исходных продуктов и getProduct(String name)

// Сделать класс Товар абстрактным, создать несколько наследников
// (к примеру: БутылкаВоды), сделать абстрактным ТорговыйАвтомат и
// реализовать класс какого-то одного типа ТорговыйАвтомата
// (пример: ПродающийБутылкиВодыАвтомат)

import HomeworkOne.HotDrink;
import HomeworkOne.HotDrinkVending;

//1. Попросить вначале переопределить метод toString для Товара,
//запустить программу, после переопредить для наследника этот метод, после
//запуска обратить внимание на изменение поведения.
//2. Попросить создать перегруженный метод выдачи товара ТорговымАвтоматом,
//дополнив дополнительным входным параметром (пример: getProduct(String name))
//выдающий товар по имени, создать метод возвращающий товар по именик каому-либо
//параметру товара getProduct(String name, int value)
public class Main {
    public static void main(String[] args) {
        FruitVending fruitVending = new FruitVending();
        Product product1 = new Apple("Apple", 20D, 1L);
        Product product2 = new Orange("Orange", 30D, 2L);
        Product product3 = new Banana("Banana", 25D, 3L);


        fruitVending.addProduct(product1);
        fruitVending.addProduct(product2);
        fruitVending.addProduct(product3);

        System.out.println(fruitVending.getProduct("Apple"));
        System.out.println(fruitVending.getProduct("Orange"));
        System.out.println(fruitVending.getProduct(3L));


        HotDrinkVending drinkVending = new HotDrinkVending();
        Product drink1  = new HotDrink("Latte", 15D, 4L,0.5D,100);
        Product drink2  = new HotDrink("Green_Tea", 17D, 5L,0.3D,88);
        Product drink3  = new HotDrink("Black_Tea", 19D, 6L,0.4D,95);

        drinkVending.addProduct(drink1);
        drinkVending.addProduct(drink2);
        drinkVending.addProduct(drink3);
        System.out.println(drinkVending.getProduct("Latte"));
        System.out.println(drinkVending.getProduct(88));
        System.out.println(drinkVending.getProduct(0.4D));

    }

}
