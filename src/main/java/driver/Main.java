package driver;

import pizza.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        runSingleChainTest();
        runMultiChainTest();
    }

    private static void runSingleChainTest() {
        System.out.println("---- SINGLE CHAIN ----");
        PizzaChain chain = PizzaChain.PIZZA_HUT;
        PizzaTestData[] pizzaTestDataCollection = getSingleChainTestData();
        ArrayList<Pizza> pizzas = createTestPizzas(chain, pizzaTestDataCollection);
        eatTestPizzas(pizzas);
    }

    private static void runMultiChainTest() {
        System.out.println("---- MULTI CHAIN ----");
        HashMap<PizzaChain, PizzaTestData[]> testData = getMultiChainTestData();

        for (Map.Entry<PizzaChain, PizzaTestData[]> pizzaData : testData.entrySet()) {
            PizzaChain chain = pizzaData.getKey();
            PizzaTestData[] pizzaTestDataCollection = pizzaData.getValue();
            ArrayList<Pizza> pizzas = createTestPizzas(chain, pizzaTestDataCollection);
            eatTestPizzas(pizzas);
        }
    }

    private static PizzaTestData[] getSingleChainTestData() {
        return new PizzaTestData[]{
                new PizzaTestData(
                        PizzaSize.SMALL,
                        3
                ),
                new PizzaTestData(
                        PizzaSize.MEDIUM,
                        6
                ),
                new PizzaTestData(
                        PizzaSize.LARGE,
                        9
                )
        };
    }

    private static HashMap<PizzaChain, PizzaTestData[]> getMultiChainTestData() {
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

    private static ArrayList<Pizza> createTestPizzas(PizzaChain chain, PizzaTestData[] pizzaTestDataCollection) {
        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (PizzaTestData pizzaTestData : pizzaTestDataCollection) {
            PizzaBuilder builder = new PizzaBuilder(pizzaTestData.size);
            builder.setChain(chain);
            for (int i = 0; i < pizzaTestData.toppingsCount; i++) {
                builder.addTopping(PizzaTopping.getRandomTopping());
            }
            pizzas.add(builder.build());
        }

        return pizzas;
    }

    private static void eatTestPizzas(ArrayList<Pizza> pizzas) {
        for (Pizza pizzaInstance : pizzas) {
            pizzaInstance.eat();
        }
    }

    private static class PizzaTestData {
        public PizzaSize size;
        public int toppingsCount;

        public PizzaTestData(PizzaSize size, int toppingsCount) {
            this.size = size;
            this.toppingsCount = toppingsCount;
        }
    }
}