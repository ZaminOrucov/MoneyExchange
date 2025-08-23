//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sadə kurs dəyərləri (misal üçün)
        double usdToAzn = 1.7;   // 1 USD = 1.7 AZN
        double eurToAzn = 1.85;  // 1 EUR = 1.85 AZN

        System.out.println("Valyuta Çevirici Proqram");
        System.out.println("-------------------------");
        System.out.print("Məbləği daxil edin: ");
        double amount = input.nextDouble();

        System.out.print("Valyuta növünü daxil edin (USD, EUR, AZN): ");
        String fromCurrency = input.next().toUpperCase();

        System.out.print("Çevirmək istədiyiniz valyutanı daxil edin (USD, EUR, AZN): ");
        String toCurrency = input.next().toUpperCase();

        double result = 0;

        // Əvvəlcə məbləği AZN-ə çeviririk
        double amountInAzn = 0;
        if (fromCurrency.equals("USD")) {
            amountInAzn = amount * usdToAzn;
        } else if (fromCurrency.equals("EUR")) {
            amountInAzn = amount * eurToAzn;
        } else if (fromCurrency.equals("AZN")) {
            amountInAzn = amount;
        } else {
            System.out.println("Düzgün valyuta daxil edilmədi!");
            return;
        }

        // İndi isə AZN-dən istənilən valyutaya çeviririk
        if (toCurrency.equals("USD")) {
            result = amountInAzn / usdToAzn;
        } else if (toCurrency.equals("EUR")) {
            result = amountInAzn / eurToAzn;
        } else if (toCurrency.equals("AZN")) {
            result = amountInAzn;
        } else {
            System.out.println("Düzgün valyuta daxil edilmədi!");
            return;
        }

        System.out.println(amount + " " + fromCurrency + " = " + result + " " + toCurrency);
    }
}