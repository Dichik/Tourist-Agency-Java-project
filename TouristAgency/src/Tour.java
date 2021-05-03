

public class Tour {
    private Price price ;
    private String name ;
    private String location ;
    private TYPE_OF_VOCATION typeOfVocation;
    private String typeOfHotel ;
    private int numberOfPeople;
    private STATE state ;

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
    public Tour(String name, String location, int numberOfPeople){
        state = STATE.FREE ;
        this.name = name;
        this.location = location;
        this.numberOfPeople = numberOfPeople;
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

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }
}
