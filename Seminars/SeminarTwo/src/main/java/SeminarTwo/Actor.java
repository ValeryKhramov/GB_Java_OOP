package SeminarTwo;

public  abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        System.out.println("-".repeat(name.length()+ 14));
        System.out.println(name + " сделал заказ.");
        System.out.println("-".repeat(name.length()+ 14));
        isMakeOrder = true;

    }

    @Override
    public void setTakeOrder() {
        System.out.println("-".repeat(name.length()+ 14));
        System.out.println(name + " забрал заказ.");
        System.out.println("-".repeat(name.length()+ 14));
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

}
