public class Book {

    private String autor;
    private String tytul;
    private Gatunek gatunek;
    private String streszczenie;
    private int iloscStron;
    private RodzajOprawy oprawa;
    private String numerIsbn;
    private Wydawca wydawca;

    Book(Builder builder) {
        this.autor = builder.autor;
        this.tytul = builder.tytul;
        this.gatunek = builder.gatunek;
        this.streszczenie = builder.streszczenie;
        this.iloscStron = builder.iloscStron;
        this.oprawa = builder.oprawa;
        this.numerIsbn = builder.numerIsbn;
        this.wydawca = builder.wydawca;
    }

    @Override
    public String toString() {
        return tytul.toUpperCase() + " (" + autor + ")\n" +
                "gatunek: " + gatunek.toString().toLowerCase() + "\n" +
                "streszczenie: " + streszczenie + "\n" +
                "stron: " + iloscStron + ", oprawa " + oprawa.toString().toLowerCase() + "\n" +
                "nr ISBN: " + numerIsbn + "\n" + wydawca;
    }

    public static class Builder {

        String autor;
        String tytul;
        Gatunek gatunek;
        String streszczenie;
        int iloscStron;
        RodzajOprawy oprawa;
        String numerIsbn;
        Wydawca wydawca;

        public Builder(String autor, String tytul) {
            this.autor = autor;
            this.tytul = tytul;
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

        public Builder setOprawa(RodzajOprawy oprawa) {
            this.oprawa = oprawa;
            return this;
        }

        public Builder setNumerIsbn(String numerIsbn) {
            this.numerIsbn = numerIsbn;
            return this;
        }

        public Builder setWydawca(Wydawca wydawca) {
            this.wydawca = wydawca;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
