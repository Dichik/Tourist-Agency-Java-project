public class Admin extends Manager {

    public Admin(String login, String password, String email) {
        super(login, password, email);
    }

    public void deleteTour(TourCatalog catalog, Tour tour) {
        catalog.remove(tour);
    }

    public void addTour(TourCatalog catalog, Tour tour) {
        catalog.add(tour);
    }
    public void changeInformation(){

    }
    public void blockClient(Client client){
        client.setBaned(true);
    }
    public void unblockClient(Client client){
        client.setBaned(false);
    }
}
