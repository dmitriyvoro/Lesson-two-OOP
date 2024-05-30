import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    private List<Actor> queue = new ArrayList<>();// список посетителей магазина

    public void acceptToMarket(Actor actor) { // принимает actor и добавляет его в магазин
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);// встал в очередь
    }

    public void takeInQueue(Actor actor) {// встать в очередь
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);
    }

    public void takeOrders() {// сделать заказ
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true); 
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    public void giveOrders() {// получить заказ
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) { 
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) { 
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }

    public void releaseFromMarket(List<Actor> actors) {                         
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);// удаляем актора из списка
        }

    }

    public void update() {
        takeOrders();// собрать заказы
        giveOrders();// пройтись по списку и отдать заказы
        releaseFromQueue();// выгнать из очереди
    }
}