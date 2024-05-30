public interface ActorBehavoir { //описывает поведение человека в очереди
    public void setMakeOrder(boolean isMakeOrder); //делает заказ
    public void setTakeOrder(boolean isTakeOrder); // получает заказ
    public boolean isMakeOrder(); // проверка сделал ли человек заказ
    public boolean isTakeOrder(); // проверка получил ли человек заказ
}
