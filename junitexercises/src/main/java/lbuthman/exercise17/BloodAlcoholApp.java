package lbuthman.exercise17;

import static tools.Tools.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BloodAlcoholApp {
    public static void main(String[] args) {

        Scanner input = getScanner();
        DecimalFormat df = new DecimalFormat("0.00");
        BloodAlcoholCalculator bloodAlcoholCalculator = new BloodAlcoholCalculator();

        print("How many drinks have you had? ");
        double drinks = input.nextDouble();
        bloodAlcoholCalculator.setDrinks(drinks);

        print("What is your weight in pounds? ");
        double weight = input.nextDouble();
        bloodAlcoholCalculator.setWeight(weight);

        print("Enter 'm' for male or 'f' for female: ");
        String sex = input.next();
        bloodAlcoholCalculator.setSex(sex);
        double bloodWater = bloodAlcoholCalculator.calculateBloodWater();
        bloodAlcoholCalculator.setBloodWater(bloodWater);

        print("How many hours has it been since your last drink? ");
        int hours = input.nextInt();
        bloodAlcoholCalculator.setHours(hours);

        double bac = bloodAlcoholCalculator.calculateBAC();
        println("Your blood alcohol content is " + df.format(bac) + "%");

        if (bac >= 0.08) {
            print("It is not legal for you to drive.");
        } else {
            print("It is legal for you to drive. Be careful :)");
        }
    }
}

class BloodAlcoholCalculator {
    private final double WATER_IN_BLOOD = 0.806;
    private final double GRAMS_TO_SWEDISH_STANDARDS = 1.2;
    private final double METABOLISM = 0.017;
    private final double CONVERT_TO_PERMILLAGE = 10;
    private final double KILOGRAMS_TO_POUNDS = 0.453592;
    private final double BODY_WATER_MALE = 0.58;
    private final double BODY_WATER_FEMALE = 0.49;

    private double drinks;
    private double weight;
    private double bloodWater;
    private int hours;
    private String sex;

    public double getDrinks() {
        return drinks;
    }

    public void setDrinks(double drinks) {
        this.drinks = drinks;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight * KILOGRAMS_TO_POUNDS;
    }

    public double getBloodWater() {
        return bloodWater;
    }

    public void setBloodWater(double bloodWater) {
        this.bloodWater = bloodWater;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    double calculateBloodWater() {
        return sex.contains("m") ? BODY_WATER_MALE : BODY_WATER_FEMALE;
    }

    double calculateBAC() {
       return ((WATER_IN_BLOOD * drinks * GRAMS_TO_SWEDISH_STANDARDS)
                / (weight * bloodWater) - METABOLISM * hours) * CONVERT_TO_PERMILLAGE;
    }
}
