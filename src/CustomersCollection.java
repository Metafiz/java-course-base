import classes.users.Customer;
import classes.users.CustomerBalanceComparator;
import classes.users.CustomerNameComparator;

import java.util.*;

public class CustomersCollection {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Anton", new Date(), true, 1234);
        Customer c2 = new Customer(2, "Alex", new Date(), true, 234);
        System.out.printf("Сравнение объектов: %d\n", c1.compareTo(c2));
        System.out.printf("hash: %d %d\n", c1.hashCode(), c2.hashCode());

        // применение компараторов для сравнения по различным полям
        Comparator<Customer> nameComparator = new CustomerNameComparator(false);
        Comparator<Customer> balanceComparator = new CustomerBalanceComparator();
        Set<Customer> customerSet = new TreeSet<>( nameComparator );
        customerSet.add(c1);
        customerSet.add(c2);
        customerSet.add(new Customer(3, "Ivan", new Date(), false, 345));
        customerSet.add(new Customer(4, "Mahsa", new Date(), true, 156));
        for (Customer c : customerSet) {
            System.out.printf("%s \n", c.getName());
        }

        Set<Customer> customerSet2 = new TreeSet<>( balanceComparator );
        customerSet2.addAll(customerSet);

        for (Customer c : customerSet2) {
            System.out.printf("%s, %.2f \n", c.getName(), c.getBalance());
        }

        // работа с ассоциативным массивом (словарём)
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
