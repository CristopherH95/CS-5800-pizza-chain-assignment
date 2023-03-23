package pizza;

public enum PizzaChain implements Labeled {
    PIZZA_HUT("Pizza Hut"),
    LITTLE_CAESARS("Little Caesar's"),
    DOMINOS("Domino's");

    private final String label;

    PizzaChain(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
