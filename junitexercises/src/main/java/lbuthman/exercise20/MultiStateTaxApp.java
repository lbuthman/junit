package lbuthman.exercise20;

import static tools.Tools.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiStateTaxApp {
    public static void main(String[] args) {
        final double ILLINOIS_TAX_RATE = 0.08;

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = getScanner();
        MultiStateTaxCalculator taxCalculator = new MultiStateTaxCalculator();

        print("What is the order amount? ");
        double amount = input.nextDouble();
        taxCalculator.setAmount(amount);

        print("What state do you live in? ");
        String state = input.next();
        taxCalculator.setState(state);

        double tax = 0.0;
        if (state.toLowerCase().equals("wisconsin")) {
            print("What county do you live in? ");
            input.skip("\\s");
            String county = input.nextLine();
            input.reset();
            double taxRate = taxCalculator.getCountyTaxRate(county);
            tax = taxCalculator.calculateTax(taxRate);
        }

        if (state.toLowerCase().equals("illinois")) {
            tax = taxCalculator.calculateTax(ILLINOIS_TAX_RATE);
        }

        double total = amount;
        if (tax != 0.0) {
            println("The tax is $" + df.format(tax));
            total += tax;
        }

        println("The total is $" + df.format(total));
    }
}

class MultiStateTaxCalculator {

    private double amount;
    private String state;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    double calculateTax(double taxRate) {
        return amount * taxRate;
    }

    double getCountyTaxRate(String county) {
        final double EAU_CLAIRE_TAX_RATE = 0.05;
        final double DUNN_TAX_RATE = 0.04;

        if (county.toLowerCase().equals("eau claire")) {
            return EAU_CLAIRE_TAX_RATE;
        }
        if (county.toLowerCase().equals("dunn")) { return DUNN_TAX_RATE; }

        return 0.0;
    }
}
