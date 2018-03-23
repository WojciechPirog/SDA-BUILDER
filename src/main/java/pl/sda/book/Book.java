package pl.sda.book;

public class Book {

    private String autor;
    private String title;
    private Kind kind;
    private String description;
    private int pagesNumber;
    private BindingKind bindingKind;
    private String ISBNnumber;
    private Publisher publisher;

    public Book(BookBuilder build) {
        this.autor = build.autor;
        this.title = build.title;
        this.kind = build.kind;
        this.description = build.description;
        this.pagesNumber = build.pagesNumber;
        this.bindingKind = build.bindingKind;
        this.ISBNnumber = build.ISBNnumber;
        this.publisher = build.publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", title='" + title + '\'' +
                ", kind=" + kind +
                ", description='" + description + '\'' +
                ", pagesNumber=" + pagesNumber +
                ", bindingKind=" + bindingKind +
                ", ISBNnumber='" + ISBNnumber + '\'' +
                ", publisher=" + publisher +
                '}';
    }

    public String getAutor() {
        return autor;
    }

    public String getTitle() {
        return title;
    }

    public Kind getKind() {
        return kind;
    }

    public String getDescription() {
        return description;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public BindingKind getBindingKind() {
        return bindingKind;
    }

    public String getISBNnumber() {
        return ISBNnumber;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public static class BookBuilder {
        private String autor;
        private String title;
        Kind kind;
        String description;
        int pagesNumber;
        BindingKind bindingKind;
        String ISBNnumber;
        Publisher publisher;

        BookBuilder(String autor, String title) {
            this.autor = autor;
            this.title = title;
        }

        public BookBuilder setKind(Kind k) {
            this.kind = k;
            return this;
        }
        public BookBuilder setDescription(String desc) {
            this.description = desc;
            return this;
        }
        public BookBuilder setPageNumber(int n) {
            this.pagesNumber = n;
            return this;
        }
        public BookBuilder setBindingKind (BindingKind bk) {
            this.bindingKind = bk;
            return this;
        }
        public BookBuilder setISBNnumber (String isbnnumber) {
            this.ISBNnumber = isbnnumber;
            return this;
        }
        public BookBuilder setPublisher(Publisher publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }
}
