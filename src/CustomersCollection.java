import classes.users.Customer;

import java.util.*;

public class CustomersCollection {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Anton", new Date(), true, 123);
        Customer c2 = new Customer(2, "Alex", new Date(), true, 234);
        System.out.printf("Сравнение объектов: %d", c1.compareTo(c2));
        System.out.printf("hash: %d %d", c1.hashCode(), c2.hashCode());

        Map<String, Customer> users = new TreeMap<>();
        users.put("one", c1);
        users.put("two", c2);
        users.put("three", new Customer(3, "Ivan", new Date(), false, 345));
        users.put("four", new Customer(4, "Mahsa", new Date(), true, 456));

        System.out.println("Кол-во элементов = " + users.size());
        Set<String> keys = users.keySet();
        System.out.println("Keys: " + keys);

        Collection<Customer> vals = users.values();
        System.out.println("Vals: " + vals);

        Set setEntries = users.entrySet();
        System.out.println("entries: " + setEntries);
        for (String key : keys) {
            System.out.printf("%s = %s \n", key, users.get(key).getName());
        }
    }
}
