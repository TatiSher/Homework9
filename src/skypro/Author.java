package skypro;

import java.util.Objects;

public class Author {
    private String authorName;

    public Author (String authorName) {

        this.authorName = authorName;
    }

    public String getAuthorName() {

        return authorName;
    }

    @Override
    public String toString() {
        return "Author name: " + authorName + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName);
    }
}
