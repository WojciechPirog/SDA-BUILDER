public class Main {
    public static void main(String[] args) {

        Wydawca wydawca = new Wydawca("Cebulandia i s-ka", "ul. Warzywna 17, 10-102 Kapsztońce Wielkie");
        Book b = new Book.Builder("Janusz Cebularz", "Niedzielny zakaz")

                .setGatunek(Gatunek.THRILLER)
                .setStreszczenie("Polacy są w szoku po wprowadzeniu zakazu handlu w niedzielę.")
                .setOprawa(RodzajOprawy.MIEKKA)
                .setIloscStron(860)
                .setNumerIsbn("A123B456")
                .setWydawca(wydawca)
                .build();

        System.out.println(b);
    }
}
