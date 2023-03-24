package pizza;

import java.util.ArrayList;

public class Pizza {
    private final PizzaChain chain;
    private final PizzaSize size;
    private final PizzaTopping[] toppings;

    public Pizza(PizzaChain chain, PizzaSize size, PizzaTopping[] pizzaToppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = pizzaToppings;
    }

    private String getPrintableToppings() {
        ArrayList<String> printableToppings = new ArrayList<>();
        String toppingDelimiter = ";";

        for (PizzaTopping pizzaTopping : toppings) {
            printableToppings.add(pizzaTopping.getLabel());
        }

        return String.join(toppingDelimiter, printableToppings);
    }

    public void eat() {
        System.out.printf(
            "Chain: %s, Size: %s, Toppings: %s%n",
            chain.getLabel(),
            size.getLabel(),
            getPrintableToppings()
        );
    }
}
