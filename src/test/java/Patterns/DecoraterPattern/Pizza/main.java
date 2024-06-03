package Patterns.DecoraterPattern.Pizza;

import Patterns.DecoraterPattern.Pizza.DifferentPizza.BasePizza;
import Patterns.DecoraterPattern.Pizza.DifferentPizza.FarmHouse;
import Patterns.DecoraterPattern.Pizza.Decorator.ExtraaCheese;
import Patterns.DecoraterPattern.Pizza.Decorator.Tomato;

public class main {
    public static void main(String[] args) {
        BasePizza pizza= new ExtraaCheese(new FarmHouse());
        System.out.println(pizza.cost());
        BasePizza pizza1= new Tomato(new ExtraaCheese(new FarmHouse()));
        System.out.println(pizza1.cost());

    }
}
