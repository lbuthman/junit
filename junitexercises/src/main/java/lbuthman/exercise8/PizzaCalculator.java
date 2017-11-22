package lbuthman.exercise8;

public class PizzaCalculator {

    int SLICES_PER_PIZZA = 8;

    public int calculateTotalSlices(int pizzas) {
        return SLICES_PER_PIZZA * pizzas;
    }
}
