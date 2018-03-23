package com.company;

public class Main {

    public static void main(String[] args) {


        Wydawca wydawca = new Wydawca("Jacek i Placek", "30-001 Kraków, Mała 3");

        Ksiazka.Builder b = new Ksiazka.Builder("Jan Kowalski", "Jakaś książka")
                .setGatunek(Gatunek.MŁODZIEZOWA)
                .setRodzajOprawy(RodzajOprawy.BROSZUROWA)
                .setStreszczenie("Długa książka o niczym")
                .setIloscStron(300)
                .setIsbn("987-111-000-32-0001")
                .setWydawca(wydawca);

        Ksiazka ksiazka = b.build();


        System.out.print(ksiazka);
    }

}
