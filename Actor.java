public abstract class Actor implements ActorBehavoir{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    //конструктор чтоб принимать имя
    public Actor(String name){
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }


    abstract String getName(); 

}
