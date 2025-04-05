public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
        this.isTakeOrder = false;
        this.isMakeOrder = false;
    }

    public abstract String getName();

    public abstract void setName(String name);

    public abstract boolean isTakeOrder();

    public abstract void setTakeOrder(boolean val);

    public abstract boolean isMakeOrder();

    public abstract void setMakeOrder(boolean val);
} 
    

