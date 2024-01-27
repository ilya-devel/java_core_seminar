package Shop;

import Shop.Classes.Buyer;
import Shop.Classes.Order;
import Shop.Classes.Product;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Generate valid lst orders");

        for (int i = 0; i < 3; i++) {
            LinkedHashMap<Product, Integer> lstPosition = new LinkedHashMap<>();
            for (int j = 0; j < RandomGenerator.getDefault().nextInt(1, 4); j++) {
                lstPosition.put(
                        Product.getLstProducts().get(RandomGenerator.getDefault().nextInt(Product.getLstProducts().size())),
                        RandomGenerator.getDefault().nextInt(1,3));
            }
            try {
                Order order = Order.makePurchase(
                        Buyer.getLstBuyer().get(RandomGenerator.getDefault().nextInt(Buyer.getLstBuyer().size())),
                        lstPosition
                );
                System.out.println(order);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("\nGenerate not valid orders");
        try {
            LinkedHashMap<Product, Integer> lstPosition1 = new LinkedHashMap<>();
            lstPosition1.put(new Product("Milk", 1.33D), 2);
            Order order1 = new Order(new Buyer("Margo", 23, "+790512312333"), lstPosition1);
            Order.makePurchase(new Buyer("Margo", 23, "+790512312333"), lstPosition1);
            System.out.println(order1);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            LinkedHashMap<Product, Integer> lstPosition2 = new LinkedHashMap<>();
            lstPosition2.put(new Product("Coca-Cola", 2.22D), 2);
            Order order2 = new Order(new Buyer("Mary", 25, "+799912512322"), lstPosition2);
            Order.makePurchase(new Buyer("Mary", 25, "+799912512322"), lstPosition2);
            System.out.println(order2);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            LinkedHashMap<Product, Integer> lstPosition3 = new LinkedHashMap<>();
            lstPosition3.put(new Product("Milk", 1.33D), -1);
            Order order3 = new Order(new Buyer("Margo", 23, "+790512312333"), lstPosition3);
            Order.makePurchase(new Buyer("Margo", 23, "+790512312333"), lstPosition3);
            System.out.println(order3);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Count of orders: " + Order.getCountOrders() + "\n");

        LinkedList<Buyer> lstBuyer = Buyer.getLstBuyer();
        Buyer tmp = lstBuyer.get(0);
        System.out.println(tmp);
        tmp.setSex(Buyer.Sex.MALE);
        System.out.println(tmp);
        tmp = lstBuyer.get(2);
        System.out.println(tmp);
        tmp.setSex(Buyer.Sex.FEMALE);
        System.out.println(tmp);


    }
}
