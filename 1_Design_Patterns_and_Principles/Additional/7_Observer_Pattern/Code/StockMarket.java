import java.util.ArrayList;

public class StockMarket implements Stock {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void register(Observer o) {
        observers.add(o);
        System.out.println("Observer registered: " + o.getClass().getSimpleName());
    }
    public void deregister(Observer o) {
        observers.remove(o);
        System.out.println("Observer deregistered: " + o.getClass().getSimpleName());
    }
    public void notifying() {
        for (Observer o : observers) {
            o.update( "StockMarket" );
        }
    }
    
}
