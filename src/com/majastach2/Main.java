package com.majastach2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        boolean shouldContinue= true;

        ListaZakupow lista_zakupow= new ListaZakupow();

        while (shouldContinue) {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Wyświetl listę zakupów.");
            System.out.println("2. Dodaj produkt do listy.");
            System.out.println("3. Usuń produkt z listy.");
            System.out.println("4. Skasuj całą listę.");
            System.out.println("5. Zakończ program.");

            int userChoice= scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println(lista_zakupow.wyswietlListe());
                    break;
                case 2:
                    lista_zakupow.dodajDoListy();
                    break;
                case 3:
                    lista_zakupow.skasujProdukt();
                    break;
                case 4:
                    lista_zakupow.skasujListe();
                    break;
                case 5: shouldContinue= false;
                    break;
        }
        }
    }
}
