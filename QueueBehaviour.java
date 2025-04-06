import java.util.List;

public interface QueueBehaviour {
    void enqueue(Actor actor); 
    void dequeue(); 
    int queueSize(); 
}