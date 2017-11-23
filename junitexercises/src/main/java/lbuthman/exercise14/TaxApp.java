package lbuthman.exercise14;

import static tools.Tools.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxApp {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = getScanner();
        TaxCalculator taxCalculator = new TaxCalculator();

        print("What is the order amount? ");
        double amount = input.nextDouble();
        taxCalculator.setSubtotal(amount);

        print("What is the state? ");
        String state = input.next();
        taxCalculator.setState(state);

        double tax = taxCalculator.calculateTax();

        println("The tax is $" + df.format(tax));
        println("The total is $" + df.format(taxCalculator.getSubtotal() + tax));
    }
}

class TaxCalculator {

    private double subtotal;
    private String state;

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    double calculateTax() {
        double tax = 0;
        if (getState().equals("WI")) {
            tax = 5.5 / 100;
            tax *= getSubtotal();
        }

        return tax;
    }
}
