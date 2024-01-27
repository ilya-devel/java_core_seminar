package Shop.Classes;

import java.util.LinkedList;

public class Product {
    private String name;
    private Double price;

    private static LinkedList<Product> lstProducts = loadLstProductFromDb();

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getName() + ", price: " + this.getPrice();
    }

    public static LinkedList<Product> loadLstProductFromDb () {
        LinkedList<Product> lstProducts = new LinkedList<>();
        lstProducts.add(new Product("Milk", 1.33D));
        lstProducts.add(new Product("Orange", 3.33D));
        lstProducts.add(new Product("Potato", 0.33D));
        lstProducts.add(new Product("Tomato", 0.53D));
        lstProducts.add(new Product("Egg*10", 1.82D));
        return lstProducts;
    }
    public static Product addNewProductInDb (Product product) {
        if (lstProducts.contains(product)) {
            System.out.println("Product is already in db");
        } else {
            lstProducts.add(product);
            System.out.println("Product added in to db");
        }
        return product;
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Product &&
                this.getPrice().equals(((Product) obj).getPrice()) &&
                this.getName().equals(((Product) obj).getName());
    }

    public static LinkedList<Product> getLstProducts() {
        return lstProducts;
    }

    public static String lstBuyerToString () {
        StringBuilder row = new StringBuilder();
        for (Product product: lstProducts) {
            row.append(product + "\n");
        }
        return row.toString();
    }
}
