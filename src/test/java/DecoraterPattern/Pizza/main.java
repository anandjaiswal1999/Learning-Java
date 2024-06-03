package DecoraterPattern.Pizza;

import DecoraterPattern.Pizza.DifferentPizza.BasePizza;
import DecoraterPattern.Pizza.DifferentPizza.FarmHouse;
import DecoraterPattern.Pizza.Decorator.ExtraaCheese;
import DecoraterPattern.Pizza.Decorator.Tomato;

public class main {
    public static void main(String[] args) {
        BasePizza pizza= new ExtraaCheese(new FarmHouse());
        System.out.println(pizza.cost());
        BasePizza pizza1= new Tomato(new ExtraaCheese(new FarmHouse()));
        System.out.println(pizza1.cost());

    }
}
