package driver;

import pizza.PizzaChain;
import pizza.PizzaSize;

import java.util.HashMap;

public class Main {
    private static class PizzaTestData {
        public PizzaSize size;
        public int toppingsCount;

        public PizzaTestData(PizzaSize size, int toppingsCount) {
            this.size = size;
            this.toppingsCount = toppingsCount;
        }
    }

    public static HashMap<PizzaChain, PizzaTestData[]> getTestData() {
        HashMap<PizzaChain, PizzaTestData[]> testData = new HashMap<>();
        testData.put(
            PizzaChain.PIZZA_HUT,
            new PizzaTestData[]{
                new PizzaTestData(PizzaSize.LARGE, 3),
                new PizzaTestData(PizzaSize.SMALL, 2)
            }
        );
        testData.put(
            PizzaChain.LITTLE_CAESARS,
            new PizzaTestData[]{
                new PizzaTestData(PizzaSize.MEDIUM, 8),
                new PizzaTestData(PizzaSize.SMALL, 6)
            }
        );
        testData.put(
            PizzaChain.DOMINOS,
            new PizzaTestData[]{
                new PizzaTestData(PizzaSize.SMALL, 1),
                new PizzaTestData(PizzaSize.LARGE, 3)
            }
        );

        return testData;
    }

    public static void main(String[] args) {
        HashMap<PizzaChain, PizzaTestData[]> testData = getTestData();
        // TODO: process test data
    }
}