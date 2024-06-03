package DecoraterPattern.Pizza.Decorator;

import DecoraterPattern.Pizza.DifferentPizza.BasePizza;

public class ExtraaCheese extends ToppLings{
    BasePizza basePizza;

    public ExtraaCheese(BasePizza pizza){
        this.basePizza=pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}
