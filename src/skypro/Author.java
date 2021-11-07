package skypro;

import java.util.Objects;

public class Author {
    private String firstName;
    private String familyName;


    public Author (String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(familyName, author.familyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, familyName);
    }
}
