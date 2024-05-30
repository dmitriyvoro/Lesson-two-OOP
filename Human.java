public class Human extends Actor  {

    public Human(String name){
        super(name);
    }
    
    public String getName(){
        return name;
    }
    public void setMakeOrder(boolean isMakeOrder){//делает заказ
        super.isMakeOrder = isMakeOrder;
    } 
    public void setTakeOrder(boolean isTakeOrder){// получает заказ
        super.isTakeOrder = isTakeOrder;
    } 
    public boolean isMakeOrder(){// проверка сделал ли человек заказ
        return isMakeOrder;
    } 
    public boolean isTakeOrder(){// проверка получил ли человек заказ
        return isTakeOrder;
    }

    } 
