import java.util.HashSet;
import java.util.Set;

public class Client {
    private String name;
    private String surname;
    private String login;
    private String email;
    private Boolean baned;
    private Set<Tour> tours;
    private String password;

    public Client(String login, String email, String password) {
        this.login = login;
        baned = false;
        this.email = email;
        tours = new HashSet<>();
        this.password = password;
    }
    /*Getters and setters started*/
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getBaned() {
        return baned;
    }

    public void setBaned(Boolean baned) {
        this.baned = baned;
    }

    public Set<Tour> getTours() {
        return tours;
    }

    public void setTours(Set<Tour> tours) {
        this.tours = tours;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /*Getters ad setters ended*/
}
