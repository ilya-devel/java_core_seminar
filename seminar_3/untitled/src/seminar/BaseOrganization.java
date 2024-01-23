package seminar;

import java.util.LinkedList;

public class BaseOrganization {
    private String name;
    private String address;
    private Employee generalManager;

    public BaseOrganization(String name, String address, Employee generalManager) {
        this.name = name;
        this.address = address;
        this.generalManager = generalManager;
    }

    @Override
    public String toString() {
        return "BaseOrganization{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Employee getGeneralManager() {
        return generalManager;
    }
}
