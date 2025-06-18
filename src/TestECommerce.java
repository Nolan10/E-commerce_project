//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestECommerce {
    public static void main(String[] args) {
        Order order = new Order(1);

        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

        order.addItem(50);
        order.addItem(60);
        order.addItem(40);
        order.addItem(30);
        order.addItem(20);
        order.addItem(50);
        order.addItem(10);

        System.out.println("Final order: " + order);

    }
}