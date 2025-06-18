public class QuantityObserver implements OrderObserver{

    @Override
    public void update(Order order) {
        if (order.getCount() > 5){
            order.setShippingCost(0);
            System.out.println("QuantityObserver: Free shipping applied.");
        }else {
            order.setShippingCost(10);
        }
    }
}
