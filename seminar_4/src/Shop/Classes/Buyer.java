package Shop.Classes;

import java.util.LinkedList;

public class Buyer {
    public enum Sex {MALE, FEMALE};
    private String fullName;
    private Integer age;
    private String phoneNumber;
    private Sex sex;

    private static LinkedList<Buyer> lstBuyer = loadDb();

    public Buyer(String fullName, Integer age, String phoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.getFullName() + ", sex: " + this.getSex() + "; phoneNumber: " + this.getPhoneNumber();
    }

    public static Buyer addNewBuyerInDb (Buyer buyer) {
        if (lstBuyer.contains(buyer)) {
            System.out.println("Client is already in db");
        } else {
            lstBuyer.add(buyer);
            System.out.println("Client added in to db");
        }
        return buyer;
    }

    public static LinkedList<Buyer> loadDb () {
        LinkedList<Buyer> lstBuyers = new LinkedList<>();
        lstBuyers.add(new Buyer("Jack", 21, "+799912312322"));
        lstBuyers.add(new Buyer("Roza", 18, "+799912412322"));
        lstBuyers.add(new Buyer("Mary", 25, "+799912512322"));
        lstBuyers.add(new Buyer("Liza", 31, "+799912612322"));
        return lstBuyers;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Buyer &&
                this.getFullName().equals(((Buyer) obj).getFullName()) &&
                this.getPhoneNumber().equals(((Buyer) obj).getPhoneNumber()) &&
                this.getAge().equals(((Buyer) obj).getAge());
    }

    public static LinkedList<Buyer> getLstBuyer() {
        return lstBuyer;
    }

    public static String lstBuyerToString () {
        StringBuilder row = new StringBuilder();
        for (Buyer buyer: lstBuyer) {
            row.append(buyer + "\n");
        }
        return row.toString();
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
