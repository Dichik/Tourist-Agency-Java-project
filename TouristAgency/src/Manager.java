public class Manager {
    private String name;
    private String login;
    private String password;
    private String email;
    private String mobileNumber;

    public Manager(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    //================================

    public void setTour_BURN(Tour tour){
        tour.setBURN(true);
    }

    public void setTour_UNBURN(Tour tour){
        tour.setBURN(false);
    }
    public void setState(Tour tour, Tour.STATE state){
        tour.setState(state);
    }
    /**
     * discounts
     */
}
