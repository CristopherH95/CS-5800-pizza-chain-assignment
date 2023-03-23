package pizza;

import java.util.ArrayList;

public class PizzaBuilder {
    private PizzaChain chain;
    private PizzaSize size;
    private final ArrayList<PizzaTopping> toppings;

    public PizzaBuilder(PizzaSize size) {
        this.size = size;
        this.chain = PizzaChain.PIZZA_HUT;
        this.toppings = new ArrayList<>();
    }

    public PizzaBuilder setChain(PizzaChain chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(PizzaSize size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(PizzaTopping topping) {
        this.toppings.add(topping);
        return this;
    }

    public Pizza make() {
        return new Pizza(
            chain,
            size,
            toppings.toArray(new PizzaTopping[0])
        );
    }
}
