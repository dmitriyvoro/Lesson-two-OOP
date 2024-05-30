import java.util.List;

public interface MarketBehaviour {// поведение всего нашего магазина

    public void acceptToMarket(Actor actor); //принимает actor и добавляет его в магазин

    public void releaseFromMarket(List<Actor> actors);//принимает список акторов, проходит по списку и выгоняет из магазина

    public void update();
}
