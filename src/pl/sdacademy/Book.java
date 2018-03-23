package pl.sdacademy;

public class Book {
    private String autor;
    private String tytul;
    private String streszczenie;
    private int iloscStron;
    private String numerIsbn;
    private Wydawca wydawca;
    private Gatunek gatunek;
    private RodzajOprawy rodzajOprawy;



    public Book(Builder builder) {
        this.autor = builder.autor;
        this.tytul = builder.tytul;
        this.streszczenie = builder.streszczenie;
        this.iloscStron = builder.iloscStron;
        this.numerIsbn = builder.numerIsbn;
        this.wydawca = builder.wydawca;
        this.gatunek = builder.gatunek;
        this.rodzajOprawy = builder.rodzajOprawy;

    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", tytul='" + tytul + '\'' +
                ", streszczenie='" + streszczenie + '\'' +
                ", iloscStron=" + iloscStron +
                ", numerIsbn='" + numerIsbn + '\'' +
                ", wydawca=" + wydawca +
                ", gatunek=" + gatunek +
                ", rodzajOprawy=" + rodzajOprawy +
                '}';
    }
    static class Builder {
        private String autor;
        private String tytul;
        private String streszczenie;
        private int iloscStron;
        private String numerIsbn;
        private Wydawca wydawca;
        private Gatunek gatunek;
        private RodzajOprawy rodzajOprawy;

        public Builder(String autor, String tytul) {
            this.autor = autor;
            this.tytul = tytul;
        }

        public Builder autor (final String autor) {
            this.autor = autor;
            return this;
        }

        public Builder tytul (final String tytul){
            this.tytul = tytul;
            return this;
        }
        public Builder streszczenie (final String streszczenie){
            this.streszczenie = streszczenie;
            return this;
        }
        public Builder iloscStron (final int iloscStron){
            this.iloscStron = iloscStron;
            return this;
        }

        public Builder numerIsbn (final String numerIsbn){
            this.numerIsbn = numerIsbn;
            return this;
        }
        public Builder wydawca (final Wydawca wydawca){
            this.wydawca = wydawca;
            return this;
        }
        public Builder gatunek (final Enum gatunek){
            this.gatunek = (Gatunek) gatunek;
            return this;
        }
        public Builder rodzajOprawy (final Enum rodzajOprawy){
            this.rodzajOprawy = (RodzajOprawy) rodzajOprawy;
            return this;
        }


        public Book build(){
            return new Book(this);
        }

    }

}
