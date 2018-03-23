public class Book {
private String autor;
private String title;
private Type type;
private String synopsis;
private int pageNumber;
private Binder binder;
private String JSBNNumber;
private Publisher publisher;

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", synopsis='" + synopsis + '\'' +
                ", pageNumber=" + pageNumber +
                ", binder=" + binder +
                ", JSBNNumber='" + JSBNNumber + '\'' +
                ", publisher=" + publisher +
                '}';
    }

    private Book(BookBuilder autor){
    this.autor = autor.autor;
    this.title = autor.title;
    this.type = autor.type;
    this.synopsis = autor.synopsis;
    this.pageNumber = autor.pageNumber;
    this.binder = autor.binder;
    this.JSBNNumber = autor.JSBNNumber;
    this.publisher = autor.publisher;
}


public static class BookBuilder{
    private String autor;
    private String title;
    private Type type;
    private String synopsis;
    private int pageNumber;
    private Binder binder;
    private String JSBNNumber;
    private Publisher publisher;

    public Book Build(){
        return new Book(this);
    }

    public BookBuilder(String autor, String title){
        this.autor = autor;
        this.title = title;
    }
    public BookBuilder setType(Type type) {
        this.type = type;
        return this;
    }

    public BookBuilder setSynopsis(String synopsis) {
        this.synopsis = synopsis;
        return this;
    }

    public BookBuilder setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public BookBuilder setBinder(Binder binder) {
        this.binder = binder;
        return this;
    }

    public BookBuilder setJSBNNumber(String JSBNNumber) {
        this.JSBNNumber = JSBNNumber;
        return this;
    }

    public BookBuilder setPublisher(Publisher publisher) {
        this.publisher = publisher;
        return this;
    }
}

    public String getAutor() {
        return autor;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public Binder getBinder() {
        return binder;
    }

    public String getJSBNNumber() {
        return JSBNNumber;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}
