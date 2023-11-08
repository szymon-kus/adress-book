package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMethods {
    Scanner scanner = new Scanner(System.in);
    private final Map<String, Long> adressBook = new HashMap<>();

    public void addContact () {
        System.out.println("Dodawanie kontaktu: ");
        String contactName = scanner.nextLine();
        long number = Long.parseLong(scanner.nextLine());
        adressBook.put(contactName, number);
        }
        public void showContacts () {
        System.out.println("Wyświetlanie listy kontaków: ");
        for (Map.Entry<String, Long> contact : adressBook.entrySet()){
            String key = contact.getKey();
            Long value = contact.getValue();
            System.out.println("Kontakt: " + key + ". Numer telefonu: " + value);
        }
    }

    public void deleteContact(){
        System.out.println("Usuwanie kontaktu: ");
        System.out.println("Podaj kontakt, który chcesz usunąć: ");
        String contactToDelete = scanner.nextLine();
        if (adressBook.equals(contactToDelete)) {
            adressBook.entrySet().removeIf(contact -> contactToDelete.equals(contact.getKey()));
        } else {
            System.out.println("Podaj prawidłową wartość");
        }
    }
}
