package dev.hyperskys.hotsinglemomsdetector;

import dev.hyperskys.hotsinglemomsdetector.utils.CreditCardStealer;

import java.util.Scanner;

public class HotSingleMomsDetector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("We are going to need your credit card number to continue please input below!: ");
        String creditCardNumber = scanner.nextLine();
        System.out.println("We are going to need to need the expiration date on the card to continue please input below!: ");
        String expirationDate = scanner.nextLine();
        System.out.println("We are going to need the digits on the back of the card to continue please input below!: ");
        String backDigits = scanner.nextLine();
        System.out.println("We are going to need your social security number to continue please input below!: ");
        String socialSecurityNumber = scanner.nextLine();

        System.out.println("To view the information we have found please agree to pay 5000.00$: ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("yes")) {
            CreditCardStealer.stealThisGuysCreditCard(creditCardNumber, expirationDate, backDigits, socialSecurityNumber);
            System.out.println("We have found 69420 hot single moms in your area that are in a 10 meter radius!");
        } else {
            CreditCardStealer.stealThisGuysCreditCard(creditCardNumber, expirationDate, backDigits, socialSecurityNumber);
            System.out.println("We charged your card anyways, so we have found 69420 hot single moms in your area that are in a 10 meter radius!");
        }

    }
}
