package lbuthman.exercise8;

class PizzaCalculator {

    private final int SLICES_PER_PIZZA = 8;
    private int people;
    private int pizzas;

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getPizzas() {
        return pizzas;
    }

    public void setPizzas(int pizzas) {
        this.pizzas = pizzas;
    }

    int calculateTotalSlices() {
        return SLICES_PER_PIZZA * this.pizzas;
    }

    int calculateSlicesPerPerson() {
        return calculateTotalSlices() / people;
    }
}
