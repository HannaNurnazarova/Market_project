public interface ActorBehaviour {
    boolean isTakeOrder();
    boolean isMakeOrder();
    void setTakeOrder(boolean val);
    void setMakeOrder(boolean val);
}