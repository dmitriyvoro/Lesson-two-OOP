public interface QueueBehaviour { //показывает поведение в нашей очереди покупателей

    void takeInQueue(Actor actor);//встать в очередь

    void takeOrders();//сделать заказ

    void giveOrders();//получить заказ

    void releaseFromQueue();//человек выходит из очереди
}
 