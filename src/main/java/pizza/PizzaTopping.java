package pizza;

import java.util.Random;

public enum PizzaTopping implements Labeled {
    PEPPERONI("Pepperoni"),
    SAUSAGE("Sausage"),
    MUSHROOMS("Mushrooms"),
    BACON("Bacon"),
    ONIONS("Onions"),
    EXTRA_CHEESE("Extra Cheese"),
    PEPPERS("PEPPERS"),
    CHICKEN("Chicken"),
    OLIVES("Olives"),
    SPINACH("Spinach"),
    TOMATO_BASIL("Tomato and Basil"),
    BEEF("Beef"),
    HAM("Ham"),
    PESTO("Pesto"),
    SPICY_PORK("Spicy Pork"),
    HAM_PINEAPPLE("Ham and Pineapple");

    private final String label;
    private static final Random numberGenerator = new Random();

    PizzaTopping(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static PizzaTopping getRandomTopping() {
        PizzaTopping[] pizzaToppings = values();
        return pizzaToppings[numberGenerator.nextInt(pizzaToppings.length)];
    }
}
