import java.util.List;

public interface QueueBehaviour {
    void enqueue(Actor actor); 
    Actor dequeue(); 
    int queueSize(); 
}