package com.majastach2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListaZakupow {

    private int iloscProduktow;

    private  List<String> listaZakupow = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void dodajDoListy() {
        System.out.println("Dodaj produkt do listy: ");
        String produkt = scanner.nextLine().toLowerCase(Locale.ROOT);

        if (listaZakupow.contains(produkt)) {
            System.out.println("Lista zawiera już ten produkt.");
        } else {
        listaZakupow.add(produkt);
        iloscProduktow++;
        System.out.println();
    }}

    public List<String> wyswietlListe () {
       System.out.println("Aktualna ilość produktów: " + iloscProduktow);
       return listaZakupow;
    }

    public void skasujProdukt(){
        System.out.println("Wpisz nazwę produktu do skasowania: ");
        String produktDoSkasowania= scanner.nextLine().toLowerCase(Locale.ROOT);

        if (listaZakupow.isEmpty()) {
            System.out.println("Lista zakupów jest pusta!");
        } else if (listaZakupow.contains(produktDoSkasowania)) {
            listaZakupow.remove(produktDoSkasowania);
            iloscProduktow--;
            System.out.println("Produkt " + "\"" + produktDoSkasowania + "\""+ " został skasowany.");
        } else {
            System.out.println("Lista nie zawiera tego produktu.");
        }
    }

    public void skasujListe() {
        listaZakupow.clear();
        iloscProduktow=0;
        System.out.println("Lista skasowana.");
    }

}

