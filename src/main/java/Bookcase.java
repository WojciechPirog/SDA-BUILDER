public class Bookcase {
    public static void main(String[] args) {
        Book book1 = new Book.BookBuilder("Michal Wojtaszek","Podstawy podstaw Wzorców").setBinder(Binder.H).Build();


        System.out.println(book1);

    }
}
