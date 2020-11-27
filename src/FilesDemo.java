import classes.users.Customer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.util.Date;

public class FilesDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Anton", new Date(), true, 1234);
        Customer c2 = new Customer(2, "Alex", new Date(), true, 234);

        String userDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();
        System.out.println("current dir - " + userDirectory);

        final String filePath = "customers.dat";
        writeObjectToFile(c1, filePath);
    }
    public static void writeObjectToFile(Object serObj, String filepath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
