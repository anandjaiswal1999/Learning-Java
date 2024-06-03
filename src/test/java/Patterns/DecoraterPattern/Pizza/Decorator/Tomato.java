package Patterns.DecoraterPattern.Pizza.Decorator;

import Patterns.DecoraterPattern.Pizza.DifferentPizza.BasePizza;

public class Tomato extends ToppLings{

    BasePizza basePizza;

    public Tomato(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 38;
    }
}
