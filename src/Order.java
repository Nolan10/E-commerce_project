import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Order {

    private int id;
    private int itemCount = 0;
    private double shippingCost = 10;
    private double totalPrice = 0;
    private boolean alreadyHaveTheDiscount = false;

    public Order(int id) {
        this.id = id;
    }

    private final List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    public void detach(OrderObserver observer){
        observers.remove(observer);
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public int getCount(){
        return itemCount;
    }

    public void addItem(double price) {
        itemCount++;
        totalPrice += price;

        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public boolean isAlreadyHaveTheDiscount() {
        return alreadyHaveTheDiscount;
    }

    public void setAlreadyHaveTheDiscount(boolean alreadyHaveTheDiscount) {
        this.alreadyHaveTheDiscount = alreadyHaveTheDiscount;
    }

    @Override
    public String toString() {
        totalPrice = totalPrice + shippingCost;
        return "Order{" +
                "id=" + id +
                ", itemCount=" + itemCount +
                ", shippingCost=" + shippingCost +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
