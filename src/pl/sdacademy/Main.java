package pl.sdacademy;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Book.Builder b = new Book.Builder("Jankowski", "Nad Niemnem")
                .gatunek(Gatunek.KRYMINAL)
                .rodzajOprawy(RodzajOprawy.MIEKKA);
        Book.Builder c = new Book.Builder("Ważka", "Anihilacja")
                .iloscStron(54)
                .numerIsbn("45-456-67")
                .streszczenie("coś tam pokrótce")
                .wydawca(new Wydawca("Arkady", "Życińskiego 5, 33-333 Kraków"));

        Book book1 = b.build();
        Book book2 = c.build();

        System.out.println(book1 + "\n" + book2.toString());

    }
}
