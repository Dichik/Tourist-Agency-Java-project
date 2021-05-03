

public class Tour {
    private Price price ;
    private String name ;
    private String location ;
    private TYPE_OF_VOCATION typeOfVocation;
    private String typeOfHotel ;
    private int numberOfPeople;
    private STATE state ;
    private boolean BURN;

    enum TYPE_OF_VOCATION{
        REST,
        EXCURSION,
        SHOPPING
    }

    enum STATE{
        FREE,
        REGISTERED,
        PAYED,
        CANCELED
    }

    public boolean isBURN() {
        return BURN;
    }

    public void setBURN(boolean BURN) {
        this.BURN = BURN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Tour(String name, String location, int numberOfPeople){
        state = STATE.FREE ;
        this.name = name;
        this.location = location;
        this.numberOfPeople = numberOfPeople;
        BURN = false;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public TYPE_OF_VOCATION getTypeOfVocation() {
        return typeOfVocation;
    }

    public void setTypeOfVocation(TYPE_OF_VOCATION typeOfVocation) {
        this.typeOfVocation = typeOfVocation;
    }

    public String getTypeOfHotel() {
        return typeOfHotel;
    }

    public void setTypeOfHotel(String typeOfHotel) {
        this.typeOfHotel = typeOfHotel;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", BURN=" + BURN +
                '}';
    }

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }
}
