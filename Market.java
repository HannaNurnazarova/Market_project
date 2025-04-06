import java.util.LinkedList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> queue;

    public Market() {
        this.queue = new LinkedList<>(); 
    }

    @Override
    public void enqueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь.");
        queue.add(actor);
    }

    @Override
    public Actor dequeue() {
        if (queueSize() == 0) {
            System.out.println("Очередь пуста.");
            return null;
        }
        Actor actor = ((LinkedList<Actor>) queue).removeFirst(); 
        System.out.println(actor.getName() + " покинул очередь.");
        return actor;
    }

    @Override
    public int queueSize() {
        return queue.size();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " вошел в магазин.");
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        System.out.println(actor.getName() + " покинул магазин.");
    }

    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    private void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ.");
            }
        }
    }

    private void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && !actor.isTakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ.");
            }
        }
    }

    private void releaseFromQueue() {
        List<Actor> releasedActors = new LinkedList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                releasedActors.add(actor);
                releaseFromMarket(actor);
                System.out.println(actor.getName() + " вышел из магазина.");
            }
        }
        queue.removeAll(releasedActors);
    }
}