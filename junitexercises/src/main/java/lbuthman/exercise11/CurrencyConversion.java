package lbuthman.exercise11;

import static tools.Tools.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = getScanner();

        Converter converter = new Converter();

        print("How many euros are you exchanging? ");
        double euros = input.nextDouble();

        double usd = converter.convertEuroToUSD(euros);

        print(euros + " euros at an exchange rate of " + converter.EXCHANGE_RATE + " is " + "$" + df.format(usd));
    }
}

class Converter {

    double EXCHANGE_RATE = 1.18143679254;

    double convertEuroToUSD(double euros) {
        return euros * EXCHANGE_RATE;
    }
}
