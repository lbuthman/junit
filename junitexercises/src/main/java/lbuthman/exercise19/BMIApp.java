package lbuthman.exercise19;

import java.text.DecimalFormat;
import java.util.Scanner;

import static tools.Tools.*;

public class BMIApp {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner input = getScanner();
        BMICalculator bmiCalculator = new BMICalculator();

        println("Let's get your height in feet and inches.");
        print("First, enter feet: ");
        double feet = input.nextDouble();
        bmiCalculator.setFeet(feet);

        print("Next, enter inches: ");
        double inches = input.nextDouble();
        bmiCalculator.setInches(inches);

        print("Finally, how much do you weight? ");
        double weight = input.nextDouble();
        bmiCalculator.setWeight(weight);

        double bmi = bmiCalculator.calculateBmi();
        String result = bmiCalculator.getBmiResult(bmi);

        println("Your BMI is " + df.format(bmi));
        println("You are " + result + ".");
    }
}

class BMICalculator {

    final private double NORMAL_LOW = 18.5;
    final private double NORMAL_HIGH = 25;

    private double feet;
    private double inches;
    private double weight;

    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    double calculateBmi() {
        double heightInInches = feet * 12 + inches;

        return (weight / ( Math.pow(heightInInches, 2)) * 703);
    }

    String getBmiResult(double bmi) {
        if (bmi < NORMAL_LOW) {
            return "Underweight\nYou should see your doctor.";
        }

        if (bmi > NORMAL_HIGH) {
            return "Overweight\nYou should see your doctor.";
        }

        return "Normal";
    }
}
