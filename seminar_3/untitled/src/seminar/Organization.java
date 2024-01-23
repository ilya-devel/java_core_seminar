package seminar;

import java.util.LinkedList;

public class Organization extends BaseOrganization{
    private LinkedList<Branch> branches;

    public Organization(String name, String address, Employee generalManager) {
        super(name, address, generalManager);
        this.branches = new LinkedList<>();
    }

    public void addBranch(Branch branch) {
        this.branches.add(branch);
        branch.setMainOffice(this);
        System.out.println("Add branch: " + branch);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                '}';
    }
}
