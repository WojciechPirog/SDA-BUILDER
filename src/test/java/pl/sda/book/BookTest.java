package pl.sda.book;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.nullable;

public class BookTest {

    @Test
    public void shouldReturnBookWithTwoParam() {

        Book b = new Book.BookBuilder("start","stop").build();

        assertThat(b.getAutor()).isEqualTo("start");
        assertThat(b.getTitle()).isEqualTo("stop");
    }

    @Test
    public void shouldNotReturnObjectWhenOnlyOneParamsIsSet() {

        Book b = new Book.BookBuilder("start",null).build();

        assertThat(b.getAutor()).isEqualTo("start");
        assertThat(b.getTitle()).isEqualTo(nullable(String.class));
    }
}
