import javax.swing.*;
import java.util.Scanner;
public class Q3 {
    static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.println("Enter Your First name : ");
        String firstName = name.next();

        System.out.println("Enter Your middle name : ");
        String middleName = name.next();

        System.out.println("Enter Your Last name : ");
        String lastName = name.next();
        System.out.println(firstName + " " + middleName.substring(0, 1) + " " + lastName);
    }
}
