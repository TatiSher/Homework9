package skypro;

import java.util.Objects;

public class Book {
    private Author author;
    private String bookTitle;
    private int publicationYear;

    public Book(Author author, String bookTitle, int publicationYear) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookTitle() {

        return this.bookTitle;
    }

    public int getPublicationYear() {

        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {

        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book title: " + bookTitle + ", publication year: " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationYear);
    }
}
