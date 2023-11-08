package org.example;
import java.util.Scanner;

public class AdressBook extends AddressBookMethods{
    public void menu () {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Wyświetl listę kontaktów.");
            System.out.println("2. Dodaj kontakt.");
            System.out.println("3. Usuń kontakt");
            System.out.println("0. Wyjdź.");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                showContacts();
            } else if (userChoice == 2) {
                addContact();
            } else if (userChoice == 3) {
                deleteContact();
            } else if (userChoice == 0) {
                System.out.println("Wyszedłeś z listy kontaktów");
                shouldContinue = false;
            } else {
                System.out.println("Podaj prawidłową wartośc");
            }
        }
    }
}