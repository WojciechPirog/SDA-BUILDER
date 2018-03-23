package com.company;

public class Ksiazka {

    String autor;
    String tytuł;
    Gatunek gatunek;
    String streszczenie;
    int iloscStron;
    String isbn;
    Wydawca wydawca;
    RodzajOprawy rodzajOprawy;

    public Ksiazka(Builder builder) {
        this.autor = builder.autor;
        this.tytuł = builder.tytuł;
        this.gatunek = builder.gatunek;
        this.streszczenie = builder.streszczenie;
        this.iloscStron = builder.iloscStron;
        this.isbn = builder.isbn;
        this.wydawca = builder.wydawca;
        this.rodzajOprawy = builder.rodzajOprawy;

    }

    public static class Builder {

        String autor;
        String tytuł;
        Gatunek gatunek;
        String streszczenie;
        int iloscStron;
        String isbn;
        Wydawca wydawca;
        RodzajOprawy rodzajOprawy;


        public Builder(String autor, String tytuł) {
            this.autor = autor;
            this.tytuł = tytuł;
        }

        public Builder setGatunek(Gatunek gatunek) {
            this.gatunek = gatunek;
            return this;
        }

        public Builder setStreszczenie(String streszczenie) {
            this.streszczenie = streszczenie;
            return this;
        }

        public Builder setIloscStron(int iloscStron) {
            this.iloscStron = iloscStron;
            return this;
        }

        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder setWydawca(Wydawca wydawca) {
            this.wydawca = wydawca;
            return this;
        }

        public Builder setRodzajOprawy(RodzajOprawy rodzajOprawy) {
            this.rodzajOprawy = rodzajOprawy;
            return this;
        }

        public Ksiazka build() {
            return new Ksiazka(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "autor='" + autor + '\'' +
                    ", tytuł='" + tytuł + '\'' +
                    ", gatunek=" + gatunek +
                    ", streszczenie='" + streszczenie + '\'' +
                    ", ilośćStron=" + iloscStron +
                    ", isbn='" + isbn + '\'' +
                    ", wydawca=" + wydawca +
                    ", rodzajOprawy=" + rodzajOprawy +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "autor='" + autor + '\'' +
                ", tytuł='" + tytuł + '\'' +
                ", gatunek=" + gatunek +
                ", streszczenie='" + streszczenie + '\'' +
                ", ilośćStron=" + iloscStron +
                ", isbn='" + isbn + '\'' +
                ", wydawca=" + wydawca +
                ", rodzajOprawy=" + rodzajOprawy +
                '}';
    }
}


