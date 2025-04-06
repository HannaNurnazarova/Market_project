public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Иван");
        Human human2 = new Human("Мария");
        Human human3 = new Human("Петр");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);

        
        market.enqueue(human1);
        market.enqueue(human2);
        market.enqueue(human3);

        
        market.update();

     
        market.dequeue(); 

        
        System.out.println("Размер очереди: " + market.queueSize());
    }
}