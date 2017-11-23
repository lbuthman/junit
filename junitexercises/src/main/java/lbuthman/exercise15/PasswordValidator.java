package lbuthman.exercise15;

import static tools.Tools.*;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner input = getScanner();
        SecretPassword secretPassword = new SecretPassword("floatingCastle");

        print("What is the password? ");
        String password = input.next();

        println(secretPassword.checkPassword(password));
    }
}

class SecretPassword {

    private String password;

    SecretPassword(String password) {
        this.password = password;
    }

    String checkPassword(String guess) {
        if (guess.equals(password)) {
            return "You got it!";
        }
        else {
            return "I don't know who you are.";
        }
    }
}
