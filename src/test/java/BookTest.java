import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BookTest {

    final public static Publisher publisher = new Publisher("Wydawca1","AdresWydawcy",334330405);

    @Test
    public void checkIfYouCanCreateBookWithAuthorAndTitleOnly(){
        Book book1 = new Book.BookBuilder("Michal Wojtaszek","Ksiazka Michala Wojtaszka").Build();
        assertThat(book1.getAutor()).isEqualTo("Michal Wojtaszek");
    }
    @Test
    public void checkIfYouCanCreateBookWithHardBinder(){
        Book book1 = new Book.BookBuilder("Autor ksiarzki","Tytul ksiarzki").setBinder(Binder.H).Build();
        assertThat(book1.getBinder()).isEqualTo(Binder.H);
    }
    @Test
    public void checkIfYouCanCreateBookWithPublisher(){
        Book book1 = new Book.BookBuilder("Autor Ksiarzki","TytulKsiarzki").setPublisher(publisher).Build();
assertThat(book1.getPublisher()).isEqualTo(publisher);
    }
}
