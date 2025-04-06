public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
        this.isTakeOrder = false;
        this.isMakeOrder = false;
    }

    public String getName() {
        return name;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }
}