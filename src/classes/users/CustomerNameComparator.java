package classes.users;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {
    private boolean isAscending;

    public CustomerNameComparator() {
        this(true);
    }

    public CustomerNameComparator(boolean isAscending) {
        this.isAscending = isAscending;
    }

    @Override
    public int compare(Customer o1, Customer o2) {
        int res;
        if (isAscending) res = o1.getName().compareTo(o2.getName());
        else res = o2.getName().compareTo(o1.getName());
        return res;
    }

    public boolean isAscending() {
        return isAscending;
    }

    public void setAscending(boolean ascending) {
        isAscending = ascending;
    }
}
