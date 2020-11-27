import classes.users.Customer;

import java.util.Date;

public class CustomersCollection {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Anton", new Date(), true, 123);
        Customer c2 = new Customer(2, "Alex", new Date(), true, 234);
        System.out.printf("Сравнение объектов: %d", c1.compareTo(c2));
        System.out.printf("hash: %d %d", c1.hashCode(), c2.hashCode());


    }
}
