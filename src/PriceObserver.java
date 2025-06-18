public class PriceObserver implements OrderObserver{

    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200 && !order.isAlreadyHaveTheDiscount()) {
            order.setTotalPrice(order.getTotalPrice() - 20);
            order.setAlreadyHaveTheDiscount(true);
            System.out.println("PriceObserver: Discount of $20 applied. New total: $" + order.getTotalPrice());
        }
    }
}
