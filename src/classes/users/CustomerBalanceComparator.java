package classes.users;

import java.util.Comparator;

public class CustomerBalanceComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        int result = 0;
        if (o1.getBalance() > o2.getBalance()) result = 1;
        else if (o1.getBalance() < o2.getBalance()) result = -1;
        return result;
    }
}
