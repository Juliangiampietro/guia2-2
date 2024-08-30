public class Author {
    private String name;
    private String surname;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Author(String name, String surname, String email, char gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
    }

public String showAuthor() {
        return this.name + " " + this.surname + " " + this.email + " " + this.gender;
    }
}
