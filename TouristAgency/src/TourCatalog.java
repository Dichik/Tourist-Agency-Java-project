import java.util.HashSet;
import java.util.Set;

public class TourCatalog {
    private Set<Tour> tours;

    public TourCatalog(){
        tours = new HashSet<>() ;
    }

    public void add(Tour tour) {
        tours.add(tour) ;
    }

    public void remove(Tour tour) {
        tours.remove(tour) ;
    }

    public void showAllTours(){
        Tour[] arrayOfTours = new Tour[tours.size()] ;
        tours.toArray(arrayOfTours) ;
        for(int i = 0 ; i < tours.size() ; i ++ ){
            System.out.println(arrayOfTours[i].toString());
        }
    }

    public Tour getTour(String name) {
        Tour[] arrayOfTours = new Tour[tours.size()] ;
        tours.toArray(arrayOfTours) ;
        for(int i = 0 ; i < tours.size() ; i ++ ){
            if(arrayOfTours[i].getName().equals(name)){
                return arrayOfTours[i] ;
            }
        }
        return null;
    }
}
