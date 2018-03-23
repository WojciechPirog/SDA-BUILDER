package pl.sda.book;

public class Main {

    public static void main(String[] args) {

        Publisher p = new Publisher("Helion Wydawnictwo" ,"ul. Wojska Polskiego 33" , "756-345-44-44");

        Book b = new Book.BookBuilder("Sienkiewicz" , "Potop")
                .setBindingKind(BindingKind.TWARDA)
                .setKind(Kind.POWIEŚĆ)
                .setDescription("taka sobie opowiećć o ")
                .setISBNnumber("24853-3455")
                .setPageNumber(503)
                .setPublisher(p)
                .build();

        System.out.println( b.toString());

    }
}
