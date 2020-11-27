package classes.users;

import java.util.Date;

public class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private Date birthDate;
    private boolean isActive;
    private double balance;

    public Customer(int id, String name, Date birthDate, boolean isActive, double balance) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.isActive = isActive;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", isActive=" + isActive +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        //Customer c = (Customer)o;
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Customer) {
            Customer c = (Customer)obj;
            if (name != null && name.equals(c.name) &&
                    id == c.id &&
                    birthDate!= null && birthDate.equals(c.birthDate) &&
                    isActive == c.isActive &&
                    balance == c.balance) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        int name_hash = name.hashCode();
        return name_hash ^ id ^ birthDate.hashCode() ^ new Double(balance).hashCode() ^ new Boolean(isActive).hashCode();
    }
}
