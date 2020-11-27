import classes.users.Customer;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilesDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Anton", new Date(), true, 1234);
        Customer c2 = new Customer(2, "Alex", new Date(), true, 234);

        String userDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();
        System.out.println("current dir - " + userDirectory);

        final String filePath = "customers.dat";

        ArrayList objList = readObjectListFromFile(filePath);
        System.out.println(objList);

//        ArrayList<Customer> customers = new ArrayList<>();
//        customers.add(c1);
//        customers.add(c2);
//        writeObjectListToFile(customers, filePath);
    }
    public static ArrayList readObjectListFromFile(String filepath) {
        ArrayList objectList = new ArrayList();

        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            Object obj;
            do {
                obj = objIn.readObject();
                if (obj != null) objectList.add(obj);
            } while (obj != null);

        } catch (EOFException e) {
            System.out.println("Достигнут конец файла");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return objectList;
    }
    public static void writeObjectListToFile(List objectsList, String filepath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            for (Object o : objectsList) {
                objectOut.writeObject(o);
            }
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
