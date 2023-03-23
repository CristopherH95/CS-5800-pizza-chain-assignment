package pizza;

public enum PizzaSize implements Labeled {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String label;

    PizzaSize(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
