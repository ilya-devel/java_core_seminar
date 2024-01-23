package homeworks.Organization;

public class BaseOrganization {
    private String name;

    public BaseOrganization(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
