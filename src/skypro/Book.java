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

    public String getAuthorName() {
        return author.getFirstName() + " " + author.getFamilyName();
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
        return "Book{" +
                "author=" + author +
                ", bookTitle='" + bookTitle + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(author, book.author) && Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookTitle, publicationYear);
    }
}
