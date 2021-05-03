public class Main {
    public static void main(String[] args) {
        TourCatalog catalog = new TourCatalog();
        catalog.add(new Tour("Fifa", "Bolgaria", 2));
        catalog.add(new Tour("Voda", "Slovenia", 3));
        catalog.add(new Tour("Lviv", "Ukraine", 2));
        catalog.showAllTours();
        Manager manager = new Manager("badGuy", "123", "df@io.com");
        Tour t = catalog.getTour("Lviv");
        if (t != null)
            manager.setTour_BURN(t);
        System.out.println("~~~~~~~~~~~");
        catalog.showAllTours();
        Admin admin = new Admin("admin777", "098", "dog_ate_my_wife@rota.pa") ;
        admin.deleteTour(catalog, catalog.getTour("Voda"));
        System.out.println("~~~~~~~~~~~");
        catalog.showAllTours();
    }
}
