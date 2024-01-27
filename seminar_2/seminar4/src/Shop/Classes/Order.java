package Shop.Classes;

import Shop.Exceptions.WrongBuyerException;
import Shop.Exceptions.WrongProductException;
import Shop.Logging;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Order {
    private Buyer customer;
    private LinkedHashMap<Product, Integer> positions;
    private Integer orderId;
    static private Integer id = 0;
    static private LinkedList<Order> orders = new LinkedList<>();
    private static Logging log = new Logging("Orders.txt");

    public Order(Buyer customer, LinkedHashMap<Product, Integer> positions) {
        this.customer = customer;
        this.positions = positions;
        this.orderId = id;
        id++;
    }

    public static Order makePurchase(Buyer buyer, LinkedHashMap<Product, Integer> lstPosition) throws Exception {
        Order.isValid(buyer, lstPosition);
        Order order = new Order(buyer, lstPosition);
        orders.add(order);
        log.logging(order.toString());
        return order;
    }

    public static LinkedList<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", positions=" + this.getLstPosition() +
                ", orderId=" + orderId +
                '}';
    }

    private String getLstPosition () {
        StringBuilder lstPosition = new StringBuilder();
        for (Product key: this.positions.keySet()) {
            lstPosition.append(key + " - " + positions.get(key) + "qt; ");
        }
        return lstPosition.toString();
    }

    private static Boolean isValid (Buyer buyer, LinkedHashMap<Product, Integer> lstPosition) throws Exception {
        if (!(Buyer.getLstBuyer().contains(buyer))) {
            throw new WrongBuyerException("Buyer is not found in Buyer db");
        }
        for (Product key: lstPosition.keySet()) {
            if (!(Product.getLstProducts().contains(key))) {
                throw new WrongProductException("Product is not found in Product db");
            }
            if (lstPosition.get(key) <= 0) {
                throw new WrongProductException("The quantity cannot be equal to or less than zero");
            }
        }
        return true;
    }

    public static void showOrders () {
        for (Order order: orders) {
            System.out.println(order);
        }
    }

    public static Integer getCountOrders() {
        return orders.size();
    }
}
