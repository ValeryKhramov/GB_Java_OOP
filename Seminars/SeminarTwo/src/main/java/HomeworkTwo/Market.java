package HomeworkTwo;

import SeminarTwo.Actor;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private final  List<Actor> acceptInMarket;
    private final List<Actor> acceptInQueue;


    public Market(){
        this.acceptInMarket = new LinkedList<>();
        this.acceptInQueue = new LinkedList<>();


    }
    public List<Actor> getAcceptInMarket() {

        return acceptInMarket;
    }

    public List<Actor> getAcceptInQueue() {
        return acceptInQueue;
    }



    @Override
    public void acceptToMarket(Actor actor) {
        acceptInMarket.add(actor);
        System.out.println(actor.getName() + " зашел в магазин.");

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        Iterator<Actor> it = acceptInMarket.iterator();
        while(it.hasNext()){
            Actor actor = it.next();
            if (actor.isTakeOrder()){
                System.out.println(actor.getName() + " покинул магазин.");
                it.remove();
            }

        }
/*        count = -1;
        for (Actor actor:actors) {
            count = count + 1;
            if (actor.isTakeOrder()) {
                System.out.println(actors.get(count).getName() + " покинул магазин.");
                acceptInMarket.remove(actor);


            }

        }*/




    }

    @Override
    public void update() {
        System.out.println("-".repeat(100));
        System.out.println("Клиенты - которые находятся в магазине: ");
        for (Actor actor:getAcceptInMarket()) {
            System.out.print(actor);
        }
        System.out.println("\n\nКлиенты - которые стоят в очереди: ");
        for (Actor actor:getAcceptInQueue()) {
            System.out.print(actor);
        }
        System.out.println();
        System.out.println("-".repeat(100));



    }

    @Override
    public void takeInQueue(Actor actor) {
        acceptInQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь.");
    }

    @Override
    public void takeOrders() {
        for (Actor actor:acceptInQueue) {
            if (!actor.isMakeOrder()){
                actor.setMakeOrder();
            }

        }


    }

    @Override
    public void giveOrders() {
        for (Actor actor:acceptInQueue) {
            if (!actor.isTakeOrder()){
                actor.setTakeOrder();
            }

        }

    }

    @Override
    public void releaseFromQueue() {
        Iterator<Actor> it = acceptInQueue.iterator();
        while(it.hasNext()){
            Actor actor = it.next();
            if (actor.isTakeOrder()){
                System.out.println(actor.getName() + " покинул очередь.");
                it.remove();
            }

        }
/*        for (int i = acceptInQueue.size() - 1; i > 0 ; i--) {
            if (acceptInQueue.get(i).isTakeOrder()){
                System.out.println(acceptInQueue.get(i).getName() + " покинул очередь.");
                acceptInQueue.remove(i);
            }

        }*/
/*        for (Actor actor: acceptInQueue) {
            if (actor.isTakeOrder()){
                acceptInQueue.removeAll(getAcceptInQueue());
                return;
            }
            System.out.println("Клиенты не могут выйти из очереди, так как не получили заказы!");
        }*/



    }

}
