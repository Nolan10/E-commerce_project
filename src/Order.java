import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Order {

    private int itemCount = 0;
    private double itemCost = 0;
    private double shippingCost = 10;
    private double totalPrice = 0;

    private final List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver observer){

    }

    public void detach(OrderObserver observer){
    }

    public double getTotalPrice(){
        return 0;
    }

    public int getCount(){
        return 0;
    }

    @Override
    public String toString() {
        return "Order{}";
    }
}
