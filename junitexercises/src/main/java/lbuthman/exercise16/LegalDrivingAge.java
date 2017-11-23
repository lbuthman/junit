package lbuthman.exercise16;

import static tools.Tools.*;

import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {
        Scanner input = getScanner();
        AgeChecker ageChecker = new AgeChecker();

        print("What is your age? ");
        int age = input.nextInt();

        print(ageChecker.checkAge(age));
    }
}

class AgeChecker {

    public String checkAge(int age) {
        return age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
    }
}
