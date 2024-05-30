public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Иван");
        Human human2 = new Human("Дима");
        market.acceptToMarket(human1);//добавили в магазин при помощи acceptToMarket
        market.acceptToMarket(human2);
        market.update();
    }
}
