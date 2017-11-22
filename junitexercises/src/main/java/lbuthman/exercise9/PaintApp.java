package lbuthman.exercise9;

import java.util.Scanner;

import static tools.Tools.*;

public class PaintApp {

    public static void main(String[] args) {
        Scanner input = getScanner();
        PaintCalculator paintCalculator = new PaintCalculator();

        print("Enter the length of your room: ");
        int length = input.nextInt();
        paintCalculator.setLength(length);

        print("Enter the width of your room: ");
        int width = input.nextInt();
        paintCalculator.setWidth(width);

        int gallons = paintCalculator.calculateGallons();

        print("To paint a " + (paintCalculator.getLength() * paintCalculator.getWidth()) +
                " foot room, you will need " + gallons + " gallons of paint.");

    }
}
